package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Author testAuthor;
    private Book testBook;


    @BeforeEach
    void setUp() {
        testAuthor = new Author("John", "Doe");
        testBook = new Book(testAuthor, "The Book", 1999);
    }

    @Test
    void getCreator() {
        assertEquals(testAuthor, testBook.getCreator());
    }

    @Test
    void getTitle() {
        assertEquals("The Book", testBook.getTitle());
    }

    @Test
    void getYear() {
        assertEquals(1999, testBook.getYear());
    }

    @Test
    void testEquals_Null() {
        assertFalse(testBook.equals(null));
    }

    @Test
    void testEquals_SameObjects() {
        assertTrue(testBook.equals(testBook));
    }

    @Test
    void testEquals_DifferentFields() {
        Author testAuthor2 = new Author("John", "Doe");
        Book testBook2 = new Book(testAuthor2, "The Books", 1999);
        assertFalse(testBook.equals(testBook2));
    }


    @Test
    void testEquals_DifferentType() {
        assertFalse(testBook.equals("test"));
    }


    @Test
    void testHashCode() {
        Book book1 = new Book(testAuthor, "The Book", 1999);
        Book book2 = new Book(testAuthor, "The Book", 1999);
        assertEquals(book1.hashCode(), book2.hashCode());
    }
}