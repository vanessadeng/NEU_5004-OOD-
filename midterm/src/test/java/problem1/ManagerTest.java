package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    Manager testmanager;
    Manager testManager2;
    ContactInfo testcontactInfo;


    @BeforeEach
    void setUp() {
        testcontactInfo = new ContactInfo("123", "seattle", "7890", "5400", "68799", "123@com");
        testmanager = new Manager("782", testcontactInfo, LocalDate.of(2000, 3, 19), EducationLevel.ASSOCIATES_DEGREE, EmploymentLevel.ENTRY_LEVEL, 10000.0, 20.0, 0.0, 0.0, LocalDate.of(2003, 4, 5), 8, 7);
        testManager2 = new Manager("789", testcontactInfo, LocalDate.of(2003, 3, 19), EducationLevel.MASTERS_DEGREE, EmploymentLevel.EXECUTIVE_LEVEL, 50000.0, 20.0, 0.0, 0.0, LocalDate.of(2003, 4, 5), 8, 7);

    }

    @Test
    void getProjectBonus() {
        assertEquals(1.5, testmanager.getProjectBonus());

    }

    @Test
    void getEmployeeLevelBonus() {
        assertEquals(0.0, testmanager.getEmployeeLevelBonus());
    }

    @Test
    void getLastPromotionPenalty() {
        assertEquals(0.8, testmanager.getLastPromotionPenalty());
    }

    @Test
    void getBasePay() {
        assertEquals(20.0, testmanager.getBasePay());
    }

    @Test
    void getBonus() {
        assertEquals(0.0, testmanager.getBonus());

    }

    @Test
    void getOvertimePay() {
        assertEquals(0.0, testmanager.getOvertimePay());
    }

    @Test
    void getDayOfLastPromotion() {
        assertEquals(LocalDate.of(2003, 4, 5), testmanager.getDayOfLastPromotion());
    }

    @Test
    void getNumberOfProjects() {
        assertEquals(8, testmanager.getNumberOfProjects());
    }

    @Test
    void testEquals_null() {
        assertFalse(testmanager.equals(null));
    }
    @Test
    void testEquals_SameObjects() {
        assertTrue(testmanager.equals(testmanager));
    }

    @Test
    void testEquals_DifferentTypes() {
        assertFalse(testmanager.equals("test"));
    }
    @Test
    void testEquals_DifferentFields() {
        assertFalse(testmanager.equals(testManager2));

    }


    @Test
    void testHashCode() {
        assertFalse(testmanager.hashCode() == (testManager2.hashCode()));
    }

    @Test
    void estimateBaseProductivity() {
        assertEquals(500.0, testmanager.estimateBaseProductivity());
    }

    @Test
    void estimateProductivity() {
        assertEquals(500.7, testmanager.estimateProductivity());
    }

    @Test
    void getEmployeeID() {
        assertEquals("782", testmanager.getEmployeeID());
    }

    @Test
    void getContactInfo() {
        assertEquals(testcontactInfo, testmanager.getContactInfo());
    }

    @Test
    void getEmploymentDate() {
        assertEquals(LocalDate.of(2000, 3, 19), testmanager.getEmploymentDate());
    }

    @Test
    void getEducationLevel() {
        assertEquals(EducationLevel.ASSOCIATES_DEGREE, testmanager.getEducationLevel());
    }

    @Test
    void getEmploymentLevel() {
        assertEquals(EmploymentLevel.ENTRY_LEVEL, testmanager.getEmploymentLevel());
    }

    @Test
    void getLastYearEarnings() {
        assertEquals(10000.0, testmanager.getLastYearEarnings());
    }


    @Test
    void getManagerBonus() {
        assertEquals(0.0, testmanager.getManagerBonus());
    }

    @Test
    void getNumberOfManagedEmployees() {
        assertEquals(7, testmanager.getNumberOfManagedEmployees());

    }


    @Test
    void testToString() {
        String expectedString = "Manager{" +
                "numberOfManagedEmployees=" + testmanager.getNumberOfManagedEmployees() +
                ", basePay=" + testmanager.getBasePay() +
                ", bonus=" + testmanager.getBonus() +
                ", overtimePay=" + testmanager.getOvertimePay() +
                ", dayOfLastPromotion=" + testmanager.getDayOfLastPromotion() +
                ", numberOfProjects=" + testmanager.getNumberOfProjects() +
                ", employeeID='" + testmanager.getEmployeeID() + '\'' +
                ", contactInfo=" + testmanager.getContactInfo() +
                ", employmentDate=" + testmanager.getEmploymentDate() +
                ", educationLevel=" + testmanager.getEducationLevel() +
                ", employmentLevel=" + testmanager.getEmploymentLevel() +
                ", lastYearEarnings=" + testmanager.getLastYearEarnings() +
                '}';
    }
}


