/**
 * Exterior.java is an abstract class that extends NoneSpecialService.java
 */
public abstract class Exterior extends NoneSpecialService{

    /**
     * @param propertyAddress  The address of the property
     * @param propertySize  The size of the property
     * @param isMonthlyService  If the service is monthly service or not
     * @param numPastServices The number of past services
     * @param estimatedHours The estimated hours
     */
    public Exterior(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices, Integer estimatedHours) {
        super(propertyAddress, propertySize, isMonthlyService, numPastServices, estimatedHours);
        if (this.propertySize == PropertySize.SMALL) {
            this.estimatedHours = SMALL_ESTIMATED_HOUR;
        } else if (this.propertySize == PropertySize.MEDIUM) {
            this.estimatedHours = MEDIUM_ESTIMATED_HOUR;
        } else if (this.propertySize == PropertySize.LARGE) {
            this.estimatedHours = LARGE_ESTIMATED_HOUR;
        }
    }


}
