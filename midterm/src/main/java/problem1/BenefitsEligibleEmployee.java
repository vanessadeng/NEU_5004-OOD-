package problem1;

import java.time.LocalDate;

/**
 * BenefitsEligibleEmployee is an object extends PartTimeEmployee and has all the fields and methods of PartTimeEmployee
 */
public class BenefitsEligibleEmployee extends PartTimeEmployee{
    /**
     * @param employeeID        - employee ID
     * @param contactInfo      - contact info
     * @param employmentDate  - employment date
     * @param educationLevel - education level
     * @param employmentLevel  - employment level
     * @param lastYearEarnings - last year earnings
     */
    public BenefitsEligibleEmployee(String employeeID, ContactInfo contactInfo, LocalDate employmentDate, EducationLevel educationLevel, EmploymentLevel employmentLevel, Double lastYearEarnings) {
        super(employeeID, contactInfo, employmentDate, educationLevel, employmentLevel, lastYearEarnings);
    }


    /**
     * @return - a string representation of the object
     */
    @Override
    public String toString() {
        return "BenefitsEligibleEmployee{" +
                "contractedNumWorkHours=" + contractedNumWorkHours +
                ", actualNumWorkHours=" + actualNumWorkHours +
                ", bonusAndOvertimeEarnings=" + bonusAndOvertimeEarnings +
                ", employeeID='" + employeeID + '\'' +
                ", contactInfo=" + contactInfo +
                ", employmentDate=" + employmentDate +
                ", educationLevel=" + educationLevel +
                ", employmentLevel=" + employmentLevel +
                ", lastYearEarnings=" + lastYearEarnings +
                '}';
    }

    @Override
    public Double estimateProductivity() {
        return super.estimateBaseProductivity();
    }
}
