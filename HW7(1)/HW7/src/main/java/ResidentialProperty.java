import java.util.Objects;

/**
 * @param <P> Property type  (House, Condo, etc.)
 */
public class ResidentialProperty extends Property{

    private Integer numberOfBedrooms;
    private Integer numberOfBathrooms;

    /**
     * @param address Address of property
     * @param size Size of property in square feet
     * @param numberOfBedrooms Number of bedrooms in property
     * @param numberOfBathrooms Number of bathrooms in property
     * @throws NegativeValueException If numberOfBedrooms or numberOfBathrooms is negative
     */
    public ResidentialProperty(String address, Integer size, Integer numberOfBedrooms,
        Integer numberOfBathrooms) throws NegativeValueException {
        super(address, size);
        checkNegativeValue(numberOfBedrooms);
        checkNegativeValue(numberOfBathrooms);
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    /**
     * @return Number of bedrooms as Integer
     */
    public Integer getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    /**
     * @return  Number of bathrooms as Integer
     */
    public Integer getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    /**
     * @param o Object to compare
     * @return Whether objects are equal as Boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        ResidentialProperty that = (ResidentialProperty) o;
        return Objects.equals(numberOfBedrooms, that.numberOfBedrooms)
            && Objects.equals(numberOfBathrooms, that.numberOfBathrooms);
    }

    /**
     * @return Hash code as Integer
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfBedrooms, numberOfBathrooms);
    }

    /**
     * @return String representation of object
     */
    @Override
    public String toString() {
        return "ResidentialProperty{" +
            "numberOfBedrooms=" + numberOfBedrooms +
            ", numberOfBathrooms=" + numberOfBathrooms +
            ", address='" + address + '\'' +
            ", size=" + size +
            '}';
    }
}
