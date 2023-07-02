package problem1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Class HourlyEmployee is a subclass of PartTimeEmployee that contains information about a person's employee ID,
 */
public class HourlyEmployee extends PartTimeEmployee{

    private Double hourlyEarnings;
    private static final Double hourlyEarningBonus=3.0;

    /**
     * @param employeeID  - employee ID
     * @param contactInfo - contact info
     * @param employmentDate - employment date
     * @param educationLevel - education level
     * @param employmentLevel - employment level
     * @param lastYearEarnings - last year earnings
     */
    public HourlyEmployee(String employeeID, ContactInfo contactInfo, LocalDate employmentDate, EducationLevel educationLevel, EmploymentLevel employmentLevel, Double lastYearEarnings) {
        super(employeeID, contactInfo, employmentDate, educationLevel, employmentLevel, lastYearEarnings);
    }

    /**
     * @return - a string representation of the object
     */
    public Double getHourlyEarnings() {
        return hourlyEarnings;
    }

    public Double getHourlyEarningBonus() {
        if (this.hourlyEarnings < 14) {
            return this.hourlyEarningBonus;
        } else {
            return 0.0;
        }
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
        HourlyEmployee that = (HourlyEmployee) o;
        return Objects.equals(hourlyEarnings, that.hourlyEarnings);
    }

    /**
     * @return - hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hourlyEarnings);
    }

    /**
     * @return - a string representation of the object
     */
    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyEarnings=" + hourlyEarnings +
                ", contractedNumWorkHours=" + contractedNumWorkHours +
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

    /**
     * @return - estimated productivity
     */
    @Override
    public Double estimateProductivity() {
        return super.estimateBaseProductivity()+this.getHourlyEarningBonus();
    }
}
