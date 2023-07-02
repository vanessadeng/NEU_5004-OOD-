package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NonEmptyBookCatalogTest {


    NonEmptyBookCatalog testNonEmptyBookCatalog;
    String[] authors = {"jane", "john"};
    Book testBook = new Book("bookTitle", "jane", authors, BookType.PAPERBACK, LocalDate.of(2000, 3, 19), LocalDate.of(2000, 3, 19), 1, 1, 1);
    Book testBook2 = new Book("bookTitle2", "john2", authors, BookType.PAPERBACK, LocalDate.of(2023, 3, 19), LocalDate.of(2000, 3, 19), 1, 1, 1);
    @BeforeEach
    void setUp() {
        testNonEmptyBookCatalog = new NonEmptyBookCatalog(testBook, new EmptyBookCatalog());

    }
    @Test
    void contains() {
        assertTrue(testNonEmptyBookCatalog.contains("jane"));
    }

    @Test
    void addBook() {
        BookCatalog bookCatalog = testNonEmptyBookCatalog.addBook(testBook2);
        assertTrue(bookCatalog.contains("john2"));
    }

    @Test
    void findBooksOfTypeAndRequests() {
        BookCatalog bookCatalog = testNonEmptyBookCatalog.findBooksOfTypeAndRequests("PAPERBACK", 50);
        assertFalse(bookCatalog.contains("jane"));
    }

    @Test
    void findBooksOfID() throws BookNotFoundException {
        Exception exception = assertThrows(BookNotFoundException.class, () -> {
            testNonEmptyBookCatalog.findBooksOfID("beep");
        });
    }
}