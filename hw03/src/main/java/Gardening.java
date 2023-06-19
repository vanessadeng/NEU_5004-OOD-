/**
 * Gardening class that extends Exterior class
 */
public class Gardening extends Exterior{

    private static final Double WASTE_REMOVAL_FEE = 20.0;


    /**
     * @param propertyAddress   The address of the property
     * @param propertySize     The size of the property
     * @param isMonthlyService If the service is monthly service or not
     * @param numPastServices The number of past services
     * @param estimatedHours The estimated hours
     */
    public Gardening(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices, Integer estimatedHours) {
        super(propertyAddress, propertySize, isMonthlyService, numPastServices, estimatedHours);
    }

    /**
     * @return the price of the service
     */
    public double calculatePrice() {
        return (BASE_RATE*this.estimatedHours + WASTE_REMOVAL_FEE)* (1 - this.discountRate);
    }

    /**
     * @return the string representation of the object
     */
    @Override
    public String toString() {
        return "Gardening{" +
                "estimatedHours=" + estimatedHours +
                ", discountRate=" + discountRate +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", propertySize=" + propertySize +
                ", isMonthlyService=" + isMonthlyService +
                ", numPastServices=" + numPastServices +
                '}';
    }
}
