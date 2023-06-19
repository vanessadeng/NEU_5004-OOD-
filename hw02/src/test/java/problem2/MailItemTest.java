package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailItemTest {


    private int expectedWidth;
    private int expectedHeight;
    private int expectedDepth;
    private Recipient testRecipient;
    private MailItem testMailItem;
    @BeforeEach
    void setUp() throws IllegalDimensionException{
        testRecipient = new Recipient("Lionel", "Messi", "lionel@outlook.com");
        testMailItem = new MailItem(8, 8, 8, testRecipient);
        expectedWidth = 8;
        expectedHeight = 8;
        expectedDepth = 8;

        Exception IllegalDimensionException = assertThrows(Exception.class,
                () -> testMailItem = new MailItem(-15, 10, 5, testRecipient));
        assertEquals("Invalid input!", IllegalDimensionException.getMessage());

        Exception IllegalDimensionException1 = assertThrows(Exception.class,
                () -> testMailItem = new MailItem(15, -10, 5, testRecipient));
        assertEquals("Invalid input!", IllegalDimensionException1.getMessage());

        Exception IllegalDimensionException2 = assertThrows(Exception.class,
                () -> testMailItem = new MailItem(15, 10, -5, testRecipient));


    }

    @Test
    void getWidth() {
        assertEquals(expectedWidth, testMailItem.getWidth());
    }

    @Test
    void setWidth() throws IllegalDimensionException {
        testMailItem.setWidth(50);
        assertEquals(50, testMailItem.getWidth());
        Exception IllegalDimensionException = assertThrows(Exception.class,
                () -> testMailItem.setWidth(-15));
        assertEquals("Invalid input!", IllegalDimensionException.getMessage());
    }

    @Test
    void getHeight() {
        assertEquals(expectedHeight, testMailItem.getHeight());
    }

    @Test
    void setHeight() throws IllegalDimensionException {
        testMailItem.setHeight(50);
        assertEquals(50, testMailItem.getHeight());
        Exception IllegalDimensionException = assertThrows(Exception.class,
                () -> testMailItem.setHeight(-15));
        assertEquals("Invalid input!", IllegalDimensionException.getMessage());
    }

    @Test
    void getDepth() {
        assertEquals(expectedDepth, testMailItem.getDepth());
    }

    @Test
    void setDepth() throws IllegalDimensionException {
        testMailItem.setDepth(50);
        assertEquals(50, testMailItem.getDepth());

        Exception IllegalDimensionException = assertThrows(Exception.class,
                () -> testMailItem.setDepth(-15));
    }

    @Test
    void getCurrentRecipient() {
        assertEquals(testRecipient, testMailItem.getCurrentRecipient());
    }

    @Test
    void setCurrentRecipient() {
        Recipient newTestRecipient = new Recipient("Lionel", "Messi", "lionel@123.com");
        testMailItem.setCurrentRecipient(newTestRecipient);
        assertEquals(newTestRecipient, testMailItem.getCurrentRecipient());

    }

    @Test
    void testEquals_SameObject() {
        assertTrue(testMailItem.equals(testMailItem));
    }

    @Test
    void testEquals_DifferentClass() {
        assertFalse(testMailItem.equals(null));
    }

    @Test
    void testEquals_DifferentDataTypes() {
        assertFalse(testMailItem.equals(testRecipient));
    }



    @Test
    void testEquals_SameFields() throws IllegalDimensionException{
        MailItem testMailItem2 = new MailItem(8, 8, 8, testRecipient);
        assertTrue(testMailItem.equals(testMailItem2));
    }
    @Test
    void testEquals_DifferentWidth() throws IllegalDimensionException{
        MailItem testMailItem3 = new MailItem(10, 8, 8, testRecipient);
        assertFalse(testMailItem.equals(testMailItem3));
    }
    @Test
    void testEquals_DifferentHeight() throws IllegalDimensionException{
        MailItem testMailItem4 = new MailItem(8, 10, 8, testRecipient);
        assertFalse(testMailItem.equals(testMailItem4));
    }

    @Test
    void testEquals_DifferentDepth() throws IllegalDimensionException{
        MailItem testMailItem5 = new MailItem(8, 8, 10, testRecipient);
        assertFalse(testMailItem.equals(testMailItem5));
    }

    @Test
    void testEquals_DifferentRecipient() throws IllegalDimensionException{
        Recipient newTestRecipient = new Recipient("Moura", "Lucas", "lucas@123.com");
        MailItem testMailItem6 = new MailItem(8, 8, 8, newTestRecipient);
        assertFalse(testMailItem.equals(testMailItem6));
    }

    @Test
    void testHashCode() throws IllegalDimensionException {
        MailItem testMailItem7 = new MailItem(8, 8, 8, testRecipient);
        assertEquals(testMailItem.hashCode(), testMailItem7.hashCode());
    }
    @Test
    void testToString() {
        String expected = "MailItem{" +
                "width=" + testMailItem.getWidth() +
                ", height=" + testMailItem.getHeight() +
                ", depth=" + testMailItem.getDepth() +
                ", currentRecipient=" + testMailItem.getCurrentRecipient() +
                '}';
        assertEquals(expected, testMailItem.toString());

    }
}