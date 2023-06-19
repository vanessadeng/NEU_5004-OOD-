import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoatTest {

    private Boat testBoat;

    @BeforeEach
    void setUp() {
        testBoat = new Boat("testBoat", 10.0f, 20.0f);


    }

    @Test
    void testToString() {

        String expectedString = "Boat{" +
                "ID='" + testBoat.ID + '\'' +
                ", avgSpeed=" + testBoat.avgSpeed +
                ", maxSpeed=" + testBoat.maxSpeed +
                '}';
        assertEquals(expectedString, testBoat.toString());
    }
}