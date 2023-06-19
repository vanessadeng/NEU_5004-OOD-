/**
 * a subclass of Interior
 * @see Interior
 */
public class Cleaning extends Interior {

    public Cleaning(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices, Integer estimatedHours, Integer numOfPets) throws PetsNegativeException{
        super(propertyAddress, propertySize, isMonthlyService, numPastServices, estimatedHours, numOfPets);
        if (numOfPets < 0) {
            throw new PetsNegativeException("Pets cannot be negative");
        }

    }

    /**
     * @return the price of the service
     */
    public double calculatePrice() {
        if (this.propertySize == PropertySize.SMALL) {
            this.estimatedHours = SMALL_ESTIMATED_HOUR;
        } else if (this.propertySize == PropertySize.MEDIUM) {
            this.estimatedHours = MEDIUM_ESTIMATED_HOUR;
        } else if (this.propertySize == PropertySize.LARGE) {
            this.estimatedHours = LARGE_ESTIMATED_HOUR;
        }
        return BASE_RATE * this.estimatedHours * (1 - this.discountRate) * (1 + this.petFeeRate);

    }


    /**
     * @return the number of pets
     */
    @Override
    public String toString() {
        return "Cleaning{" +
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
