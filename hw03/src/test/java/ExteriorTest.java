import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExteriorTest {

    private Gardening testGardening;
    private WindowCleaning testWindowCleaning;
    private RoofGutterCleaning testRoofGutterCleaning;

    @BeforeEach
    void setUp() throws InvalidFloorException, RoofSquareNonPositiveException {

        testGardening = new Gardening("2022 Seattle Ave NE", PropertySize.LARGE, false, 9, 0);
        testWindowCleaning = new WindowCleaning("2023 Seattle Ave NE", PropertySize.MEDIUM, true, 5, 0,2);
        testRoofGutterCleaning = new RoofGutterCleaning("2024 Seattle Ave NE", PropertySize.SMALL, false, 3, 0,2.0,TypeOfRoof.MANSARD);
        Exception InvalidFloorException = assertThrows(InvalidFloorException.class, () -> new WindowCleaning("2023 Seattle Ave NE", PropertySize.MEDIUM, true, 5, 0,-2));
        Exception RoofSquareNonPositiveException = assertThrows(RoofSquareNonPositiveException.class, () -> new RoofGutterCleaning("2024 Seattle Ave NE", PropertySize.SMALL, false, 3, 0,-5.0,TypeOfRoof.MANSARD));
    }

    @Test
    void getPropertyAddress() {
        assertEquals("2022 Seattle Ave NE", testGardening.getPropertyAddress());
        assertEquals("2023 Seattle Ave NE", testWindowCleaning.getPropertyAddress());
        assertEquals("2024 Seattle Ave NE", testRoofGutterCleaning.getPropertyAddress());
    }

    @Test
    void setPropertyAddress() {
        testGardening.setPropertyAddress("2025 Seattle Ave NE");
        testWindowCleaning.setPropertyAddress("2026 Seattle Ave NE");
        testRoofGutterCleaning.setPropertyAddress("2027 Seattle Ave NE");
        assertEquals("2025 Seattle Ave NE", testGardening.getPropertyAddress());
        assertEquals("2026 Seattle Ave NE", testWindowCleaning.getPropertyAddress());
        assertEquals("2027 Seattle Ave NE", testRoofGutterCleaning.getPropertyAddress());
    }

    @Test
    void getPropertySize() {
        assertEquals(PropertySize.LARGE, testGardening.getPropertySize());
        assertEquals(PropertySize.MEDIUM, testWindowCleaning.getPropertySize());
        assertEquals(PropertySize.SMALL, testRoofGutterCleaning.getPropertySize());
    }

    @Test
    void setPropertySize() {
        testGardening.setPropertySize(PropertySize.SMALL);
        testWindowCleaning.setPropertySize(PropertySize.LARGE);
        testRoofGutterCleaning.setPropertySize(PropertySize.MEDIUM);
        assertEquals(PropertySize.SMALL, testGardening.getPropertySize());
        assertEquals(PropertySize.LARGE, testWindowCleaning.getPropertySize());
        assertEquals(PropertySize.MEDIUM, testRoofGutterCleaning.getPropertySize());
    }

    @Test
    void getMonthlyService() {
        assertFalse(testGardening.getMonthlyService());
        assertTrue(testWindowCleaning.getMonthlyService());
        assertFalse(testRoofGutterCleaning.getMonthlyService());
    }

    @Test
    void setMonthlyService() {
        testGardening.setMonthlyService(true);
        testWindowCleaning.setMonthlyService(false);
        testRoofGutterCleaning.setMonthlyService(true);
        assertTrue(testGardening.getMonthlyService());
        assertFalse(testWindowCleaning.getMonthlyService());
        assertTrue(testRoofGutterCleaning.getMonthlyService());
    }

    @Test
    void getNumPastServices() {
        assertEquals(9, testGardening.getNumPastServices());
        assertEquals(5, testWindowCleaning.getNumPastServices());
        assertEquals(3, testRoofGutterCleaning.getNumPastServices());
    }

    @Test
    void setNumPastServices() {
        testGardening.setNumPastServices(10);
        testWindowCleaning.setNumPastServices(6);
        testRoofGutterCleaning.setNumPastServices(4);
        assertEquals(10, testGardening.getNumPastServices());
        assertEquals(6, testWindowCleaning.getNumPastServices());
        assertEquals(4, testRoofGutterCleaning.getNumPastServices());
    }

    @Test
    void getNumOfFloors() {
        assertEquals(2, testWindowCleaning.getNumOfFloors());
    }
    @Test
    void getSquareFootageOfRoof() {
        assertEquals(2.0, testRoofGutterCleaning.getSquareFootageOfRoof());
    }

    @Test
    void getTypeOfRoof() {
        assertEquals(testRoofGutterCleaning.getTypeOfRoof(), TypeOfRoof.MANSARD);
    }

    @Test
    void calculatePrice() {
        assertEquals(170.0, testGardening.calculatePrice());
        assertEquals(151.20000000000002, testWindowCleaning.calculatePrice());
        assertEquals(280.0, testRoofGutterCleaning.calculatePrice());
    }




    @Test
    void testEquals_SameObject() {
        assertTrue(testGardening.equals(testGardening));
        assertTrue(testWindowCleaning.equals(testWindowCleaning));
        assertTrue(testRoofGutterCleaning.equals(testRoofGutterCleaning));
    }

    @Test
    void testEquals_DifferentObject() {
        Painting testPainting = new Painting("home", PropertySize.LARGE, true, 8, 2,2);
        assertFalse(testGardening.equals(testPainting));
        assertFalse(testWindowCleaning.equals(testPainting));
        assertFalse(testRoofGutterCleaning.equals(testPainting));
    }

    @Test
    void testEquals_NullObject() {
        assertFalse(testGardening.equals(null));
        assertFalse(testWindowCleaning.equals(null));
        assertFalse(testRoofGutterCleaning.equals(null));
    }

    @Test
    void testEquals_DifferentPropertySize() throws InvalidFloorException, RoofSquareNonPositiveException {
        Gardening newGarden =  new Gardening("2022 Seattle Ave NE", PropertySize.SMALL, false, 9, 0);
        WindowCleaning newWindow = new WindowCleaning("2023 Seattle Ave NE", PropertySize.LARGE, true, 5, 0,2);
        RoofGutterCleaning newRoof = new RoofGutterCleaning("2024 Seattle Ave NE", PropertySize.MEDIUM, false, 3, 0,2.0,TypeOfRoof.MANSARD);
        assertFalse(testGardening.equals(newGarden));
        assertFalse(testWindowCleaning.equals(newWindow));
        assertFalse(testRoofGutterCleaning.equals(newRoof));
    }

    @Test
    void testEquals_DifferentMonthlyService() throws InvalidFloorException, RoofSquareNonPositiveException {
        Gardening newGarden =  new Gardening("2022 Seattle Ave NE", PropertySize.LARGE, true, 9, 0);
        WindowCleaning newWindow = new WindowCleaning("2023 Seattle Ave NE", PropertySize.MEDIUM, false, 5, 0,2);
        RoofGutterCleaning newRoof = new RoofGutterCleaning("2024 Seattle Ave NE", PropertySize.SMALL, true, 3, 0,2.0,TypeOfRoof.MANSARD);
        assertFalse(testGardening.equals(newGarden));
        assertFalse(testWindowCleaning.equals(newWindow));
        assertFalse(testRoofGutterCleaning.equals(newRoof));
    }
    @Test
    void testEquals_DifferentNumPastServices() throws InvalidFloorException, RoofSquareNonPositiveException {
        Gardening newGarden =  new Gardening("2022 Seattle Ave NE", PropertySize.LARGE, false, 10, 0);
        WindowCleaning newWindow = new WindowCleaning("2023 Seattle Ave NE", PropertySize.MEDIUM, true, 6, 0,2);
        RoofGutterCleaning newRoof = new RoofGutterCleaning("2024 Seattle Ave NE", PropertySize.SMALL, false, 4, 0,2.0,TypeOfRoof.MANSARD);
        assertFalse(testGardening.equals(newGarden));
        assertFalse(testWindowCleaning.equals(newWindow));
        assertFalse(testRoofGutterCleaning.equals(newRoof));
    }





    @Test
    void testHashCode() throws InvalidFloorException, RoofSquareNonPositiveException {
        Gardening newGarden =  new Gardening("2022 Seattle Ave NE", PropertySize.LARGE, false, 9, 0);
        WindowCleaning newWindow = new WindowCleaning("2023 Seattle Ave NE", PropertySize.MEDIUM, true, 5, 0,2);
        RoofGutterCleaning newRoof = new RoofGutterCleaning("2024 Seattle Ave NE", PropertySize.SMALL, false, 3, 0,2.0,TypeOfRoof.MANSARD);
        assertEquals(testGardening.hashCode(), newGarden.hashCode());
        assertEquals(testWindowCleaning.hashCode(), newWindow.hashCode());
        assertEquals(testRoofGutterCleaning.hashCode(), newRoof.hashCode());
    }



}