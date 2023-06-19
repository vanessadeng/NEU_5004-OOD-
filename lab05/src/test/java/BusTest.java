import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {

    Bus testBus;

    @BeforeEach
    void setUp() {

        testBus = new Bus("testBus", 10.0f, 20.0f);
    }

    @Test
    void testToString() {
        String expectedString = "Bus{" +
                "ID='" + testBus.ID + '\'' +
                ", avgSpeed=" + testBus.avgSpeed +
                ", maxSpeed=" + testBus.maxSpeed +
                '}';
        assertEquals(expectedString, testBus.toString());
    }
}