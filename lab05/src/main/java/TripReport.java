import java.util.Objects;

/**
 * This class represents a TripReport object.
 */
public class TripReport {

    protected Vehicle vehicle;
    protected Float speedPerMinute;
    protected Float distance;
    protected Integer duration;

    /**
     * @param vehicle Vehicle to drive
     * @param speedPerMinute Speed to drive at
     * @param distance Distance to drive
     * @param duration Duration of the trip in minutes
     */
    public TripReport(Vehicle vehicle, Float speedPerMinute, Float distance, Integer duration) {
        this.vehicle = vehicle;
        this.speedPerMinute = speedPerMinute;
        this.distance = distance;
        this.duration = duration;
    }

    /**
     * @return Vehicle object
     */
    public Vehicle getVehicle() {
        return vehicle;
    }


    /**
     * @return Speed to drive at
     */
    public Float getSpeedPerMinute() {
        return speedPerMinute;
    }


    /**
     * @return Distance to drive
     */
    public Float getDistance() {
        return distance;
    }


    /**
     * @return Duration of the trip in minutes
     */
    public Integer getDuration() {
        return this.duration;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripReport that = (TripReport) o;
        return Objects.equals(vehicle, that.vehicle) && Objects.equals(speedPerMinute, that.speedPerMinute) && Objects.equals(distance, that.distance) && Objects.equals(duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicle, speedPerMinute, distance, duration);
    }

    @Override
    public String toString() {
        return "TripReport{" +
                "vehicle=" + vehicle +
                ", speedPerMinute=" + speedPerMinute +
                ", distance=" + distance +
                ", duration=" + duration +
                '}';
    }
}
