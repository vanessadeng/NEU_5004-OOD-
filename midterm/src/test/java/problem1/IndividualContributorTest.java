package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class IndividualContributorTest {

    IndividualContributor testIndividualContributor;
    ContactInfo testContactInfo;
    IndividualContributor testIndividualContributor2;

    @BeforeEach
    void setUp() {
        testContactInfo = new ContactInfo("123", "seattle", "7890", "5400", "68799", "123@com");
        testIndividualContributor = new IndividualContributor("1233", testContactInfo, LocalDate.of(2000, 3, 19), EducationLevel.ASSOCIATES_DEGREE, EmploymentLevel.ENTRY_LEVEL, 10000.0, 50.0, 0.0, 0.0, LocalDate.of(2003, 4, 5), 8, 7, 8, 10);
        testIndividualContributor2 = new IndividualContributor("12", testContactInfo, LocalDate.of(2010, 3, 19), EducationLevel.BACHELORS_DEGREE, EmploymentLevel.ENTRY_LEVEL, 10000.0, 50.0, 0.0, 0.0, LocalDate.of(2003, 4, 5), 8, 7, 8, 10);

    }
    @Test
    void getNumberOfPatents() {
        assertEquals(7, testIndividualContributor.getNumberOfPatents());
    }

    @Test
    void getNumberOfPublications() {
        assertEquals(8, testIndividualContributor.getNumberOfPublications());
    }

    @Test
    void getNumberOfExternalCollaborations() {
        assertEquals(10, testIndividualContributor.getNumberOfExternalCollaborations());
    }

    @Test
    void testEquals_null() {
        assertFalse(testIndividualContributor.equals(null));
    }
    @Test
    void testEquals_SameObjects() {
        assertTrue(testIndividualContributor.equals(testIndividualContributor));
    }
    @Test
    void testEquals_DifferentClass() {
        assertFalse(testIndividualContributor.equals(testContactInfo));
    }
    @Test
    void testEquals_DifferentFields() {
        assertFalse(testIndividualContributor.equals(testIndividualContributor2));
    }


    @Test
    void testHashCode() {
        assertFalse(testIndividualContributor.hashCode() == testIndividualContributor2.hashCode());
    }

    @Test
    void testToString() {
        String expectedString = "IndividualContributor{" +
                "numberOfPatents=" + testIndividualContributor.getNumberOfPatents() +
                ", numberOfPublications=" + testIndividualContributor.getNumberOfPublications() +
                ", numberOfExternalCollaborations=" + testIndividualContributor.getNumberOfExternalCollaborations() +
                ", basePay=" + testIndividualContributor.getBasePay() +
                ", bonus=" + testIndividualContributor.getBonus() +
                ", overtimePay=" + testIndividualContributor.getOvertimePay() +
                ", dayOfLastPromotion=" + testIndividualContributor.getDayOfLastPromotion() +
                ", numberOfProjects=" + testIndividualContributor.getNumberOfProjects() +
                ", employeeID='" + testIndividualContributor.getEmployeeID() + '\'' +
                ", contactInfo=" + testIndividualContributor.getContactInfo() +
                ", employmentDate=" + testIndividualContributor.getEmploymentDate() +
                ", educationLevel=" + testIndividualContributor.getEducationLevel()+
                ", employmentLevel=" + testIndividualContributor.getEducationLevel()+
                ", lastYearEarnings=" + testIndividualContributor.getLastYearEarnings()+
                '}';
    }

    @Test
    void getIndividualContributorBonus() {
    }

    @Test
    void estimateProductivity() {
    }
}