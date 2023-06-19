import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    private Author testAuthor;

    @BeforeEach
    void setUp() {
        testAuthor = new Author("Brandeis Hill Marshall","marshall@ncu.edu","Chapel Hill,NC");

    }

    @Test
    void getName() {
        String expectedName = "Brandeis Hill Marshall";
        assertEquals(expectedName,testAuthor.getName());

    }

    @Test
    void getEmail() {
        String expectedEmail = "marshall@ncu.edu";
        assertEquals(expectedEmail,testAuthor.getEmail());
    }

    @Test
    void getAddress() {
        String expectedAddress = "Chapel Hill,NC";
        assertEquals(expectedAddress,testAuthor.getAddress());


    }
}
