package problem1;
import java.util.Objects;

/**
 * Class Runner inherites from Athlete, and stores information specific to a runner
 * including runner's best 5K time, best half marathon time and their favorite running event
 */
public class Runner extends Athlete{

  private Double best5KTime;
  private Double bestHalfMarathonTime;

  private String favoriteRunningEvent;

  /**
   * Constructor for an object Runner.
   * @param athletesName runner's name, represented as Name
   * @param height runner's height, represented as Double
   * @param weight runner's weight, represented as Double
   * @param league runner's league, represented as String
   * @param best5KTime runner's best 5K time, represented as Double
   * @param bestHalfMarathonTime runner's best half-marathon time, represented as Double
   * @param favoriteRunningEvent runner's favorite running event, represented as String
   */
  public Runner(Name athletesName, Double height, Double weight, String league, Double best5KTime,
      Double bestHalfMarathonTime, String favoriteRunningEvent) {
    super(athletesName, height, weight, league);
    this.best5KTime = best5KTime;
    this.bestHalfMarathonTime = bestHalfMarathonTime;
    this.favoriteRunningEvent = favoriteRunningEvent;
  }

  /**
   * Constructor for an object Runner.
   * @param athletesName runner's name, represented as Name
   * @param height runner's height, represented as Double
   * @param weight runner's weight, represented as Double
   * @param best5KTime runner's best 5K time, represented as Double
   * @param bestHalfMarathonTime runner's best half-marathon time, represented as Double
   * @param favoriteRunningEvent runner's favorite running event, represented as String
   */
  public Runner(Name athletesName, Double height, Double weight, Double best5KTime,
      Double bestHalfMarathonTime, String favoriteRunningEvent) {
    super(athletesName, height, weight);
    this.best5KTime = best5KTime;
    this.bestHalfMarathonTime = bestHalfMarathonTime;
    this.favoriteRunningEvent = favoriteRunningEvent;
  }

  /**
   * getter for best 5K time
   * @return best 5K time, as Double
   */
  public Double getBest5KTime() {
    return best5KTime;
  }


  /**
   * getter for best half-marathon time
   * @return best half-marathon time
   */
  public Double getBestHalfMarathonTime() {
    return bestHalfMarathonTime;
  }


  /**
   * getter for the favorite running event
   * @return favorite running event, as String
   */
  public String getFavoriteRunningEvent() {
    return favoriteRunningEvent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Runner runner)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return Objects.equals(getBest5KTime(), runner.getBest5KTime())
        && Objects.equals(getBestHalfMarathonTime(), runner.getBestHalfMarathonTime())
        && Objects.equals(getFavoriteRunningEvent(), runner.getFavoriteRunningEvent());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getBest5KTime(), getBestHalfMarathonTime(),
        getFavoriteRunningEvent());
  }

  @Override
  public String toString() {
    return "Runner{" +
        "best5KTime=" + best5KTime +
        ", bestHalfMarathonTime=" + bestHalfMarathonTime +
        ", favoriteRunningEvent='" + favoriteRunningEvent + '\'' +
        '}';
  }
}
