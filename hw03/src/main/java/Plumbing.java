/**
 * Plumbing class that extends SpecialService
 */
public class Plumbing extends SpecialService{


    private static final int permittedExtraFee = 20;


    /**
     * @param propertyAddress  The address of the property
     * @param propertySize The size of the property
     * @param isMonthlyService If the service is monthly service or not
     * @param numPastServices The number of past services
     * @param requiredLicensedEmployee The number of required licensed employee
     * @param isComplex If the service is complex or not
     */
    public Plumbing(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices, Integer requiredLicensedEmployee, Boolean isComplex) {
        super(propertyAddress, propertySize, isMonthlyService, numPastServices, requiredLicensedEmployee, isComplex);
    }


    /**
     * @return the price of the service
     */
    public double calculatePrice(){
        return super.calculatePrice() + this.permittedExtraFee;
    }

    @Override
    public String toString() {
        return "Plumbing{" +
                "requiredLicensedEmployee=" + requiredLicensedEmployee +
                ", extraCharge=" + extraCharge +
                ", isComplex=" + isComplex +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", propertySize=" + propertySize +
                ", isMonthlyService=" + isMonthlyService +
                ", numPastServices=" + numPastServices +
                '}';
    }
}
