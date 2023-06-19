import java.util.Objects;

/**
 * Service.java is an abstract class that extends NoneSpecialService.java
 */
public abstract class SpecialService extends Service {

    protected Integer requiredLicensedEmployee;

    private static final int MIN_LICENSED_EMPLOYEE = 1;
    private static final int MIN_SPECIALIST_SMALL_MEDIUM = 2;
    private static final int MIN_SPECIALIST_LARGE = 3;
    private static final double specialServiceHourlyRate = 200.00;

    protected int extraCharge;

    protected Boolean isComplex;

    /**
     * @param propertyAddress   The address of the property
     * @param propertySize     The size of the property
     * @param isMonthlyService If the service is monthly service or not
     * @param numPastServices The number of past services
     * @param requiredLicensedEmployee The number of required licensed employee
     * @param isComplex If the service is complex or not
     */
    public SpecialService(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices, Integer requiredLicensedEmployee, Boolean isComplex) {
        super(propertyAddress, propertySize, isMonthlyService, numPastServices);
        this.isComplex = isComplex;
        if (this.isComplex) {
            if (super.propertySize == PropertySize.SMALL || super.propertySize == PropertySize.MEDIUM) {
                this.requiredLicensedEmployee = MIN_SPECIALIST_SMALL_MEDIUM;
            } else {
                this.requiredLicensedEmployee = MIN_SPECIALIST_LARGE;
            }
        } else if (requiredLicensedEmployee < MIN_LICENSED_EMPLOYEE) {
            this.requiredLicensedEmployee = MIN_LICENSED_EMPLOYEE;
        } else {
            this.requiredLicensedEmployee = requiredLicensedEmployee;
        }
    }

    /**
     * @return the number of required licensed employee
     */
    public Integer getRequiredLicensedEmployee() {
        return requiredLicensedEmployee;
    }

    /**
     * @param requiredLicensedEmployee the number of required licensed employee
     */
    public void setRequiredLicensedEmployee(Integer requiredLicensedEmployee) {
        this.requiredLicensedEmployee = requiredLicensedEmployee;
    }

    /**
     * @return the extra charge
     */
    public Boolean getComplex() {
        return isComplex;
    }

    /**
     * @param complex the extra charge
     */
    public void setComplex(Boolean complex) {
        isComplex = complex;
    }

    /**
     * @return the price of the service
     */
    public double calculatePrice(){
        return this.specialServiceHourlyRate * this.requiredLicensedEmployee;
    }

    /**
     * @param o the object to be compared
     * @return true if the object is equal to this object, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SpecialService that = (SpecialService) o;
        return Objects.equals(requiredLicensedEmployee, that.requiredLicensedEmployee) && Objects.equals(isComplex, that.isComplex);
    }

    /**
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), requiredLicensedEmployee, isComplex);
    }

    @Override
    public String toString() {
        return "SpecialService{" +
                "requiredLicensedEmployee=" + requiredLicensedEmployee +
                ", isComplex=" + isComplex +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", propertySize=" + propertySize +
                ", isMonthlyService=" + isMonthlyService +
                ", numPastServices=" + numPastServices +
                '}';
    }
}
