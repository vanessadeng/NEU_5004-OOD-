package problem1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Class Employee is an abstract class that contains information about a person's employee ID,
 */
public abstract class FullTimeEmployee extends Employee {

    protected Double basePay;
    protected Double bonus;
    protected Double overtimePay;
    protected LocalDate dayOfLastPromotion;
    protected Integer numberOfProjects;

    private static final Double projectBonus=1.5;
    private static final Double employeeLevelBonus=1.4;
    private static final Double promotionPenalty=0.8;

    /**
     * @param employeeID     - employee ID
     * @param contactInfo   - contact info
     * @param employmentDate - employment date
     * @param educationLevel - education level
     * @param employmentLevel - employment level
     * @param lastYearEarnings - last year earnings
     * @param basePay - base pay
     * @param bonus - bonus
     * @param overtimePay - overtime pay
     * @param dayOfLastPromotion - day of last promotion
     * @param numberOfProjects - number of projects
     */
    public FullTimeEmployee(String employeeID, ContactInfo contactInfo, LocalDate employmentDate, EducationLevel educationLevel, EmploymentLevel employmentLevel, Double lastYearEarnings, Double basePay, Double bonus, Double overtimePay, LocalDate dayOfLastPromotion, Integer numberOfProjects) {
        super(employeeID, contactInfo, employmentDate, educationLevel, employmentLevel, lastYearEarnings);
        this.basePay = basePay;
        this.bonus = bonus;
        this.overtimePay = overtimePay;
        this.dayOfLastPromotion = dayOfLastPromotion;
        this.numberOfProjects = numberOfProjects;
    }

    /**
     * @return - a string representation of the object
     */
    public Double getProjectBonus() {
        if (this.numberOfProjects > 2) {
            return this.projectBonus;
        } else {
            return 0.0;
        }

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
    public Double getLastPromotionPenalty(){
        if (LocalDate.now().getYear()-this.dayOfLastPromotion.getYear()>3){
            return this.promotionPenalty;
        }else{
            return 0.0;
        }
    }

    /**
     * @return - a string representation of the object
     */
    public Double getBasePay() {
        return basePay;
    }

    /**
     * @return - a string representation of the object
     */
    public Double getBonus() {
        return bonus;
    }

    /**
     * @return - a string representation of the object
     */
    public Double getOvertimePay() {
        return overtimePay;
    }

    /**
     * @return - a string representation of the object
     */
    public LocalDate getDayOfLastPromotion() {
        return dayOfLastPromotion;
    }

    /**
     * @return - a string representation of the object
     */
    public Integer getNumberOfProjects() {
        return numberOfProjects;
    }

    /**
     * @param o - other object to compare
     * @return - true if two objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FullTimeEmployee that = (FullTimeEmployee) o;
        return Objects.equals(basePay, that.basePay) && Objects.equals(bonus, that.bonus) && Objects.equals(overtimePay, that.overtimePay) && Objects.equals(dayOfLastPromotion, that.dayOfLastPromotion) && Objects.equals(numberOfProjects, that.numberOfProjects);
    }

    /**
     * @return - hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), basePay, bonus, overtimePay, dayOfLastPromotion, numberOfProjects);
    }

    /**
     * @return - a string representation of the object
     */
    public Double estimateBaseProductivity() {
        return this.lastYearEarnings/this.basePay;
    }

    /**
     * @return - a string representation of the object
     */
    public Double estimateProductivity() {
        return this.estimateBaseProductivity() + this.getProjectBonus()-this.getLastPromotionPenalty()+this.getEmployeeLevelBonus();
    }

}
