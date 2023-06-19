/**
 * Electrical class that extends SpecialService class
 */
public class Electrical extends SpecialService{

    private static final int maxSpecialistForElectrical = 4;

    private static final int permittedExtraFee = 50;

    /**
     * @param propertyAddress  address of the property
     * @param propertySize    size of the property
     * @param isMonthlyService if the service is monthly service or not
     * @param numPastServices number of past services
     * @param requiredLicensedEmployee number of required licensed employee
     * @param isComplex if the service is complex or not
     * @throws ExceedMaxSpecialistException if the number of required licensed employee exceeds the maximum number of specialists
     */
    public Electrical(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices, Integer requiredLicensedEmployee, Boolean isComplex) throws ExceedMaxSpecialistException{
        super(propertyAddress, propertySize, isMonthlyService, numPastServices, requiredLicensedEmployee, isComplex);

        if (super.requiredLicensedEmployee > maxSpecialistForElectrical) {
            throw new ExceedMaxSpecialistException("Exceed maximum number of specialists");
        }
    }

    /**
     * @return the price of the service
     */
    public double calculatePrice(){
        return super.calculatePrice() + this.permittedExtraFee;
    }

    /**
     * @return the string representation of the object
     */
    @Override
    public String toString() {
        return "Electrical{" +
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
