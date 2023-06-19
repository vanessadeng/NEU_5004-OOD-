import java.util.Objects;

/**
 * Interior.java is an abstract class that extends NoneSpecialService.java
 */
public abstract class Interior extends NoneSpecialService{

    protected Integer numOfPets;

    protected Double petFeeRate = 0.0;
    private static final Double ONE_TWO_PET_FEE_RATE = 0.05;
    private static final Double THREE_MORE_PET_FEE_RATE = 0.07;


    /**
     * @param propertyAddress The address of the property
     * @param propertySize The size of the property
     * @param isMonthlyService If the service is monthly service or not
     * @param numPastServices The number of past services
     * @param estimatedHours The estimated hours
     * @param numOfPets The number of pets
     */
    public Interior(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices, Integer estimatedHours, Integer numOfPets) {
        super(propertyAddress, propertySize, isMonthlyService, numPastServices, estimatedHours);
        this.numOfPets = numOfPets;
        if (this.numOfPets >= 3) {
            this.petFeeRate = THREE_MORE_PET_FEE_RATE;
        }else if (this.numOfPets >= 1) {
            this.petFeeRate = ONE_TWO_PET_FEE_RATE;
        }

    }

    /**
     * @return the price of the service
     */
    public Integer getNumOfPets() {
        return numOfPets;
    }


    /**
     * @param numOfPets the number of pets
     */
    public void setNumOfPets(Integer numOfPets) {
        this.numOfPets = numOfPets;
    }

    /**
     * @return the pet fee rate
     */
    @Override
    public String toString() {
        return "Interior{" +
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
