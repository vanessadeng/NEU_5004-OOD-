package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NationalParkTest {

    private NationalPark testNationalPark;
    private String[] testVisitorCenters;
    private LocalDate testDateParkFounded;
    private String testNationalParkID;
    private String testNationalParkName;
    private String testState;
    private Double testArea;
    private Boolean testOpenYearRound;

    @BeforeEach
    void setUp() {
        testVisitorCenters = new String[]{"Albright", "Canyon"};
        testDateParkFounded = LocalDate.of(1872,3,1);
        testNationalParkID = "YELL";
        testNationalParkName = "Yellowstone";
        testState = "Wyoming";
        testArea = 2219790.0;
        testOpenYearRound = true;

        testNationalPark = new NationalPark(testNationalParkID, testNationalParkName, testState, testArea, testDateParkFounded,testVisitorCenters, true);



    }

    @Test
    void getNationalParkID() {
        assertEquals(testNationalParkID, testNationalPark.getNationalParkID());

    }

    @Test
    void getNationalParkName() {
        assertEquals(testNationalParkName, testNationalPark.getNationalParkName());
    }

    @Test
    void getState() {
        assertEquals(testState, testNationalPark.getState());
    }

    @Test
    void getArea() {
        assertEquals(testArea, testNationalPark.getArea());
    }

    @Test
    void getDateParkFounded() {
        assertEquals(testDateParkFounded, testNationalPark.getDateParkFounded());
    }

    @Test
    void getVisitorCenters() {
        assertEquals(testVisitorCenters, testNationalPark.getVisitorCenters());
    }

    @Test
    void getOpenYearRound() {
        assertEquals(testOpenYearRound, testNationalPark.getOpenYearRound());
    }

    @Test
    void testEquals_Null() {
        assertFalse(testNationalPark.equals(null));
    }

    @Test
    void testEquals_DifferentObjects() {
        assertFalse(testNationalPark.equals("test"));
    }

    @Test
    void testEquals_DifferentFields() {
        NationalPark testNationalPark2 = new NationalPark("YELL", "Yellowstone", "Wyoming", 2219790.0, LocalDate.of(1872,3,1), new String[]{"Albright", "Canyon"}, false);
        assertFalse(testNationalPark.equals(testNationalPark2));

        NationalPark testNationalPark3 = new NationalPark("YELL", "Yellowstone", "Wyoming", 2219790.0, LocalDate.of(1872,3,1), new String[]{"Albright"}, true);
        assertFalse(testNationalPark.equals(testNationalPark3));

        NationalPark testNationalPark4 = new NationalPark("YELL", "Yellowstone", "Wyoming", 2219790.0, LocalDate.of(1872,3,1), new String[]{"Albright", "Canyon"}, true);
        assertTrue(testNationalPark.equals(testNationalPark4));

    }



    @Test
    void testHashCode() {

        NationalPark testNationalPark2 = new NationalPark("YELL", "Yellowstone", "Wyoming", 2219790.0, LocalDate.of(1872,3,1), new String[]{"Albright", "Canyon"}, true);
        assertTrue(testNationalPark.hashCode() == testNationalPark2.hashCode());

    }

    @Test
    void testToString() {
        String testString = "NationalPark{nationalParkID='YELL', nationalParkName='Yellowstone', state='Wyoming', area=2219790.0, dateParkFounded=1872-03-01, visitorCenters=[Albright, Canyon], openYearRound=true}";
        assertEquals(testString, testNationalPark.toString());
    }
}