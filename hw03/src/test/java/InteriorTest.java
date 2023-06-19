import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InteriorTest {
    private Cleaning testCleaning;
    private Painting testPainting;

    @BeforeEach
    void setUp() throws PetsNegativeException {
        testCleaning = new Cleaning("2022 Seattle Ave NE", PropertySize.LARGE, false, 9, 0,2);
        testPainting = new Painting("2023 Seattle Ave NE", PropertySize.MEDIUM, true, 5, 0,3);

    }

    @Test
    void getNumOfPets() {
        assertEquals(2, testCleaning.getNumOfPets());
        assertEquals(3, testPainting.getNumOfPets());
    }

    @Test
    void getPropertyAddress() {
        assertEquals("2022 Seattle Ave NE", testCleaning.getPropertyAddress());
        assertEquals("2023 Seattle Ave NE", testPainting.getPropertyAddress());


    }

    @Test
    void setPropertyAddress() {
        testCleaning.setPropertyAddress("2024 Seattle Ave NE");
        testPainting.setPropertyAddress("2025 Seattle Ave NE");
        assertEquals("2024 Seattle Ave NE", testCleaning.getPropertyAddress());
        assertEquals("2025 Seattle Ave NE", testPainting.getPropertyAddress());
    }

    @Test
    void getPropertySize() {
        assertEquals(PropertySize.LARGE, testCleaning.getPropertySize());
        assertEquals(PropertySize.MEDIUM, testPainting.getPropertySize());
    }

    @Test
    void setPropertySize() {
        testCleaning.setPropertySize(PropertySize.SMALL);
        testPainting.setPropertySize(PropertySize.LARGE);
        assertEquals(PropertySize.SMALL, testCleaning.getPropertySize());
        assertEquals(PropertySize.LARGE, testPainting.getPropertySize());
    }

    @Test
    void getMonthlyService() {
        assertFalse(testCleaning.getMonthlyService());
        assertTrue(testPainting.getMonthlyService());
    }

    @Test
    void setMonthlyService() {
        testCleaning.setMonthlyService(true);
        testPainting.setMonthlyService(false);
        assertTrue(testCleaning.getMonthlyService());
        assertFalse(testPainting.getMonthlyService());
    }

    @Test
    void getNumPastServices() {
        assertEquals(9, testCleaning.getNumPastServices());
        assertEquals(5, testPainting.getNumPastServices());
    }

    @Test
    void setNumPastServices() {
        testCleaning.setNumPastServices(10);
        testPainting.setNumPastServices(6);
        assertEquals(10, testCleaning.getNumPastServices());
        assertEquals(6, testPainting.getNumPastServices());
    }

    @Test
    void calculatePrice() {
        Painting testPaintingLarge = new Painting("large home", PropertySize.LARGE, true, 5, 0, 0);
        // when there is no pet
        assertEquals(168.0, testCleaning.calculatePrice());
        assertEquals(1232.64, testPainting.calculatePrice()); // painting for MEDIUM property
        assertEquals(1728.0, testPaintingLarge.calculatePrice()); // painting for LARGE property

    }
    @Test
    void testEquals_SameObject() {
        assertTrue(testCleaning.equals(testCleaning));
        assertTrue(testPainting.equals(testPainting));
    }

    @Test
    void testEquals_DifferentObject() throws RoofSquareNonPositiveException {
        //"home", PropertySize.LARGE, true, 18
        RoofGutterCleaning testRoofGutterCleaning = new RoofGutterCleaning("home", PropertySize.LARGE,true, 18, 2, 120.0, TypeOfRoof.FLAT);
        assertFalse(testCleaning.equals(testRoofGutterCleaning));
        assertFalse(testPainting.equals(testRoofGutterCleaning));
    }

    @Test
    void testEquals_NullObject() {
        assertFalse(testCleaning.equals(null));
        assertFalse(testPainting.equals(null));
    }

    @Test
    void testEquals_DifferentPropertyAddress() throws PetsNegativeException {
        Cleaning newCleaning = new Cleaning("123 Seattle Ave NE", PropertySize.LARGE, false, 9, 0,0);
        Painting newPainting = new Painting("456 Seattle Ave NE", PropertySize.MEDIUM, true, 5, 0,0);
        assertFalse(testCleaning.equals(newCleaning));
        assertFalse(testPainting.equals(newPainting));
    }


    @Test
    void testEquals_DifferentPropertySize() throws PetsNegativeException {
        Cleaning newCleaning = new Cleaning("2022 Seattle Ave NE", PropertySize.SMALL, false, 9, 0,0);
        Painting newPainting = new Painting("2023 Seattle Ave NE", PropertySize.LARGE, true, 5, 0,0);
        assertFalse(testCleaning.equals(newCleaning));
        assertFalse(testPainting.equals(newPainting));
    }

    @Test
    void testEquals_DifferentNumOfServiceReceived() throws PetsNegativeException {
        Cleaning newCleaning = new Cleaning("2022 Seattle Ave NE", PropertySize.LARGE, false, 100, 0,0);
        Painting newPainting = new Painting("2023 Seattle Ave NE", PropertySize.MEDIUM, true, 100, 0,0);
        assertFalse(testCleaning.equals(newCleaning));
        assertFalse(testPainting.equals(newPainting));

    }




    @Test
    void testHashCode() throws PetsNegativeException {
        Cleaning newCleaning = new Cleaning("2022 Seattle Ave NE", PropertySize.LARGE, false, 9, 0,0);
        Painting newPainting = new Painting("2023 Seattle Ave NE", PropertySize.MEDIUM, true, 5, 0,0);
        assertTrue(newCleaning.hashCode() == testCleaning.hashCode());
        assertTrue(newPainting.hashCode() == testPainting.hashCode());
    }

    @Test
    void testToString() {
        String expectedString = "Cleaning{" +
                "numOfPets=" + testCleaning.numOfPets +
                ", petFeeRate=" + testCleaning.petFeeRate +
                ", estimatedHours=" + testCleaning.estimatedHours +
                ", discountRate=" + testCleaning.discountRate +
                ", propertyAddress='" + testCleaning.propertyAddress + '\'' +
                ", propertySize=" + testCleaning.propertySize +
                ", isMonthlyService=" + testCleaning.isMonthlyService +
                ", numPastServices=" + testCleaning.numPastServices +
                '}';
        assertEquals(expectedString, testCleaning.toString());
    }
}