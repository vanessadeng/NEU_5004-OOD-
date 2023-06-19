import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainTest {

    Train testTrain;

    @BeforeEach
    void setUp() {
        testTrain = new Train("testTrain", 10.0f, 20.0f);
    }

    @Test
    void testToString() {
        String expectedString = "Train{" +
                "ID='" + testTrain.ID + '\'' +
                ", avgSpeed=" + testTrain.avgSpeed +
                ", maxSpeed=" + testTrain.maxSpeed +
                '}';
        assertEquals(expectedString, testTrain.toString());
    }
}