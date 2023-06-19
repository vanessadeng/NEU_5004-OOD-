package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleRoomTest {
    SingleRoom testSingleRoom;

    @BeforeEach
    void setUp() throws invalidOccupancyException, invalidPriceException {
        testSingleRoom = new SingleRoom(100.0, 0, 1);

        Exception invalidOccupancyException = assertThrows(Exception.class,
                () -> testSingleRoom = new SingleRoom(100.0, 2, 1));
        assertEquals("Number of guests cannot exceed maximum occupancy", invalidOccupancyException.getMessage());
        Exception invalidPriceException = assertThrows(Exception.class,
                () -> testSingleRoom = new SingleRoom(-100.0, 0, 1));
        assertEquals("Price must be greater than 0", invalidPriceException.getMessage());

    }

    @Test
    void bookRoom() throws invalidOccupancyException, unavailableRoomException {
        if (testSingleRoom.isAvailable()){

            testSingleRoom.bookRoom(1);
            assertEquals(testSingleRoom.getNumberOfGuests(), 1);

            Exception invalidOccupancyException = assertThrows(Exception.class,
                    () -> testSingleRoom.bookRoom(2));
        }
        else {
            Exception unavailableRoomException = assertThrows(Exception.class,
                    () -> testSingleRoom.bookRoom(1));
            assertEquals("Room is unavailable", unavailableRoomException.getMessage());
        }




    }

    @Test
    void getMaximumOccupancy() {
        assertEquals(testSingleRoom.getMaximumOccupancy(), 1);
    }

    @Test
    void testToString() {
        String expectedString = "SingleRoom{" +
                "maximumOccupancy=" + testSingleRoom.getMaximumOccupancy()+
                ", price=" + testSingleRoom.getPrice() +
                ", numberOfGuests=" + testSingleRoom.getNumberOfGuests() +
                '}';
        assertEquals(testSingleRoom.toString(), expectedString);
    }
}