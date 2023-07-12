/**
 * SaleContract class
 */
public class SaleContract extends Contract{
    /**
     * @param askingPrice  The asking price of the property
     * @param isNegotiable Is negotiable or not
     * @throws NegativeValueException If asking price is negative
     */
    public SaleContract(Double askingPrice, Boolean isNegotiable) throws NegativeValueException {
        super(askingPrice, isNegotiable);
    }

    /**
     * @return Commission as Double
     */
    public Double calculateCommission() {
        return askingPrice;
    }

    /**
     * @return String representation of SaleContract
     */
    @Override
    public String toString() {
        return "SaleContract{" +
            "askingPrice=" + askingPrice +
            ", isNegotiable=" + isNegotiable +
            '}';
    }
}
