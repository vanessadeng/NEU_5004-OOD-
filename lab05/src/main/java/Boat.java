/**
 * Boat class that extends Vehicle
 */
public class Boat extends Vehicle{

    public Boat(String ID, Float avgSpeed, Float maxSpeed) {
        super(ID, avgSpeed, maxSpeed);
    }

    /**
     * @return String representation of Boat
     */
    @Override
    public String toString() {
        return "Boat{" +
                "ID='" + ID + '\'' +
                ", avgSpeed=" + avgSpeed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
