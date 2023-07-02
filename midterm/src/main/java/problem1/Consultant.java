package problem1;

import java.time.LocalDate;
import java.util.Objects;

import static java.lang.Math.abs;

/**
 * Consultant is an object extends from Employee, has a constructor and a method to estimate productivity
 */
public class Consultant extends Employee{


    private Double consultingRate;
    private Integer contractualConsultHours;
    private Integer actualConsultHours;


    private static final Double consultingRateBump=1.7;
    private static final Integer rateThreshHold=800;
    private static final Integer dividingFactor=100;


    /**
     * @param employeeID employee ID
     * @param contactInfo contact information
     * @param employmentDate employment date
     * @param educationLevel education level
     * @param employmentLevel   employment level
     * @param lastYearEarnings last year earnings
     */
    public Consultant(String employeeID, ContactInfo contactInfo, LocalDate employmentDate, EducationLevel educationLevel, EmploymentLevel employmentLevel, Double lastYearEarnings) {
        super(employeeID, contactInfo, employmentDate, educationLevel, employmentLevel, lastYearEarnings);
    }


    /**
     * @return - a string representation of the object
     */
    public Double getBaseProductivity() {
        return (this.contractualConsultHours-this.actualConsultHours)/dividingFactor*consultingRate;
    }

    /**
     * @return - a string representation of the object
     */
    @Override
    public Double estimateProductivity() {
        if (this.consultingRate > rateThreshHold) {
            return this.getBaseProductivity() * consultingRateBump;
        } else {
            return this.getBaseProductivity();
        }

    }

    /**
     * @return - a string representation of the object
     */
    public Double getConsultingRate() {
        return consultingRate;
    }

    /**
     * @return - a string representation of the object
     */
    public Integer getContractualConsultHours() {
        return contractualConsultHours;
    }

    /**
     * @return - a string representation of the object
     */
    public Integer getActualConsultHours() {
        return actualConsultHours;
    }

    /**
     * @param o - an object
     * @return - a boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Consultant that = (Consultant) o;
        return Objects.equals(consultingRate, that.consultingRate) && Objects.equals(contractualConsultHours, that.contractualConsultHours) && Objects.equals(actualConsultHours, that.actualConsultHours);
    }

    /**
     * @return - a string representation of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), consultingRate, contractualConsultHours, actualConsultHours);
    }

    /**
     * @return - a string representation of the object
     */
    @Override
    public String toString() {
        return "Consultant{" +
                "consultingRate=" + consultingRate +
                ", contractualConsultHours=" + contractualConsultHours +
                ", actualConsultHours=" + actualConsultHours +
                ", employeeID='" + employeeID + '\'' +
                ", contactInfo=" + contactInfo +
                ", employmentDate=" + employmentDate +
                ", educationLevel=" + educationLevel +
                ", employmentLevel=" + employmentLevel +
                ", lastYearEarnings=" + lastYearEarnings +
                '}';
    }
}
