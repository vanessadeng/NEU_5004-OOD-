/**
 * NoneSpecialService is a subclass of Service. It is used to represent a service that is not a special service.
 */
public abstract class NoneSpecialService extends Service{

    protected Integer estimatedHours;

    protected Double discountRate = 0.0;

    protected static final Double BASE_RATE = 80.0;

    protected static final Integer SMALL_ESTIMATED_HOUR = 1;
    protected static final Integer MEDIUM_ESTIMATED_HOUR = 2;
    protected static final Integer LARGE_ESTIMATED_HOUR = 4;
    protected static final Integer DISCOUNT_FREQUENCY = 10;

    private static final Double TENTH_DISCOUNT_RATE = 0.5;

    private static final Double MONTHLY_DISCOUNT_RATE = 0.1;

    /**
     * @param propertyAddress  The address of the property
     * @param propertySize The size of the property
     * @param isMonthlyService If the service is monthly service or not
     * @param numPastServices The number of past services
     * @param estimatedHours The estimated hours
     */
    public NoneSpecialService(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices, Integer estimatedHours) {
        super(propertyAddress, propertySize, isMonthlyService, numPastServices);
        this.estimatedHours = estimatedHours;
        if (this.numPastServices % DISCOUNT_FREQUENCY == 9) {
            this.discountRate = TENTH_DISCOUNT_RATE;
        }else if (this.isMonthlyService) {
            this.discountRate = MONTHLY_DISCOUNT_RATE;
        }
    }





}
