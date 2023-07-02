package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmptyBookCatalogTest {

    EmptyBookCatalog emptyBookCatalog;
    String[] authors = {"jane", "john"};
    Book testBook = new Book("bookTitle", "jane", authors, BookType.PAPERBACK, LocalDate.of(2000, 3, 19), LocalDate.of(2000, 3, 19), 1, 1, 1);



    @BeforeEach
    void setUp() {
        emptyBookCatalog = new EmptyBookCatalog();
    }

    @Test
    void contains() {
        assertFalse(emptyBookCatalog.contains("bookTitle"));
    }

    @Test
    void addBook() {
        BookCatalog bookCatalog = emptyBookCatalog.addBook(testBook);
        assertTrue(bookCatalog.contains("jane"));

    }

    @Test
    void findBooksOfTypeAndRequests() {
        BookCatalog bookCatalog = emptyBookCatalog.findBooksOfTypeAndRequests("PAPERBACK", 1);
        assertTrue(bookCatalog.isEmpty());
    }

    @Test
    void findBooksOfID() throws BookNotFoundException {
        Exception exception = assertThrows(BookNotFoundException.class, () -> {
            emptyBookCatalog.findBooksOfID("beep");
        });
    }


}

