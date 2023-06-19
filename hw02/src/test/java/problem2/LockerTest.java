package problem2;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LockerTest {

    private int expectedMaxWidth;
    private int expectedMaxHeight;
    private int expectedMaxDepth;
    private MailItem testMailItem;
    private Recipient testRecipient;
    private MailItem defaultItemInLocker;
    private Locker testLocker;

    @BeforeEach
    void setUp() throws IllegalDimensionException{
        testRecipient = new Recipient("Lionel", "Messi", "liomessi@psg.edu");
        testMailItem = new MailItem(8, 8, 8, testRecipient);
        testLocker = new Locker(10, 25, 20);
        expectedMaxWidth = 10;
        expectedMaxHeight = 25;
        expectedMaxDepth = 20;
        defaultItemInLocker = null;


        Exception IllegalLengthException = assertThrows(IllegalDimensionException.class,
                () -> testLocker = new Locker(-15, 25, 20));
        assertEquals("Invalid input!", IllegalLengthException.getMessage());

        Exception IllegalLengthException1 = assertThrows(Exception.class,
                () -> testLocker = new Locker(15, -25, 20));
        assertEquals("Invalid input!", IllegalLengthException1.getMessage());

        Exception IllegalLengthException2 = assertThrows(Exception.class,
                () -> testLocker = new Locker(15, 25, -20));
        assertEquals("Invalid input!", IllegalLengthException2.getMessage());
    }

    @Test
    void getMaxWidth() {
        assertEquals(expectedMaxWidth, testLocker.getMaxWidth());
    }

    @Test
    void setMaxWidth() throws IllegalDimensionException {
        testLocker.setMaxWidth(50);
        assertEquals(50, testLocker.getMaxWidth());

        // exception case where maximum width value is below 1
        Exception IllegalLengthException = assertThrows(Exception.class,
                () -> testLocker.setMaxWidth(0));
        assertEquals("Invalid input!", IllegalLengthException.getMessage());
    }

    @Test
    void getMaxHeight() {
        assertEquals(expectedMaxHeight, testLocker.getMaxHeight());
    }

    @Test
    void setMaxHeight() throws IllegalDimensionException{
        testLocker.setMaxHeight(80);
        assertEquals(80, testLocker.getMaxHeight());


        Exception IllegalLengthException = assertThrows(Exception.class,
                () -> testLocker.setMaxHeight(0));
        assertEquals("Invalid input!", IllegalLengthException.getMessage());
    }

    @Test
    void getMaxDepth() {
        assertEquals(expectedMaxDepth, testLocker.getMaxDepth());
    }

    @Test
    void setMaxDepth() throws IllegalDimensionException{
        testLocker.setMaxDepth(100);
        assertEquals(100, testLocker.getMaxDepth());


        Exception IllegalLengthException = assertThrows(Exception.class,
                () -> testLocker.setMaxDepth(0));
        assertEquals("Invalid input!", IllegalLengthException.getMessage());
    }

    @Test
    void getItemInLocker() {

        assertEquals(null, testLocker.getItemInLocker());
    }

    @Test
    void setItemInLocker() throws IllegalDimensionException{
        Recipient newTestRecipient = new Recipient("Chris", "Ronaldo", "cr7@manu.edu");
        MailItem newTestMailItem = new MailItem(5, 5, 5, newTestRecipient);
        testLocker.setItemInLocker(newTestMailItem);
        assertEquals(newTestMailItem, testLocker.getItemInLocker());
    }

    @Test
    void addMail() throws IllegalDimensionException, exceedDimensionException, lockerOccupiedException {
        Recipient newTestRecipient = new Recipient("Chris", "Ronaldo", "cr7@manu.edu");
        MailItem newTestMailItem = new MailItem(30, 50, 55, newTestRecipient);
        MailItem newTestMailItemInvalidWidth = new MailItem(70, 20, 10, newTestRecipient);
        MailItem newTestMailItemInvalidHeight = new MailItem(10, 90, 20, newTestRecipient);
        MailItem newTestMailItemInvalidDepth = new MailItem(10, 25, 65, newTestRecipient);
        testLocker.addMail((testMailItem));
        assertEquals(testMailItem, testLocker.getItemInLocker());
        Exception lockerOccupiedException = assertThrows(Exception.class,
                () -> testLocker.addMail(newTestMailItemInvalidWidth));
        assertEquals("The locker is occupied!", lockerOccupiedException.getMessage());
        testLocker.setItemInLocker(null);
        Exception exceedDimensionException = assertThrows(Exception.class,
                () -> testLocker.addMail(newTestMailItemInvalidWidth));
        assertEquals("Unable to put it in!", exceedDimensionException.getMessage());
        Exception exceedDimensionException1 = assertThrows(Exception.class,
                () -> testLocker.addMail(newTestMailItemInvalidHeight));
        assertEquals("Unable to put it in!", exceedDimensionException1.getMessage());
        // exception case where the mail has larger depth than the locker
        Exception exceedDimensionException2 = assertThrows(Exception.class,
                () -> testLocker.addMail(newTestMailItemInvalidDepth));
        assertEquals("Unable to put it in!", exceedDimensionException2.getMessage());
    }

    @Test
    void pickupMail()
            throws IllegalPickUpException, exceedDimensionException, lockerOccupiedException {
        Recipient newTestRecipient = new Recipient("Chris", "Ronaldo", "cr7@manu.edu");
        testLocker.addMail(testMailItem);
        // able to pick up the item since the recipient of the mail and the given recipient match
        assertEquals(testMailItem, testLocker.pickupMail(testRecipient));

        // exception case when the given recipient does not match with recipient of the mail in the locker
        Exception IllegalPickUpException = assertThrows(Exception.class,
                () -> testLocker.pickupMail(newTestRecipient));
        assertEquals("Not able to pick up!", IllegalPickUpException.getMessage());
        // exception case when there is no item in the locker
        testLocker.setItemInLocker(null);
        Exception IllegalPickUpException1 = assertThrows(Exception.class,
                () -> testLocker.pickupMail(testRecipient));
        assertEquals("Not able to pick up!", IllegalPickUpException1.getMessage());
    }

    @Test
    void testEquals_SameMemoryLocation() {
        assertTrue(testLocker.equals(testLocker));
    }

    @Test
    void testEquals_NullObject() {
        assertFalse(testLocker.equals(null));
    }

    @Test
    void testEquals_DifferentDataTypes() {
        Recipient newTestRecipient = new Recipient("Lucas", "Moura", "lucasMoura@tottenham.uk");
        assertFalse(testLocker.equals(newTestRecipient));
    }

    @Test
    void testEquals_DifferentInheritedFields()
            throws IllegalDimensionException, exceedDimensionException, lockerOccupiedException {
        Recipient newTestRecipient = new Recipient("Chris", "Ronaldo", "cr7@manu.edu");
        MailItem newTestMailItem = new MailItem(15, 18, 10, newTestRecipient);
        Locker newTestLocker = new Locker(20, 20, 20);
        newTestLocker.addMail(newTestMailItem);
        assertFalse(testLocker.equals(newTestLocker));
    }

    @Test
    void testEquals_SameFieldsOverall() throws IllegalDimensionException{
        Locker newTestLocker = new Locker(10, 25, 20);
        assertTrue(testLocker.equals(newTestLocker));
    }

    @Test
    void testEquals_DifferentWidthMax() throws IllegalDimensionException{
        Locker newTestLocker = new Locker(20, 25, 20);
        assertFalse(testLocker.equals(newTestLocker));
    }

    @Test
    void testEquals_DifferentHeight() throws IllegalDimensionException{
        Locker newTestLocker = new Locker(10, 35, 20);
        assertFalse(testLocker.equals(newTestLocker));
    }

    @Test
    void testEquals_DifferentDepth() throws IllegalDimensionException{
        Locker newTestLocker = new Locker(10, 25, 30);
        assertFalse(testLocker.equals(newTestLocker));
    }

    @Test
    void testEquals_DifferentRecipient()
            throws IllegalDimensionException, exceedDimensionException, lockerOccupiedException {
        Recipient newTestRecipient = new Recipient("Chris", "Ronaldo", "cr7@manu.edu");
        MailItem newTestMailItem = new MailItem(8, 8, 8, newTestRecipient);
        Locker newTestLocker = new Locker(15, 30, 20);
        newTestLocker.addMail(newTestMailItem);
        assertFalse(testLocker.equals(newTestLocker));
    }

    @Test
    void testHashCode() throws IllegalDimensionException{
        Locker newTestLocker = new Locker(10, 25, 20);
        assertTrue(testLocker.hashCode() == newTestLocker.hashCode());
    }

    @Test
    void testToString() {
        String expectedString = "Locker{" +
                "maxWidth=" + "10" +
                ", maxHeight=" + "25" +
                ", maxDepth=" + "20" +
                ", itemInLocker=" + null + '}';

        assertEquals(expectedString, testLocker.toString());
    }
}