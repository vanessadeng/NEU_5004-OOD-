package problem2;

/**
 * Time class is a simple class that stores information about a specific time's hour, minute and seconds
 *
 */
public class Time {

  private Integer hour;
  private Integer minute;
  private Integer second;

  /**
   * Constructor for Time class, creates a Time object
   * @param hour hour of the time ,encoded as integer value
   * @param minute minute of the time, encoded as integer value
   * @param second seconds of the time, encoded as integer value
   */
  public Time(Integer hour, Integer minute, Integer second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  /**
   * getter for hour
   * @return the hour, encoded as integer
   */
  public Integer getHour() {
    return this.hour;
  }

  /**
   * setter for hour to be provided hour
   * @param hour hour encoded as integer
   */
  public void setHour(Integer hour) {
    this.hour = hour;
  }

  /**
   * getter for minutes
   * @return minutes of the time, encoded as integer
   */
  public Integer getMinute() {
    return this.minute;
  }

  /**
   * setter for minutes to be  provided minutes
   * @param minute encoded as integer
   */
  public void setMinute(Integer minute) {
    this.minute = minute;
  }

  /**
   * getter for time's seconds
   * @return seconds encoded as integer
   */
  public Integer getSecond() {
    return this.second;
  }

  /**
   * setter to set the seconds of the time to be provided value
   * @param second encoded as integers
   */
  public void setSecond(Integer second) {
    this.second = second;
  }

}
