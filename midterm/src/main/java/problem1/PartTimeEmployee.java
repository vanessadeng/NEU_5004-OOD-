package problem1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Class Employee is an abstract class that contains information about a person's employee ID,
 */
public abstract class PartTimeEmployee extends Employee{

    protected Double contractedNumWorkHours;
    protected Double actualNumWorkHours;
    private static final Double MULTIPLY_FACTOR = 3.7;
    private static final Double employeeLevelBonus = 1.4;

    protected Double bonusAndOvertimeEarnings;

    /**
     * @param employeeID       - employee ID
     * @param contactInfo     - contact info
     * @param employmentDate - employment date
     * @param educationLevel - education level
     * @param employmentLevel - employment level
     * @param lastYearEarnings - last year earnings
     */
    public PartTimeEmployee(String employeeID, ContactInfo contactInfo, LocalDate employmentDate, EducationLevel educationLevel, EmploymentLevel employmentLevel, Double lastYearEarnings) {
        super(employeeID, contactInfo, employmentDate, educationLevel, employmentLevel, lastYearEarnings);
    }


    /**
     * @return - a string representation of the object
     */
    public Double getEmployeeLevelBonus(){
        if (this.employmentLevel.equals(EmploymentLevel.INTERMEDIATE_LEVEL)){
            return this.employeeLevelBonus;
        }else{
            return 0.0;
        }
    }

    /**
     * @return - a string representation of the object
     */
    public Double getContractedNumWorkHours() {
        return contractedNumWorkHours;
    }

    /**
     * @return - a string representation of the object
     */
    public Double getActualNumWorkHours() {
        return actualNumWorkHours;
    }

    /**
     * @return - a string representation of the object
     */
    public Double getBonusAndOvertimeEarnings() {
        return bonusAndOvertimeEarnings;
    }

    /**
     * @param o - other object to be compared
     * @return - true if two objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PartTimeEmployee that = (PartTimeEmployee) o;
        return Objects.equals(contractedNumWorkHours, that.contractedNumWorkHours) && Objects.equals(actualNumWorkHours, that.actualNumWorkHours) && Objects.equals(bonusAndOvertimeEarnings, that.bonusAndOvertimeEarnings);
    }

    /**
     * @return - hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), contractedNumWorkHours, actualNumWorkHours, bonusAndOvertimeEarnings);
    }

    /**
     * @return - a string representation of the object
     */
    public Double estimateBaseProductivity() {
        return this.actualNumWorkHours / this.contractedNumWorkHours * MULTIPLY_FACTOR+this.getEmployeeLevelBonus();
    }



}
