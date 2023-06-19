import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FleetManagerTest {

    private FleetManager testFleetManager;
    private Boat testBoat;
    private Bus testBus;
    private Train testTrain;
    private TripReport testTripReport;
    private Vehicle testVehicle;




    @BeforeEach
    void setUp() {
        testBoat = new Boat("123", 50.0f, 70.0f);
        testBus = new Bus("123", 50.0f, 70.0f);
        testTrain = new Train("123", 50.0f, 70.0f);
        testFleetManager = new FleetManager();
        testTripReport = new TripReport(testBoat, 30.0f, 300.0f, 1);
    }

    @Test
    void drive() {
        TripReport aReport = testFleetManager.drive(100.0f, testBus);
        assertEquals(100.0f, aReport.getDistance());
        assertEquals(50.0f, aReport.getSpeedPerMinute());
        assertEquals(2, aReport.getDuration());
    }

    @Test
    void testDrive() {
        TripReport aReport = testFleetManager.drive(100.0f, testTrain);
        assertEquals(100.0f, aReport.getDistance());
        assertEquals(50.0f, aReport.getSpeedPerMinute());
        assertEquals(2, aReport.getDuration());
    }

}