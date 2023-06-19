package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredentialsTest {
    private Credentials testCredentials;

    @BeforeEach
    void setUp() {
        testCredentials = new Credentials("Vanessa Deng", "56ccf274c");
    }

    @Test
    void getUsername() {
        assertEquals("Vanessa Deng", testCredentials.getUsername());
    }

    @Test
    void setUsername() {
        testCredentials.setUsername("Logan Zhang");
        assertEquals("Logan Zhang", testCredentials.getUsername());
    }

    @Test
    void getPasswordHash() {
        assertEquals("56ccf274c", testCredentials.getPasswordHash());
    }

    @Test
    void setPasswordHash() {
        testCredentials.setPasswordHash("1c8d5900542");
        assertEquals("1c8d5900542", testCredentials.getPasswordHash());
    }
}