package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipientTest {

    private Recipient testRecipient;
    private String expectedFirstName;
    private String expectedLastName;
    private String expectedEmailAddress;

    @BeforeEach
    void setUp() {

        testRecipient = new Recipient("Vanessa", "Deng", "vanessa@123.com");
        expectedFirstName = "Vanessa";
        expectedLastName = "Deng";
        expectedEmailAddress = "vanessa@123.com";

    }

    @Test
    void getFirstName() {
        assertEquals(expectedFirstName, testRecipient.getFirstname());

    }

    @Test
    void setFirstName() {
        testRecipient.setFirstname("Logan");
        assertEquals("Logan", testRecipient.getFirstname());

    }

    @Test
    void getLastName() {
        assertEquals(expectedLastName, testRecipient.getLastname());
    }

    @Test
    void setLastName() {
        testRecipient.setLastname("Wang");
        assertEquals("Wang", testRecipient.getLastname());
    }

    @Test
    void getEmailAddress() {
        assertEquals(expectedEmailAddress, testRecipient.getEmailAddress());
    }

    @Test
    void setEmailAddress() {
        testRecipient.setEmailAddress("loganzhang@123.com");
        assertEquals("loganzhang@123.com", testRecipient.getEmailAddress());
    }

    @Test
    void testEquals_sameObject() {
        assertTrue(testRecipient.equals(testRecipient));
    }

    @Test
    void testEquals_NullObjects(){
        assertFalse(testRecipient.equals(null));
    }


    @Test
    void testEquals_DifferentDataTypes(){
        assertFalse(testRecipient.equals("String"));
    }

    @Test
    void testEquals_SameFields(){
        Recipient testRecipient2 = new Recipient("Vanessa", "Deng", "vanessa@123.com");
        assertTrue(testRecipient.equals(testRecipient2));}

    @Test
    void testEquals_DifferentFirstName(){

        Recipient testRecipient2 = new Recipient("Logan", "Deng", "vanessa@123.com");
        assertFalse(testRecipient.equals(testRecipient2));
    }
    @Test
    void testEquals_DifferentLastName(){
        Recipient testRecipient2 = new Recipient("Vanessa", "Wang", "vanessa@123.com");
        assertFalse(testRecipient.equals(testRecipient2));
    }

    @Test
    void testEquals_DifferentEmailAddress(){
        Recipient testRecipient2 = new Recipient("Vanessa", "Deng", "logan@123.com");
        assertFalse(testRecipient.equals(testRecipient2));
    }


    @Test
    void testHashCode() {
        Recipient testRecipient4 = new Recipient("Vanessa", "Deng", "vanessa@123.com");
        assertEquals(testRecipient.hashCode(), testRecipient4.hashCode());
    }

    @Test
    void testToString() {

        String expected = "Recipient{" +
                "firstname='" + testRecipient.getFirstname() + '\'' +
                ", lastname='" + testRecipient.getLastname() + '\'' +
                ", emailAddress='" + testRecipient.getEmailAddress() + '\'' +
                '}';
        assertEquals(expected, testRecipient.toString());
    }
}