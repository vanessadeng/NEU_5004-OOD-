package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NationalParkDirectoryTest {

    private NationalParkDirectory testNationalParkDirectory;
    private NationalPark testNationalPark1;
    private NationalPark testNationalPark2;
    private NationalPark testNationalPark3;
    private NationalPark testNationalPark4;






    @BeforeEach
    void setUp() {

        testNationalPark1 = new NationalPark("YELL", "Yellowstone", "Wyoming", 2219790.0, LocalDate.of(1872,3,1), new String[]{"Albright", "Canyon"}, true);
        testNationalPark2 = new NationalPark("ACAD", "Acadia", "Maine", 49000.0, LocalDate.of(1919,2,26), new String[]{"Hulls Cove", "Schoodic"}, true);
        testNationalPark3 = new NationalPark("ARCH", "Arches", "Utah", 76678.98, LocalDate.of(1929,4,12), new String[]{"Arches Visitor Center"}, true);
        testNationalPark4 = new NationalPark("BADL", "Badlands", "South Dakota", 242755.94, LocalDate.of(1978,11,10), new String[]{"Ben Reifel Visitor Center"}, true);
        testNationalParkDirectory = new NationalParkDirectory();
        testNationalParkDirectory.addNationalPark(testNationalPark1);
        testNationalParkDirectory.addNationalPark(testNationalPark2);
        testNationalParkDirectory.addNationalPark(testNationalPark3);


    }

    @Test
    void isEmpty() {
        assertFalse(testNationalParkDirectory.isEmpty());

    }

    @Test
    void count() {
        assertEquals(3, testNationalParkDirectory.count());

    }

    @Test
    void contains() {
        assertFalse(testNationalParkDirectory.contains(testNationalPark4));

    }

    @Test
    void addNationalPark() {
        NationalParkDirectory testNationalParkDirectory2 = new NationalParkDirectory();
        testNationalParkDirectory2.addNationalPark(testNationalPark1);
        testNationalParkDirectory2.addNationalPark(testNationalPark2);
        testNationalParkDirectory2.addNationalPark(testNationalPark3);
        assertEquals(testNationalParkDirectory2, testNationalParkDirectory);

    }

    @Test
    void removeNationalPark() throws NationalParkNotFoundException {
        NationalParkDirectory testNationalParkDirectory2 = new NationalParkDirectory();
        testNationalParkDirectory2.addNationalPark(testNationalPark1);
        testNationalParkDirectory2.addNationalPark(testNationalPark2);
        testNationalParkDirectory2.addNationalPark(testNationalPark3);
        testNationalParkDirectory2.addNationalPark(testNationalPark4);
        testNationalParkDirectory2.removeNationalPark(testNationalPark4);
        assertFalse(testNationalParkDirectory2.contains(testNationalPark4));

    }

    @Test
    void findParksWithinTheState() {
        NationalPark[] parksInUtah = testNationalParkDirectory.findParksWithinTheState("Utah");
        assertEquals(1, parksInUtah.length);




    }

    @Test
    void getParkByID() throws InvalidNationalParkIDException {
        assertEquals(testNationalPark1, testNationalParkDirectory.getParkByID("YELL"));

    }

    @Test
    void testEquals_Null() {
        assertFalse(testNationalParkDirectory.equals(null));
    }

    @Test
    void testEquals_DifferentObjects() {
        assertFalse(testNationalParkDirectory.equals("test"));

    }

    @Test
    void testEquals_SameObject() {
        assertTrue(testNationalParkDirectory.equals(testNationalParkDirectory));
    }





    @Test
    void testHashCode() {
        NationalParkDirectory testNationalParkDirectory2 = new NationalParkDirectory();
        testNationalParkDirectory2.addNationalPark(testNationalPark1);
        testNationalParkDirectory2.addNationalPark(testNationalPark2);
        testNationalParkDirectory2.addNationalPark(testNationalPark3);
        assertEquals(testNationalParkDirectory2.hashCode(), testNationalParkDirectory.hashCode());

    }

    @Test
    void testToString() {
        String expectedString = "NationalParkDirectory{" +
                "parks=" + Arrays.toString(testNationalParkDirectory.getParks()) +
                ", size=" + testNationalParkDirectory.getSize() +
                '}';
    }
}