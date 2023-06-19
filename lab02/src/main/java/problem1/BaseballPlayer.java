package problem1;


import java.util.Objects;

/**
 * Class Baseball inherits from Class Athlete, and stores information about baseball player
 * including the team, average battling score and the name of season home runs
 */
public class BaseballPlayer extends Athlete{

  private String team;
  private Double averageBatting;

  private Integer seasonHomeRuns;

  /**
   * Constructor for the Baseball Player
   * @param athletesName athlete's name, stored as a data type Name
   * @param height athlete's height, stored as a Double
   * @param weight athlete's weight, stored as a Double
   * @param league baseball player's league, stored as a String
   * @param team baseball player's team, stored as a String
   * @param averageBatting baseball player's average batting score, stored as a Double
   * @param seasonHomeRuns baseball player's season home runs, stored as an Integer
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight, String league, String team,
      Double averageBatting, Integer seasonHomeRuns) {
    super(athletesName, height, weight, league);
    this.team = team;
    this.averageBatting = averageBatting;
    this.seasonHomeRuns = seasonHomeRuns;
  }


  /**
   * Constructor for the Baseball Player
   * @param athletesName athlete's name, stored as a data type Name
   * @param height athlete's height, stored as a Double
   * @param weight athlete's weight, stored as a Double
   * @param team baseball player's team, stored as a String
   * @param averageBatting baseball player's average batting score, stored as a Double
   * @param seasonHomeRuns baseball player's season home runs, stored as an Integer
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight, String team,
      Double averageBatting, Integer seasonHomeRuns) {
    super(athletesName, height, weight);
    this.team = team;
    this.averageBatting = averageBatting;
    this.seasonHomeRuns = seasonHomeRuns;
  }


  /**
   * getter for team
   *
   * @return  team name, stored as a String
   */
  public String getTeam() {
    return team;
  }

  /**
   * getter for the average batting score
   * @return average batting score , as a Double
   */
  public Double getAverageBatting() {
    return averageBatting;
  }

  /**
   * getter for the season home runs
   * @return season home runs, store as an Integer
   */
  public Integer getSeasonHomeRuns() {
    return seasonHomeRuns;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof BaseballPlayer that)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return Objects.equals(getTeam(), that.getTeam()) && Objects.equals(
        getAverageBatting(), that.getAverageBatting()) && Objects.equals(
        getSeasonHomeRuns(), that.getSeasonHomeRuns());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getTeam(), getAverageBatting(), getSeasonHomeRuns());
  }

  @Override
  public String toString() {
    return "BaseballPlayer{" +
        "team='" + team + '\'' +
        ", averageBatting=" + averageBatting +
        ", seasonHomeRuns=" + seasonHomeRuns +
        '}';
  }
}
