/**
 * FleetManager class
 *
 */
public class FleetManager {

    TripReport drive(float distance, Vehicle vehicle){
        Integer tripDuration = Math.round(distance / vehicle.avgSpeed);
        TripReport newReport = new TripReport(vehicle, vehicle.avgSpeed, distance, tripDuration);
        return newReport;

    }

    /**
     * @param vehicle  Vehicle to drive
     * @param duration Duration of the trip in minutes
     * @return TripReport
     */
    TripReport drive(Vehicle vehicle, Integer duration){
        Float distance = vehicle.avgSpeed * duration;
        TripReport newReport = new TripReport(vehicle, vehicle.avgSpeed, distance, duration);
        return newReport;
    }

    /**
     * @param vehicle Vehicle to drive
     * @param distance Distance to drive
     * @param speed   Speed to drive at
     * @return TripReport
     */
    TripReport drive(Vehicle vehicle, float distance, float speed){
        Integer TripDuration = 0;
        if (speed >0){
            TripDuration = Math.round(distance / speed);
        }
        return new TripReport(vehicle, speed, distance, TripDuration);
    }

    /**
     * @param vehicle Vehicle to drive
     * @param speed  Speed to drive at
     * @param duration Duration of the trip in minutes
     * @return TripReport
     */
    TripReport drive(Vehicle vehicle, float speed, Integer duration){
        Float distance = speed * duration;
        return new TripReport(vehicle, speed, distance, duration);
    }
}
