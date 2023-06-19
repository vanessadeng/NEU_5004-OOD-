package problem2;

import java.util.Objects;

/**
 * Represents an individual with its details--first name and last name
 */
public abstract class Individual extends Creator{

    protected String firstName;
    protected String lastName;

    /**
     * @param firstName the first name of the individual
     * @param lastName the last name of the individual
     */
    public Individual(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @return the first name of the individual
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the last name of the individual
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param o the object to be compared
     * @return true if the given object is equal to this object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Individual that = (Individual) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    /**
     * @return the hashcode of this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
