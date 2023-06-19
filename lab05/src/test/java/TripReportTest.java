import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripReportTest {

    TripReport testTripReport;
    Boat testBoat;

    @BeforeEach
    void setUp() {
        testBoat = new Boat("testBoat", 10.0f, 20.0f);
        testTripReport = new TripReport(testBoat, 10.0f, 20.0f, 30);
    }

    @Test
    void getVehicle() {

        assertEquals(testBoat, testTripReport.getVehicle());
    }



    @Test
    void getSpeedPerMinute() {
        assertEquals(10.0f, testTripReport.getSpeedPerMinute());
    }


    @Test
    void getDistance() {
        assertEquals(20.0f, testTripReport.getDistance());
    }


    @Test
    void getDuration() {
        assertEquals(30, testTripReport.getDuration());
    }
    @Test
    void testEquals_Null() {
       assertTrue(testTripReport.equals(testTripReport));
    }

    @Test
    void testEquals_ObjectsWithDifferentFieldOne() {
        TripReport testTripReport2 = new TripReport(testBoat, 10.0f, 20.0f, 1);
        assertFalse(testTripReport.equals(testTripReport2));
    }

    @Test
    void testEquals_ObjectsWithDifferentFieldTwo() {
        TripReport testTripReport3 = new TripReport(testBoat, 20.0f, 20.0f, 30);
        assertFalse(testTripReport.equals(testTripReport3));
    }


    @Test
    void testEquals_ObjectsWithDifferentFieldThree() {
        TripReport testTripReport4 = new TripReport(testBoat, 20.0f, 240.0f, 30);
        assertFalse(testTripReport.equals(testTripReport4));
    }



    @Test
    void testEquals_SameObjects() {
        assertFalse(testTripReport.equals(new Object()));
    }





    @Test
    void testHashCode() {
        TripReport testTripReport5 = new TripReport(testBoat, 10.0f, 20.0f, 30);
        TripReport testTripReport6 = new TripReport(testBoat, 10.0f, 20.0f, 30);
        assertEquals(testTripReport5.hashCode(), testTripReport6.hashCode());
    }

    @Test
    void testToString() {
    }
}