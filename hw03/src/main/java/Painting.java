/**
 *  a class that extends the Interior class and represents a painting service
 */
public class Painting extends Interior{

    protected static final Integer SMALL_MEDIUM_ESTIMATED_HOUR_PAINTING = 16;
    protected static final Integer LARGE_ESTIMATED_HOUR_PAINTING = 24;

    /**
     * @param propertyAddress   The address of the property
     * @param propertySize     The size of the property
     * @param isMonthlyService If the service is monthly service or not
     * @param numPastServices The number of past services
     * @param estimatedHours The estimated hours
     * @param numOfPets The number of pets
     */
    public Painting(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices, Integer estimatedHours, Integer numOfPets) {
        super(propertyAddress, propertySize, isMonthlyService, numPastServices, estimatedHours, numOfPets);
    }

    /**
     * @return the price of the service
     */
    public double calculatePrice() {
        if (this.propertySize == PropertySize.SMALL || this.propertySize == PropertySize.MEDIUM) {
            this.estimatedHours = SMALL_MEDIUM_ESTIMATED_HOUR_PAINTING;
        } else if (this.propertySize == PropertySize.LARGE) {
            this.estimatedHours = LARGE_ESTIMATED_HOUR_PAINTING;
        }
        return BASE_RATE * this.estimatedHours * (1 - this.discountRate) * (1 + this.petFeeRate);

    }


    /**
     * @return the string representation of the object
     */
    @Override
    public String toString() {
        return "Painting{" +
                "numOfPets=" + numOfPets +
                ", petFeeRate=" + petFeeRate +
                ", estimatedHours=" + estimatedHours +
                ", discountRate=" + discountRate +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", propertySize=" + propertySize +
                ", isMonthlyService=" + isMonthlyService +
                ", numPastServices=" + numPastServices +
                '}';
    }
}
