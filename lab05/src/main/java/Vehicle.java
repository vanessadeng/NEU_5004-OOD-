import java.util.Objects;

/**
 * This class represents a Vehicle object.
 */
public abstract class Vehicle {


    protected String ID;
    protected Float avgSpeed;
    protected Float maxSpeed;

    /**
     * @param ID Unique ID of the vehicle
     * @param avgSpeed Average speed of the vehicle
     * @param maxSpeed Maximum speed of the vehicle
     */
    public Vehicle(String ID, Float avgSpeed, Float maxSpeed) {
        this.ID = ID;
        this.avgSpeed = avgSpeed;
        this.maxSpeed = maxSpeed;
    }

    /**
     * @return Unique ID of the vehicle
     */
    public String getID() {
        return ID;
    }

    /**
     * @return Average speed of the vehicle
     */
    public Float getAvgSpeed() {
        return avgSpeed;
    }

    /**
     * @return Maximum speed of the vehicle
     */
    public Float getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(ID, vehicle.ID) && Objects.equals(avgSpeed, vehicle.avgSpeed) && Objects.equals(maxSpeed, vehicle.maxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, avgSpeed, maxSpeed);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ID='" + ID + '\'' +
                ", avgSpeed=" + avgSpeed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
