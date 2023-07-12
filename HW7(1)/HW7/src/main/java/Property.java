import java.util.Objects;

/**
 * @param <P> Property type (House, Condo, etc.)
 */
public abstract class Property {

    protected String address;
    protected Integer size;
    private static final Integer ZERO = 0;

    /**
     * @param address Address of property
     * @param size Size of property in square feet
     * @throws NegativeValueException If size is negative
     */
    public Property(String address, Integer size) throws NegativeValueException {
        this.checkNegativeValue(size);
        this.address = address;
        this.size = size;
    }

    /**
     * @return Address as String
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return Size as Integer
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @param value Value to check if negative
     * @param <T> Number type (Integer, Double, etc.)
     * @throws NegativeValueException If value is negative
     */
    public <T extends Number> void checkNegativeValue(T value)
        throws NegativeValueException {
        if (value.doubleValue() < ZERO) {
            throw new NegativeValueException("Value can't be negative");
        }
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
        Property property = (Property) o;
        return Objects.equals(address, property.address) && Objects.equals(size,
            property.size);
    }

    /**
     * @return Hash code of object as Integer
     */
    @Override
    public int hashCode() {
        return Objects.hash(address, size);
    }

}
