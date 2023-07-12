import java.util.Objects;

/**
 * @param <P> Property type
 */
public abstract class Contract {

    protected Double askingPrice;

    protected Boolean isNegotiable;

    private static final Integer ZERO = 0;

    /**
     * @param askingPrice Asking price
     * @param isNegotiable Is negotiable
     * @throws NegativeValueException If asking price is negative
     */
    public Contract(Double askingPrice, Boolean isNegotiable) throws NegativeValueException {
        this.checkNegativeValue(askingPrice);
        this.askingPrice = askingPrice;
        this.isNegotiable = isNegotiable;
    }

    /**
     * @return Asking price as Double
     */
    public Double getAskingPrice() {
        return askingPrice;
    }

    /**
     * @return Is negotiable as Boolean
     */
    public Boolean getNegotiable() {
        return isNegotiable;
    }

    /**
     * @param askingPrice Asking price to set
     */
    public void setAskingPrice(Double askingPrice) {
        this.askingPrice = askingPrice;
    }

    /**
     * @param negotiable Is negotiable to set
     */
    public void setNegotiable(Boolean negotiable) {
        isNegotiable = negotiable;
    }

    /**
     * @return Commission as Double
     */
    abstract public Double calculateCommission();

    /**
     * @param value Value to check if negative
     * @param <T> Number type (Integer, Double, etc.)
     * @throws NegativeValueException If value is negative (less than 0)
     */
    public <T extends Number> void checkNegativeValue(T value)
        throws NegativeValueException {
        if (value.doubleValue() < ZERO) {
            throw new NegativeValueException("Value can't be negative");
        }
    }

    /**
     * @param o Object to compare
     * @return True if equal, false if not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return Objects.equals(askingPrice, contract.askingPrice) && Objects.equals(isNegotiable, contract.isNegotiable);
    }

    /**
     * @return Hash code of object
     */
    @Override
    public int hashCode() {
        return Objects.hash(askingPrice, isNegotiable);
    }

}
