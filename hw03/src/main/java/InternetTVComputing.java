/**
 * InternetTVComputing class extends SpecialService class
 */
public class InternetTVComputing extends SpecialService{

    private static final int maxSpecialistForInternetTVComputing= 2;

    protected static final double electronicWasteFee = 15.00;

    /**
     * @param propertyAddress address of the property
     * @param propertySize size of the property
     * @param isMonthlyService if the service is monthly service or not
     * @param numPastServices number of past services
     * @param requiredLicensedEmployee number of required licensed employee
     * @param isComplex if the service is complex or not
     * @throws ExceedMaxSpecialistException if the number of required licensed employee exceeds the maximum number of specialists
     */
    public InternetTVComputing(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices, Integer requiredLicensedEmployee, Boolean isComplex) throws ExceedMaxSpecialistException{
        super(propertyAddress, propertySize, isMonthlyService, numPastServices, requiredLicensedEmployee, isComplex);
        if (super.requiredLicensedEmployee > maxSpecialistForInternetTVComputing) {
            throw new ExceedMaxSpecialistException("Exceed maximum number of specialists");
        }
    }

    /**
     * @return the price of the service
     */
    public double calculatePrice(){
        return super.calculatePrice() + this.electronicWasteFee;
    }
}
