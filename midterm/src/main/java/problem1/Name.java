package problem1;

import java.util.Objects;

/**
 * Class Name stores information about a person's first, middle and last name.
 */
/*
Class Name stores information about a person's first, middle and last name.
 */
public class Name {

    private String firstName;
    private String middleName;
    private String lastName;

    /**
     * @param firstName first name
     * @param middleName middle name
     * @param lastName last name
     */
    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /**
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return middle name
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param o - other object
     * @return - true if two objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(firstName, name.firstName) && Objects.equals(middleName, name.middleName)
            && Objects.equals(lastName, name.lastName);
    }

    /**
     * @return - hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName);
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
