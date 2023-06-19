/**
 * Train class that extends Vehicle
 */
public class Train extends Vehicle{

    public Train(String ID, Float avgSpeed, Float maxSpeed) {
        super(ID, avgSpeed, maxSpeed);
    }

    @Override
    public String toString() {
        return "Train{" +
                "ID='" + ID + '\'' +
                ", avgSpeed=" + avgSpeed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
