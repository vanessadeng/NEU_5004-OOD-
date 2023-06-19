import java.util.Objects;

/**
 * Service.java is an abstract class that extends NoneSpecialService.java
 */
public abstract class Service {

    protected String propertyAddress;
    protected Enum propertySize;
    protected Boolean isMonthlyService;
    protected Integer numPastServices;

    /**
     * @param propertyAddress The address of the property
     * @param propertySize The size of the property
     * @param isMonthlyService If the service is monthly service or not
     * @param numPastServices The number of past services
     */
    public Service(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices) {
        this.propertyAddress = propertyAddress;
        this.propertySize = propertySize;
        this.isMonthlyService = isMonthlyService;
        this.numPastServices = numPastServices;
    }

    /**
     * @return the price of the service
     */
    public String getPropertyAddress() {
        return propertyAddress;
    }

    /**
     * @param propertyAddress the address of the property
     */
    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    /**
     * @return the property size
     */
    public Enum getPropertySize() {
        return propertySize;
    }

    /**
     * @param propertySize the size of the property
     */
    public void setPropertySize(Enum propertySize) {
        this.propertySize = propertySize;
    }

    /**
     * @return if the service is monthly service or not
     */
    public Boolean getMonthlyService() {
        return isMonthlyService;
    }

    /**
     * @param monthlyService if the service is monthly service or not
     */
    public void setMonthlyService(Boolean monthlyService) {
        isMonthlyService = monthlyService;
    }

    /**
     * @return the number of past services
     */
    public Integer getNumPastServices() {
        return numPastServices;
    }

    /**
     * @param numPastServices the number of past services
     */
    public void setNumPastServices(Integer numPastServices) {
        this.numPastServices = numPastServices;
    }

    /**
     * @param o
     * @return if the service is equal to another service
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(propertyAddress, service.propertyAddress) && Objects.equals(propertySize, service.propertySize) && Objects.equals(isMonthlyService, service.isMonthlyService) && Objects.equals(numPastServices, service.numPastServices);
    }

    /**
     * @return the hashcode of the service
     */
    @Override
    public int hashCode() {
        return Objects.hash(propertyAddress, propertySize, isMonthlyService, numPastServices);
    }


}
