/**
 * Bus class that extends Vehicle
 */
public class Bus extends Vehicle{

    public Bus(String ID, Float avgSpeed, Float maxSpeed) {
        super(ID, avgSpeed, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "ID='" + ID + '\'' +
                ", avgSpeed=" + avgSpeed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
