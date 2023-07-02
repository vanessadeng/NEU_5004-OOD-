package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FullTimeEmployeeTest {

    private IndividualContributor testindividualContributor;
    private Manager testmanager;
    private ContactInfo testcontactInfo;
    private ContactInfo testcontactInfo2;

    @BeforeEach
    void setUp() {
        testcontactInfo = new ContactInfo("123", "seattle", "7890","5400","68799","123@com");
        testindividualContributor = new IndividualContributor("1233", testcontactInfo, LocalDate.of(2000,3,19), EducationLevel.ASSOCIATES_DEGREE, EmploymentLevel.ENTRY_LEVEL, 10000.0, 50.0, 0.0, 0.0, LocalDate.of(2003,4,5), 8,7,8,10);
        testmanager = new Manager("782", testcontactInfo2, LocalDate.of(2000,3,19), EducationLevel.ASSOCIATES_DEGREE, EmploymentLevel.ENTRY_LEVEL, 10000.0, 20.0, 0.0, 0.0, LocalDate.of(2003,4,5), 8,7);
    }

    @Test
    void getEmployeeID() {
        assertEquals("782", testmanager.getEmployeeID());
        assertEquals("1233", testindividualContributor.getEmployeeID());
    }

    @Test
    void getContactInfo() {
        assertEquals(testcontactInfo2, testmanager.getContactInfo());
        assertEquals(testcontactInfo, testindividualContributor.getContactInfo());
    }

    @Test
    void getEmploymentDate() {
        assertEquals(LocalDate.of(2000,3,19), testmanager.getEmploymentDate());
        assertEquals(LocalDate.of(2000,3,19), testindividualContributor.getEmploymentDate());
    }

    @Test
    void getEducationLevel() {
        assertEquals(EducationLevel.ASSOCIATES_DEGREE, testmanager.getEducationLevel());
        assertEquals(EducationLevel.ASSOCIATES_DEGREE, testindividualContributor.getEducationLevel());
    }

    @Test
    void getEmploymentLevel() {
        assertEquals(EmploymentLevel.ENTRY_LEVEL, testmanager.getEmploymentLevel());
        assertEquals(EmploymentLevel.ENTRY_LEVEL, testindividualContributor.getEmploymentLevel());
    }

    @Test
    void getLastYearEarnings() {
        assertEquals(10000.0, testmanager.getLastYearEarnings());
        assertEquals(10000.0, testindividualContributor.getLastYearEarnings());
    }

    @Test
    void testEquals_null() {
        assertFalse(testmanager.equals(null));
        assertFalse(testindividualContributor.equals(null));
    }

    @Test
    void testEquals_SameObjects() {
        assertTrue(testmanager.equals(testmanager));
        assertTrue(testindividualContributor.equals(testindividualContributor));
    }

    @Test
    void testEquals_DifferentTypes() {
        assertFalse(testmanager.equals(testindividualContributor));
        assertFalse(testindividualContributor.equals(testmanager));
    }

    @Test
    void testHashCode() {
        assertEquals(testmanager.hashCode(), testmanager.hashCode());
        assertEquals(testindividualContributor.hashCode(), testindividualContributor.hashCode());
    }

    @Test
    void getProjectBonus() {
        assertEquals(1.5, testmanager.getProjectBonus());
        assertEquals(1.5, testindividualContributor.getProjectBonus());

    }

    @Test
    void getEmployeeLevelBonus() {
        assertEquals(0.0, testmanager.getEmployeeLevelBonus());
        assertEquals(0.0, testindividualContributor.getEmployeeLevelBonus());
    }

    @Test
    void getLastPromotionPenalty() {
        assertEquals(0.8, testmanager.getLastPromotionPenalty());
        assertEquals(0.8, testindividualContributor.getLastPromotionPenalty());
    }

    @Test
    void getBasePay() {
        assertEquals(20.0, testmanager.getBasePay());
        assertEquals(50.0, testindividualContributor.getBasePay());
    }

    @Test
    void getBonus() {
        assertEquals(0.0, testmanager.getBonus());
        assertEquals(0.0, testindividualContributor.getBonus());
    }

    @Test
    void getOvertimePay() {
        assertEquals(0.0, testmanager.getOvertimePay());
        assertEquals(0.0, testindividualContributor.getOvertimePay());

    }

    @Test
    void getDayOfLastPromotion() {
        assertEquals(LocalDate.of(2003,4,5), testmanager.getDayOfLastPromotion());
        assertEquals(LocalDate.of(2003,4,5), testindividualContributor.getDayOfLastPromotion());
    }

    @Test
    void getNumberOfProjects() {
        assertEquals(8, testmanager.getNumberOfProjects());
        assertEquals(8, testindividualContributor.getNumberOfProjects());
    }

    @Test
    void testEquals1_DiffrentFields() {
        Manager testmanager2 = new Manager("678", testcontactInfo2, LocalDate.of(2000,3,19), EducationLevel.ASSOCIATES_DEGREE, EmploymentLevel.ENTRY_LEVEL, 10000.0, 20.0, 0.0, 0.0, LocalDate.of(2003,4,5), 8,7);
        assertFalse(testmanager.equals(testmanager2));

        Manager testManager3 = new Manager("782", testcontactInfo2, LocalDate.of(2000,3,19), EducationLevel.ASSOCIATES_DEGREE, EmploymentLevel.INTERMEDIATE_LEVEL, 10000.0, 20.0, 0.0, 0.0, LocalDate.of(2003,4,5), 8,6);
        assertFalse(testmanager.equals(testManager3));

        Manager testManager4 = new Manager("782", testcontactInfo2, LocalDate.of(2022,3,19), EducationLevel.ASSOCIATES_DEGREE, EmploymentLevel.ENTRY_LEVEL, 10000.0, 20.0, 0.0, 0.0, LocalDate.of(2003,4,5), 9,8);
        assertFalse(testmanager.equals(testManager4));
    }

    @Test
    void testHashCode1() {
        assertFalse(testmanager.hashCode() == testindividualContributor.hashCode());
    }

    @Test
    void estimateBaseProductivity() {
        assertEquals(500.0, testmanager.estimateBaseProductivity());
        assertEquals(200.0, testindividualContributor.estimateBaseProductivity());
    }

    @Test
    void estimateProductivity() {
        assertEquals(500.7, testmanager.estimateProductivity());
        assertEquals(202.0, testindividualContributor.estimateProductivity());
    }
}