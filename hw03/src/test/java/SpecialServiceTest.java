import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialServiceTest {

    private Electrical testElectrical;
    private InternetTVComputing testInternetTVComputing;
    private Plumbing testPlumbing;


    @BeforeEach
    void setUp() throws ExceedMaxSpecialistException {

        testElectrical = new Electrical("house without electricity", PropertySize.LARGE, true, 5, 3, true);
        testInternetTVComputing = new InternetTVComputing("house without internet", PropertySize.MEDIUM, true, 5, 2, true);
        testPlumbing = new Plumbing("house without good toilet", PropertySize.LARGE, true, 5, 3, true);
    }

    @Test
    void getPropertyAddress() {
        assertEquals("house without electricity", testElectrical.getPropertyAddress());
        assertEquals("house without internet", testInternetTVComputing.getPropertyAddress());
        assertEquals("house without good toilet", testPlumbing.getPropertyAddress());
    }

    @Test
    void setPropertyAddress() {
        testElectrical.setPropertyAddress("house with electricity");
        testInternetTVComputing.setPropertyAddress("house with internet");
        testPlumbing.setPropertyAddress("house with good toilet");
        assertEquals("house with electricity", testElectrical.getPropertyAddress());
        assertEquals("house with internet", testInternetTVComputing.getPropertyAddress());
        assertEquals("house with good toilet", testPlumbing.getPropertyAddress());
    }

    @Test
    void getPropertySize() {
        assertEquals(PropertySize.LARGE, testElectrical.getPropertySize());
        assertEquals(PropertySize.MEDIUM, testInternetTVComputing.getPropertySize());
        assertEquals(PropertySize.LARGE, testPlumbing.getPropertySize());
    }

    @Test
    void setPropertySize() {
        testElectrical.setPropertySize(PropertySize.SMALL);
        testInternetTVComputing.setPropertySize(PropertySize.LARGE);
        testPlumbing.setPropertySize(PropertySize.SMALL);
        assertEquals(PropertySize.SMALL, testElectrical.getPropertySize());
        assertEquals(PropertySize.LARGE, testInternetTVComputing.getPropertySize());
        assertEquals(PropertySize.SMALL, testPlumbing.getPropertySize());
    }

    @Test
    void getMonthlyService() {
        assertTrue(testElectrical.getMonthlyService());
        assertTrue(testInternetTVComputing.getMonthlyService());
        assertTrue(testPlumbing.getMonthlyService());
    }

    @Test
    void setMonthlyService() {
        testElectrical.setMonthlyService(false);
        testInternetTVComputing.setMonthlyService(false);
        testPlumbing.setMonthlyService(false);
        assertFalse(testElectrical.getMonthlyService());
        assertFalse(testInternetTVComputing.getMonthlyService());
        assertFalse(testPlumbing.getMonthlyService());
    }

    @Test
    void getNumPastServices() {
        assertEquals(5, testElectrical.getNumPastServices());
        assertEquals(5, testInternetTVComputing.getNumPastServices());
        assertEquals(5, testPlumbing.getNumPastServices());
    }

    @Test
    void setNumPastServices() {
        testElectrical.setNumPastServices(6);
        testInternetTVComputing.setNumPastServices(6);
        testPlumbing.setNumPastServices(6);
        assertEquals(6, testElectrical.getNumPastServices());
        assertEquals(6, testInternetTVComputing.getNumPastServices());
        assertEquals(6, testPlumbing.getNumPastServices());
    }

    @Test
    void testEquals() throws ExceedMaxSpecialistException {
        Electrical testElectrical2 = new Electrical("house without electricity", PropertySize.LARGE, true, 5, 3, true);
        InternetTVComputing testInternetTVComputing2 = new InternetTVComputing("house without internet", PropertySize.MEDIUM, true, 5, 2, true);
        Plumbing testPlumbing2 = new Plumbing("house without good toilet", PropertySize.LARGE, true, 5, 3, true);
        assertEquals(testElectrical, testElectrical2);
        assertEquals(testInternetTVComputing, testInternetTVComputing2);
        assertEquals(testPlumbing, testPlumbing2);

    }

    @Test
    void testHashCode() throws ExceedMaxSpecialistException {
        Electrical testElectrical2 = new Electrical("house without electricity", PropertySize.LARGE, true, 5, 3, true);
        InternetTVComputing testInternetTVComputing2 = new InternetTVComputing("house without internet", PropertySize.MEDIUM, true, 5, 2, true);
        Plumbing testPlumbing2 = new Plumbing("house without good toilet", PropertySize.LARGE, true, 5, 3, true);
        assertEquals(testElectrical.hashCode(), testElectrical2.hashCode());
        assertEquals(testInternetTVComputing.hashCode(), testInternetTVComputing2.hashCode());
        assertEquals(testPlumbing.hashCode(), testPlumbing2.hashCode());

    }

    @Test
    void getRequiredLicensedEmployee() {



    }

    @Test
    void setRequiredLicensedEmployee() {
    }

    @Test
    void getComplex() {

    }

    @Test
    void setComplex() {

    }

    @Test
    void calculatePrice() {
        assertEquals(650.0, testElectrical.calculatePrice());
        assertEquals(415.0, testInternetTVComputing.calculatePrice());
        assertEquals(620.0, testPlumbing.calculatePrice());
    }




}