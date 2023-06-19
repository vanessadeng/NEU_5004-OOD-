package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyRoomTest {

    FamilyRoom testFamilyRoom;
    @BeforeEach
    void setUp() throws invalidOccupancyException, invalidPriceException {
        testFamilyRoom = new FamilyRoom(400.0, 0, 4);
        Exception invalidOccupancyException = assertThrows(Exception.class,
                () -> testFamilyRoom = new FamilyRoom(400.0, 5, 4));

        assertEquals("Number of guests cannot exceed maximum occupancy", invalidOccupancyException.getMessage());

        Exception invalidPriceException = assertThrows(Exception.class,
                () -> testFamilyRoom = new FamilyRoom(-400.0, 0, 4));
        assertEquals("Price must be greater than 0", invalidPriceException.getMessage());

    }

    @Test
    void getMaximumOccupancy() {
        assertEquals(testFamilyRoom.getMaximumOccupancy(), 4);
    }

    @Test
    void bookRoom() throws invalidOccupancyException, unavailableRoomException {
        if (testFamilyRoom.isAvailable()) {
            testFamilyRoom.bookRoom(4);
            assertEquals(testFamilyRoom.getNumberOfGuests(), 4);

            Exception invalidOccupancyException = assertThrows(Exception.class,
                    () -> testFamilyRoom.bookRoom(5));

        }
        else {
            Exception unavailableRoomException = assertThrows(Exception.class,
                    () -> testFamilyRoom.bookRoom(4));
            assertEquals("Room is unavailable", unavailableRoomException.getMessage());


        }



    }

    @Test
    void testToString() {
        String expectedString = "FamilyRoom{" +
                "maximumOccupancy=" + testFamilyRoom.getMaximumOccupancy()+
                ", price=" + testFamilyRoom.getPrice() +
                ", numberOfGuests=" + testFamilyRoom.getNumberOfGuests() +
                '}';
        assertEquals(testFamilyRoom.toString(), expectedString);


    }
}