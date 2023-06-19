package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleRoomTest {
    DoubleRoom testDoubleRoom;


    @BeforeEach
    void setUp() throws invalidOccupancyException, invalidPriceException {
        testDoubleRoom = new DoubleRoom(200.0, 0, 2);

        Exception invalidOccupancyException = assertThrows(Exception.class,
                () -> testDoubleRoom = new DoubleRoom(200.0, 3, 2));
        assertEquals("Number of guests cannot exceed maximum occupancy", invalidOccupancyException.getMessage());
        Exception invalidPriceException = assertThrows(Exception.class,
                () -> testDoubleRoom = new DoubleRoom(-200.0, 0, 2));
        assertEquals("Price must be greater than 0", invalidPriceException.getMessage());

    }

    @Test
    void getMaximumOccupancy() {
        assertEquals(testDoubleRoom.getMaximumOccupancy(), 2);
    }

    @Test
    void bookRoom() throws invalidOccupancyException, unavailableRoomException {
        if (testDoubleRoom.isAvailable()) {
            Exception invalidOccupancyException = assertThrows(Exception.class,
                    () -> testDoubleRoom.bookRoom(3));
            assertEquals("Number of guests cannot exceed maximum occupancy", invalidOccupancyException.getMessage());

        }
        else {
            Exception unavailableRoomException = assertThrows(Exception.class,
                    () -> testDoubleRoom.bookRoom(2));
            assertEquals("Room is unavailable", unavailableRoomException.getMessage());

        }




    }

    @Test
    void testToString() {
        String expectedString = "DoubleRoom{" +
                "maximumOccupancy=" + testDoubleRoom.getMaximumOccupancy()+
                ", price=" + testDoubleRoom.getPrice() +
                ", numberOfGuests=" + testDoubleRoom.getNumberOfGuests() +
                '}';
        assertEquals(testDoubleRoom.toString(), expectedString);
    }
}