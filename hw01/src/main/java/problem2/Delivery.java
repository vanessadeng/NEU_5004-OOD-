package problem2;

/**
 * Class Delivery is a simple class that keeps track of a single delivery,
 * including the delivery's start time, end time, start location, end location
 */
public class Delivery {

  private static final int SECONDS_PER_HOUR = 3600;
  private static final int SECONDS_PER_MINUTE = 60;
  private String startingLocation;

  private String endLocation;

  private Time startTime;
  private Time endTime;

  /**
   * Constructor for the delivery class, creates a delivery object,
   * with the provided starting location, end location ,start time and end time
   * @param startingLocation starting location, encoded as String
   * @param endLocation end location, encoded as String
   * @param startTime start time. encoded as Time object
   * @param endTime end time, encoded as Time object
   */
  public Delivery(String startingLocation, String endLocation, Time startTime, Time endTime) {
    this.startingLocation = startingLocation;
    this.endLocation = endLocation;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  /**
   * getter for start location
   * @return start location, encoded as String
   */
  public String getStartingLocation() {
    return this.startingLocation;
  }

  /**
   * setter for starting location
   * @param startingLocation set the starting location as provided
   */
  public void setStartingLocation(String startingLocation) {
    this.startingLocation = startingLocation;
  }

  /**
   * getter for end location
   * @return end location, encoded in String
   */
  public String getEndLocation() {
    return this.endLocation;
  }

  /**
   * setter for end location
   * @param endLocation set the end location as provided
   */
  public void setEndLocation(String endLocation) {
    this.endLocation = endLocation;
  }

  /**
   * getter for start time
   *
   * @return start time, encoded as Time object
   */
  public Time getStartTime() {
    return this.startTime;
  }

  /**
   * setter for start time
   * @param startTime set the start time as provided
   */
  public void setStartTime(Time startTime) {
    this.startTime = startTime;
  }


  /**
   * getter for end time
   * @return end time, encoded as Time object
   */
  public Time getEndTime() {
    return this.endTime;
  }

  /**
   * setter for end time
   * @param endTime end time, encoded as Time object
   */
  public void setEndTime(Time endTime) {
    this.endTime = endTime;
  }

  /**
   * returns the duration of the delivery
   * @return the duration in hour, minute, seconds, encoded as Time object
   */
  public Time getDuration(){
    Time durationTime = new Time(0,0,0);
    int startTimeInSeconds = this.startTime.getHour()*SECONDS_PER_HOUR + this.startTime.getMinute() * SECONDS_PER_MINUTE+ this.startTime.getSecond();
    int endTimeInSeconds = this.endTime.getHour()*SECONDS_PER_HOUR + this.endTime.getMinute()*SECONDS_PER_MINUTE + this.endTime.getSecond();
    int durationInSeconds = endTimeInSeconds - startTimeInSeconds;
    durationTime.setHour(durationInSeconds/SECONDS_PER_HOUR);
    durationTime.setMinute((durationInSeconds % SECONDS_PER_HOUR)/SECONDS_PER_MINUTE);
    durationTime.setSecond((durationInSeconds % SECONDS_PER_HOUR)%SECONDS_PER_MINUTE);
    return durationTime;



  }
}
