package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    Author testAuthor;

    @BeforeEach
    void setUp() {
        testAuthor = new Author("John", "Doe");
    }

    @Test
    void getFirstName() {
        assertEquals("John", testAuthor.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Doe", testAuthor.getLastName());
    }

    @Test
    void testEquals() {

    }

    @Test
    void testHashCode() {
        Author author1 = new Author("John", "Doe");
        Author author2 = new Author("John", "Doe");
        assertEquals(author1.hashCode(), author2.hashCode());
    }

    @Test
    void testToString() {
        assertEquals("Author{firstName='John', lastName='Doe'}", testAuthor.toString());
    }


}