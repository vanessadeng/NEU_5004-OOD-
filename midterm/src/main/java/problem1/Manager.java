package problem1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Class Manager represents a manager in a company. It extends the FullTimeEmployee class.
 */
public class Manager extends FullTimeEmployee{

    private Integer numberOfManagedEmployees;

    private static final Double managerBonus=1.8;

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
     * @param dayOfLastPromotion    - day of last promotion
     * @param numberOfProjects - number of projects
     * @param numberOfManagedEmployees - number of managed employees
     */
    public Manager(String employeeID, ContactInfo contactInfo, LocalDate employmentDate, EducationLevel educationLevel, EmploymentLevel employmentLevel, Double lastYearEarnings, Double basePay, Double bonus, Double overtimePay, LocalDate dayOfLastPromotion, Integer numberOfProjects, Integer numberOfManagedEmployees) {
        super(employeeID, contactInfo, employmentDate, educationLevel, employmentLevel, lastYearEarnings, basePay, bonus, overtimePay, dayOfLastPromotion, numberOfProjects);
        this.numberOfManagedEmployees = numberOfManagedEmployees;
    }

    /**
     * @return - a string representation of the object
     */
    public Double getManagerBonus() {
        if (this.numberOfManagedEmployees > 10) {
            return this.managerBonus;
        }else{
            return 0.0;
        }
    }

    /**
     * @return - a string representation of the object
     */
    public Integer getNumberOfManagedEmployees() {
        return numberOfManagedEmployees;
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
        Manager manager = (Manager) o;
        return Objects.equals(numberOfManagedEmployees, manager.numberOfManagedEmployees);
    }

    /**
     * @return - hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfManagedEmployees);
    }

    /**
     * @return  - a string representation of the object
     */
    @Override
    public String toString() {
        return "Manager{" +
                "numberOfManagedEmployees=" + numberOfManagedEmployees +
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
     * @return - estimated productivity
     */
    @Override
    public Double estimateProductivity() {
        return super.estimateProductivity()+this.getManagerBonus();
    }
}
