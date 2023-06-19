import java.util.Objects;

/**
 * WindowCleaning.java is a class that extends Exterior.java
 */
public class WindowCleaning extends Exterior{


    private Integer numOfFloors;
    private static final Integer MAX_FLOORS = 3;

    private static final Double FLOOR_FEE_RATE = 0.05;

    /**
     * @param propertyAddress The address of the property
     * @param propertySize The size of the property
     * @param isMonthlyService If the service is monthly service or not
     * @param numPastServices The number of past services
     * @param estimatedHours The estimated hours
     * @param numOfFloors The number of floors
     * @throws InvalidFloorException if the number of floors is not positive
     */
    public WindowCleaning(String propertyAddress, Enum propertySize, Boolean isMonthlyService, Integer numPastServices, Integer estimatedHours,Integer numOfFloors) throws InvalidFloorException {
        super(propertyAddress, propertySize, isMonthlyService, numPastServices, estimatedHours);
        if (numOfFloors > MAX_FLOORS) {
            throw new InvalidFloorException("Invalid number of floors");
        }
        if (numOfFloors <=0 ){
            throw new InvalidFloorException("Invalid number of floors");
        }

        this.numOfFloors = numOfFloors;
    }

    /**
     * @return the number of floors
     */
    public Integer getNumOfFloors() {
        return numOfFloors;
    }

    /**
     * @return the price of the service
     */
    public double calculatePrice() {
        if (this.numOfFloors > 1) {
            return (BASE_RATE*this.estimatedHours) *(1+FLOOR_FEE_RATE)* (1 - this.discountRate);
        }
        return (BASE_RATE*this.estimatedHours)* (1 - this.discountRate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WindowCleaning that = (WindowCleaning) o;
        return Objects.equals(numOfFloors, that.numOfFloors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numOfFloors);
    }

    @Override
    public String toString() {
        return "WindowCleaning{" +
                "numOfFloors=" + numOfFloors +
                '}';
    }
}
