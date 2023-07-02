package problem1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Class Employee is an abstract class that contains information about a person's employee ID,
 */
public abstract class Employee implements ProductivitySystem{

    protected String employeeID;
    protected ContactInfo contactInfo;
    protected LocalDate employmentDate;

    protected EducationLevel educationLevel;
    protected EmploymentLevel employmentLevel;

    protected Double lastYearEarnings;

    /**
     * @param employeeID - employee ID
     * @param contactInfo - contact info
     * @param employmentDate - employment date
     * @param educationLevel - education level
     * @param employmentLevel - employment level
     * @param lastYearEarnings - last year earnings
     */
    public Employee(String employeeID, ContactInfo contactInfo, LocalDate employmentDate, EducationLevel educationLevel, EmploymentLevel employmentLevel, Double lastYearEarnings) {
        this.employeeID = employeeID;
        this.contactInfo = contactInfo;
        this.employmentDate = employmentDate;
        this.educationLevel = educationLevel;
        this.employmentLevel = employmentLevel;
        this.lastYearEarnings = lastYearEarnings;
    }

    /**
     * @return - a string representation of the object
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * @return - a string representation of the object
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * @return - a string representation of the object
     */
    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    /**
     * @return - a string representation of the object
     */
    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    /**
     * @return - a string representation of the object
     */
    public EmploymentLevel getEmploymentLevel() {
        return employmentLevel;
    }

    /**
     * @return  - a string representation of the object
     */
    public Double getLastYearEarnings() {
        return lastYearEarnings;
    }


    /**
     * @param o - other object
     * @return - a boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeID, employee.employeeID) && Objects.equals(contactInfo, employee.contactInfo) && Objects.equals(employmentDate, employee.employmentDate) && educationLevel == employee.educationLevel && employmentLevel == employee.employmentLevel && Objects.equals(lastYearEarnings, employee.lastYearEarnings);
    }

    /**
     * @return - a string representation of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(employeeID, contactInfo, employmentDate, educationLevel, employmentLevel, lastYearEarnings);
    }
}
