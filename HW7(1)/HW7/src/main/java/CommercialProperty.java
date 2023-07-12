import java.util.Objects;

/**
 * @param <P> Property type
 */
public class CommercialProperty extends Property{

    private Integer numberOfOffices;
    private Boolean suitableForRetail;

    /**
     * @param address Address of property as String
     * @param size Size of property in square feet
     * @param numberOfOffices Number of offices in property
     * @param suitableForRetail Whether property is suitable for retail
     * @throws NegativeValueException If numberOfOffices is negative
     */
    public CommercialProperty(String address, Integer size, Integer numberOfOffices,
        Boolean suitableForRetail) throws NegativeValueException {
        super(address, size);
        this.checkNegativeValue(numberOfOffices);
        this.numberOfOffices = numberOfOffices;
        this.suitableForRetail = suitableForRetail;
    }

    /**
     * @return Number of offices as Integer
     */
    public Integer getNumberOfOffices() {
        return numberOfOffices;
    }

    /**
     * @return Whether property is suitable for retail as Boolean
     */
    public Boolean getSuitableForRetail() {
        return suitableForRetail;
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
        CommercialProperty that = (CommercialProperty) o;
        return Objects.equals(numberOfOffices, that.numberOfOffices)
            && Objects.equals(suitableForRetail, that.suitableForRetail);
    }

    /**
     * @return Hash code of object as Integer
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfOffices, suitableForRetail);
    }

    /**
     * @return String representation of object
     */
    @Override
    public String toString() {
        return "CommercialProperty{" +
            "numberOfOffices=" + numberOfOffices +
            ", suitableForRetail=" + suitableForRetail +
            ", address='" + address + '\'' +
            ", size=" + size +
            '}';
    }
}
