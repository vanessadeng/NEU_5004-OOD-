package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {



    private SingleRoom testSingleRoom;
    private FamilyRoom testFamilyRoom;
    private DoubleRoom testDoubleRoom;

    private Integer expectedMaximumOccupancy;
    private Double expectedPrice;
    private Integer expectedNumberOfGuests;

    @BeforeEach
    void setUp() throws invalidOccupancyException, invalidPriceException {
        testSingleRoom = new SingleRoom(100.0, 0, 1);
        testDoubleRoom = new DoubleRoom(200.0, 0, 2);
        testFamilyRoom = new FamilyRoom(400.0, 0, 4);

        expectedMaximumOccupancy = 1;
        expectedPrice = 100.0;
        expectedNumberOfGuests = 0;
    }

    @Test
    void isAvailable() {
        assertEquals(testSingleRoom.isAvailable(), true);
    }




    @Test
    void getPrice() {
        assertEquals(testSingleRoom.getPrice(), 100.0);
        assertEquals(testDoubleRoom.getPrice(), 200.0);
        assertEquals(testFamilyRoom.getPrice(), 400.0);
    }



    @Test
    void getNumberOfGuests() {
        assertEquals(testSingleRoom.getNumberOfGuests(), 0);
        assertEquals(testDoubleRoom.getNumberOfGuests(), 0);
        assertEquals(testFamilyRoom.getNumberOfGuests(), 0);
    }

    @Test
    void getMaximumOccupancy() {
        assertEquals(testSingleRoom.getMaximumOccupancy(), 1);
        assertEquals(testDoubleRoom.getMaximumOccupancy(), 2);
        assertEquals(testFamilyRoom.getMaximumOccupancy(), 4);
    }


    @Test
    void testEquals_SameObjects() {
        assertTrue(testSingleRoom.equals(testSingleRoom));
        assertTrue(testDoubleRoom.equals(testDoubleRoom));
        assertTrue(testFamilyRoom.equals(testFamilyRoom));
    }

    @Test
    void testEquals_DifferentObjects() {
        assertTrue(testSingleRoom.equals(testSingleRoom));
    }

    @Test
    void testEquals_NullObjects() {
        assertFalse(testSingleRoom.equals(null));
    }

    @Test
    void testEquals_DifferentObjectsSameAttributes() throws invalidOccupancyException, invalidPriceException {
        SingleRoom testSingleRoom2 = new SingleRoom(100.0, 0, 1);
        assertTrue(testSingleRoom.equals(testSingleRoom2));
    }


    @Test
    void testEquals_OtherObjectSingleRoom_DifferentPrice() throws invalidOccupancyException, invalidPriceException {
        SingleRoom testSingleRoom2 = new SingleRoom(180.0, 0, 1);
        assertFalse(testSingleRoom.equals(testSingleRoom2));
    }


    @Test
    void testHashCode_SameObject() {
        assertEquals(testSingleRoom.hashCode(), testSingleRoom.hashCode());
    }



    @Test
    void toString_DoubleRoom() {
        String expectedString = "DoubleRoom{" +
                "maximumOccupancy=" + testDoubleRoom.getMaximumOccupancy() +
                ", price=" + testDoubleRoom.getPrice()+
                ", numberOfGuests=" + testDoubleRoom.getNumberOfGuests()+
                '}';
        assertEquals(testDoubleRoom.toString(), expectedString);
    }
    @Test
    void toString_FamilyRoom() {
        String expectedString = "FamilyRoom{" +
                "maximumOccupancy=" + testFamilyRoom.getMaximumOccupancy() +
                ", price=" + testFamilyRoom.getPrice() +
                ", numberOfGuests=" + testFamilyRoom.getNumberOfGuests() +
                '}';
        assertEquals(testFamilyRoom.toString(), expectedString);
    }

}