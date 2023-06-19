package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private Credentials testCredentials;
    private User testUser;





    @BeforeEach
    void setUp() {
        testCredentials = new Credentials("Vanessa Deng", "9691c818170472bad03dc1d3129c879f");

        testUser = new User("Logan", "Zhang", "1234567890", "logan@northeastern.edu", testCredentials);
    }

    @Test
    void getFirstName() {
        assertEquals("Logan", testUser.getFirstName());
    }

    @Test
    void setFirstName() {
        testUser.setFirstName("Wanda");
        assertEquals("Wanda", testUser.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Zhang", testUser.getLastName());
    }

    @Test
    void setLastName() {
        testUser.setLastName("Rebecca");
        assertEquals("Rebecca", testUser.getLastName());
    }

    @Test
    void getPhoneNumber() {
        assertEquals("1234567890", testUser.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        testUser.setPhoneNumber("123542");
        assertEquals("Not a phone number.", testUser.getPhoneNumber());

        testUser.setPhoneNumber("1234554321");
        assertEquals("1234554321", testUser.getPhoneNumber());


    }

    @Test
    void getEmail() {
        assertEquals("logan@northeastern.edu", testUser.getEmail());
    }

    @Test
    void setEmail() {
        testUser.setEmail("daniel@outlook.com");
        assertEquals("daniel@outlook.com", testUser.getEmail());
    }

    @Test
    void getCredentials() {
        Credentials expectedCredentials = new Credentials("Vanessa Deng", "9691c818170472bad03dc1d3129c879f");
        assertEquals(expectedCredentials.getUsername(), testUser.getCredentials().getUsername());
        assertEquals(expectedCredentials.getPasswordHash(), testUser.getCredentials().getPasswordHash());
    }

    @Test
    void setCredentials() {
        Credentials newCredentials = new Credentials("Merida Moore", "f90d8217cf58fa48e36b3676191c5737");
        testUser.setCredentials(newCredentials);
        assertEquals(newCredentials.getUsername(), testUser.getCredentials().getUsername());
        assertEquals(newCredentials.getPasswordHash(), testUser.getCredentials().getPasswordHash());
    }
}