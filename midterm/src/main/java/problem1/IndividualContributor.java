package problem1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Class IndividualContributor represents an individual contributor in our program.
 */
public class IndividualContributor extends FullTimeEmployee{


    private Integer numberOfPatents;
    private Integer numberOfPublications;
    private Integer numberOfExternalCollaborations;

    private static final Double individualContributorBonus=1.3;

    /**
     * @param employeeID - employee ID
     * @param contactInfo - contact info
     * @param employmentDate - employment date
     * @param educationLevel - education level
     * @param employmentLevel - employment level
     * @param lastYearEarnings - last year earnings
     * @param basePay - base pay
     * @param bonus - bonus
     * @param overtimePay - overtime pay
     * @param dayOfLastPromotion - day of last promotion
     * @param numberOfProjects - number of projects
     * @param numberOfPatents - number of patents
     * @param numberOfPublications - number of publications
     * @param numberOfExternalCollaborations - number of external collaborations
     */
    public IndividualContributor(String employeeID, ContactInfo contactInfo, LocalDate employmentDate, EducationLevel educationLevel, EmploymentLevel employmentLevel, Double lastYearEarnings, Double basePay, Double bonus, Double overtimePay, LocalDate dayOfLastPromotion, Integer numberOfProjects, Integer numberOfPatents, Integer numberOfPublications, Integer numberOfExternalCollaborations) {
        super(employeeID, contactInfo, employmentDate, educationLevel, employmentLevel, lastYearEarnings, basePay, bonus, overtimePay, dayOfLastPromotion, numberOfProjects);
        this.numberOfPatents = numberOfPatents;
        this.numberOfPublications = numberOfPublications;
        this.numberOfExternalCollaborations = numberOfExternalCollaborations;
    }

    /**
     * @return - a string representation of the object
     */
    public Integer getNumberOfPatents() {
        return numberOfPatents;
    }

    /**
     * @return - a string representation of the object
     */
    public Integer getNumberOfPublications() {
        return numberOfPublications;
    }

    /**
     * @return - a string representation of the object
     */
    public Integer getNumberOfExternalCollaborations() {
        return numberOfExternalCollaborations;
    }

    /**
     * @param o - other object to compare to
     * @return - true if the two objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IndividualContributor that = (IndividualContributor) o;
        return Objects.equals(numberOfPatents, that.numberOfPatents) && Objects.equals(numberOfPublications, that.numberOfPublications) && Objects.equals(numberOfExternalCollaborations, that.numberOfExternalCollaborations);
    }

    /**
     * @return - hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPatents, numberOfPublications, numberOfExternalCollaborations);
    }

    /**
     * @return - a string representation of the object
     */
    @Override
    public String toString() {
        return "IndividualContributor{" +
                "numberOfPatents=" + numberOfPatents +
                ", numberOfPublications=" + numberOfPublications +
                ", numberOfExternalCollaborations=" + numberOfExternalCollaborations +
                ", basePay=" + basePay +
                ", bonus=" + bonus +
                ", overtimePay=" + overtimePay +
                ", dayOfLastPromotion=" + dayOfLastPromotion +
                ", numberOfProjects=" + numberOfProjects +
                ", employeeID='" + employeeID + '\'' +
                ", contactInfo=" + contactInfo +
                ", employmentDate=" + employmentDate +
                ", educationLevel=" + educationLevel +
                ", employmentLevel=" + employmentLevel +
                ", lastYearEarnings=" + lastYearEarnings +
                '}';
    }

    /**
     * @return - individual contributor bonus
     */
    public Double getIndividualContributorBonus() {
        if (this.numberOfPatents > 4) {
            return individualContributorBonus;
        }else{
            return 0.0;
        }
    }

    /**
     * @return - estimated productivity
     */
    @Override
    public Double estimateProductivity(){
         return super.estimateProductivity()+this.getIndividualContributorBonus();
    }
    }

