import java.util.Objects;

/**
 * @param <P> Property type (House, Condo, etc.)
 */
public class RentalContract extends Contract{

    private Integer termInMonths;
    private static final Integer ZERO = 0;


    /**
     * @param askingPrice Asking price of property
     * @param isNegotiable Is negotiable or not
     * @param termInMonths Term in months
     * @throws NegativeValueException If asking price is negative
     * @throws InvalidTermException If term is invalid
     */
    public RentalContract(Double askingPrice, Boolean isNegotiable, Integer termInMonths)
        throws NegativeValueException, InvalidTermException {
        super(askingPrice, isNegotiable);
        this.checkValidTerm(termInMonths);
        this.termInMonths = termInMonths;
    }

    /**
     * @return Term in months as Integer
     */
    public Integer getTermInMonths() {
        return termInMonths;
    }

    /**
     * @return Commission as Double
     */
    public Double calculateCommission() {
        return askingPrice * termInMonths;
    }

    /**
     * @param value  Value to check if valid term
     * @param <T> Number type (Integer, Double, etc.)
     * @throws InvalidTermException If term is invalid
     */
    public <T extends Number> void checkValidTerm(T value)
        throws InvalidTermException {
        if (value.doubleValue() <= ZERO) {
            throw new InvalidTermException("Value must be greater than 0");
        }
    }

    /**
     * @param o Object to compare
     * @return True if equal, false if not
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
        RentalContract that = (RentalContract) o;
        return Objects.equals(termInMonths, that.termInMonths);
    }

    /**
     * @return Hash code as Integer
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), termInMonths);
    }

    /**
     * @return String representation of object
     */
    @Override
    public String toString() {
        return "RentalContract{" +
            "termInMonths=" + termInMonths +
            ", askingPrice=" + askingPrice +
            ", isNegotiable=" + isNegotiable +
            '}';
    }
}
