
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    private Cleaning testCleaning;
    private Painting testPainting;
    private Gardening testGardening;
    private WindowCleaning testWindowCleaning;
    private RoofGutterCleaning testRoofGutterCleaning;
    private Electrical testElectrical;
    private Plumbing testPlumbing;
    private Plumbing testPlumbing2;
    private InternetTVComputing testInternetTVComputing;




    @BeforeEach
    void setUp() throws InvalidFloorException, ExceedMaxSpecialistException, RoofSquareNonPositiveException, PetsNegativeException {
        testCleaning = new Cleaning("123", PropertySize.SMALL, true, 0, 1, 0);
        testPainting = new Painting("123 avenue", PropertySize.SMALL, true, 0, 1, 0);
        testGardening = new Gardening("456 avenue", PropertySize.MEDIUM, true, 0, 1);
        testWindowCleaning = new WindowCleaning("789 avenue", PropertySize.LARGE, true, 0, 1,2);
        testRoofGutterCleaning = new RoofGutterCleaning("1011 avenue", PropertySize.LARGE, true, 0, 1, 100.0, TypeOfRoof.FLAT);
        testElectrical = new Electrical("1213 avenue", PropertySize.LARGE, true, 0, 1, true);
        testPlumbing = new Plumbing("1415 avenue", PropertySize.LARGE, true, 6, 1, true);
        testPlumbing2 = new Plumbing("1415 avenue", PropertySize.LARGE, true, 6, 3, true);
        testInternetTVComputing = new InternetTVComputing("1617 avenue", PropertySize.LARGE, true, 7, 1, false);



    }

    @Test
    void testConstructor(){
        //test cleaning
        assertThrows(PetsNegativeException.class, () -> new Cleaning("123", PropertySize.SMALL, true, 0, 1, -1));
        //test WindowCleaning
        assertThrows(InvalidFloorException.class, () -> new WindowCleaning("123", PropertySize.SMALL, true, 0, 1,-1));

        //test RoofGutterCleaning
        assertThrows(RoofSquareNonPositiveException.class, () -> new RoofGutterCleaning("123", PropertySize.SMALL, true, 0, 1, -1.0, TypeOfRoof.FLAT));

        //test Electrical
        //assertThrows(ExceedMaxSpecialistException.class, () -> new Electrical("123", PropertySize.SMALL, true, 0, 8, true));

        assertThrows(ExceedMaxSpecialistException.class, () -> {
            new Electrical("1675 Godfrey Road", PropertySize.SMALL, false, 4, 5, false);
        });
        // InternetTVComputing
        assertThrows(ExceedMaxSpecialistException.class, () -> {
            new InternetTVComputing("3102 Rainbow Drive", PropertySize.MEDIUM, false, 3, 3, false);
        });

        //test InternetTVComputing
        //assertThrows(ExceedMaxSpecialistException.class, () -> new InternetTVComputing("123", PropertySize.SMALL, true, 0, 6, true));
    }



    @Test
    void getPropertyAddress() {

        assertEquals("123", testCleaning.getPropertyAddress());
        assertEquals("123 avenue", testPainting.getPropertyAddress());
        assertEquals("456 avenue", testGardening.getPropertyAddress());
        assertEquals("789 avenue", testWindowCleaning.getPropertyAddress());
        assertEquals("1011 avenue", testRoofGutterCleaning.getPropertyAddress());
        assertEquals("1213 avenue", testElectrical.getPropertyAddress());
        assertEquals("1415 avenue", testPlumbing.getPropertyAddress());
        assertEquals("1617 avenue", testInternetTVComputing.getPropertyAddress());


    }

    @Test
    void setPropertyAddress() {
        testCleaning.setPropertyAddress("1234");
        assertEquals("1234", testCleaning.getPropertyAddress());
        testPainting.setPropertyAddress("1234 avenue");
        assertEquals("1234 avenue", testPainting.getPropertyAddress());
        testGardening.setPropertyAddress("456 avenue");
        assertEquals("456 avenue", testGardening.getPropertyAddress());
        testWindowCleaning.setPropertyAddress("789 avenue");
        assertEquals("789 avenue", testWindowCleaning.getPropertyAddress());
        testRoofGutterCleaning.setPropertyAddress("1011 avenue");
        assertEquals("1011 avenue", testRoofGutterCleaning.getPropertyAddress());
        testElectrical.setPropertyAddress("1213 avenue");
        assertEquals("1213 avenue", testElectrical.getPropertyAddress());
        testPlumbing.setPropertyAddress("1415 avenue");
        assertEquals("1415 avenue", testPlumbing.getPropertyAddress());
        testInternetTVComputing.setPropertyAddress("1617 avenue");
        assertEquals("1617 avenue", testInternetTVComputing.getPropertyAddress());
    }

    @Test
    void getPropertySize() {
        assertEquals(PropertySize.SMALL, testCleaning.getPropertySize());
        assertEquals(PropertySize.SMALL, testPainting.getPropertySize());
        assertEquals(PropertySize.MEDIUM, testGardening.getPropertySize());
        assertEquals(PropertySize.LARGE, testWindowCleaning.getPropertySize());
        assertEquals(PropertySize.LARGE, testRoofGutterCleaning.getPropertySize());
        assertEquals(PropertySize.LARGE, testElectrical.getPropertySize());
        assertEquals(PropertySize.LARGE, testPlumbing.getPropertySize());
        assertEquals(PropertySize.LARGE, testInternetTVComputing.getPropertySize());
    }

    @Test
    void setPropertySize() {
        testCleaning.setPropertySize(PropertySize.MEDIUM);
        assertEquals(PropertySize.MEDIUM, testCleaning.getPropertySize());
        testPainting.setPropertySize(PropertySize.MEDIUM);
        assertEquals(PropertySize.MEDIUM, testPainting.getPropertySize());
        testGardening.setPropertySize(PropertySize.LARGE);
        assertEquals(PropertySize.LARGE, testGardening.getPropertySize());
        testWindowCleaning.setPropertySize(PropertySize.SMALL);
        assertEquals(PropertySize.SMALL, testWindowCleaning.getPropertySize());
        testRoofGutterCleaning.setPropertySize(PropertySize.SMALL);
        assertEquals(PropertySize.SMALL, testRoofGutterCleaning.getPropertySize());
        testElectrical.setPropertySize(PropertySize.SMALL);
        assertEquals(PropertySize.SMALL, testElectrical.getPropertySize());
        testPlumbing.setPropertySize(PropertySize.SMALL);
        assertEquals(PropertySize.SMALL, testPlumbing.getPropertySize());
        testInternetTVComputing.setPropertySize(PropertySize.SMALL);
        assertEquals(PropertySize.SMALL, testInternetTVComputing.getPropertySize());
    }

    @Test
    void getMonthlyService() {
        assertEquals(true, testCleaning.getMonthlyService());
        assertEquals(true, testPainting.getMonthlyService());
        assertEquals(true, testGardening.getMonthlyService());
        assertEquals(true, testWindowCleaning.getMonthlyService());
        assertEquals(true, testRoofGutterCleaning.getMonthlyService());
        assertEquals(true, testElectrical.getMonthlyService());
        assertEquals(true, testPlumbing.getMonthlyService());
        assertEquals(true, testInternetTVComputing.getMonthlyService());
    }

    @Test
    void setMonthlyService() {
        testCleaning.setMonthlyService(false);
        assertEquals(false, testCleaning.getMonthlyService());
        testPainting.setMonthlyService(false);
        assertEquals(false, testPainting.getMonthlyService());
        testGardening.setMonthlyService(false);
        assertEquals(false, testGardening.getMonthlyService());
        testWindowCleaning.setMonthlyService(false);
        assertEquals(false, testWindowCleaning.getMonthlyService());
        testRoofGutterCleaning.setMonthlyService(false);
        assertEquals(false, testRoofGutterCleaning.getMonthlyService());
        testElectrical.setMonthlyService(false);
        assertEquals(false, testElectrical.getMonthlyService());
        testPlumbing.setMonthlyService(false);
        assertEquals(false, testPlumbing.getMonthlyService());
        testInternetTVComputing.setMonthlyService(false);
        assertEquals(false, testInternetTVComputing.getMonthlyService());
    }

    @Test
    void getNumPastServices() {
        assertEquals(0, testCleaning.getNumPastServices());
        assertEquals(0, testPainting.getNumPastServices());
        assertEquals(0, testGardening.getNumPastServices());
        assertEquals(0, testWindowCleaning.getNumPastServices());
        assertEquals(0, testRoofGutterCleaning.getNumPastServices());
        assertEquals(0, testElectrical.getNumPastServices());
        assertEquals(6, testPlumbing.getNumPastServices());
        assertEquals(7, testInternetTVComputing.getNumPastServices());
    }

    @Test
    void setNumPastServices() {
        testCleaning.setNumPastServices(1);
        assertEquals(1, testCleaning.getNumPastServices());
        testPainting.setNumPastServices(2);
        assertEquals(2, testPainting.getNumPastServices());
        testGardening.setNumPastServices(3);
        assertEquals(3, testGardening.getNumPastServices());
        testWindowCleaning.setNumPastServices(4);
        assertEquals(4, testWindowCleaning.getNumPastServices());
        testRoofGutterCleaning.setNumPastServices(5);
        assertEquals(5, testRoofGutterCleaning.getNumPastServices());
        testElectrical.setNumPastServices(6);
        assertEquals(6, testElectrical.getNumPastServices());
        testPlumbing.setNumPastServices(7);
        assertEquals(7, testPlumbing.getNumPastServices());
        testInternetTVComputing.setNumPastServices(8);
        assertEquals(8, testInternetTVComputing.getNumPastServices());
    }


    @Test
    void testHashCode() {
        assertEquals(testCleaning.hashCode(), testCleaning.hashCode());
        assertEquals(testPainting.hashCode(), testPainting.hashCode());
        assertEquals(testGardening.hashCode(), testGardening.hashCode());
        assertEquals(testWindowCleaning.hashCode(), testWindowCleaning.hashCode());
        assertEquals(testRoofGutterCleaning.hashCode(), testRoofGutterCleaning.hashCode());
        assertEquals(testElectrical.hashCode(), testElectrical.hashCode());
        assertEquals(testPlumbing.hashCode(), testPlumbing.hashCode());
        assertEquals(testInternetTVComputing.hashCode(), testInternetTVComputing.hashCode());
    }


}