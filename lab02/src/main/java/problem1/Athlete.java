package problem1;
import java.util.Objects;


/**
 * Class Athlete stores information about an athlete,
 * including the athlete's name, height, weight and league
 */
public class Athlete {

  protected final Name athletesName;
  protected final Double height;
  protected final Double weight;
  protected final String league;

  /**
   * Constructor for the class Athlete.
   *
   * @param athletesName - String, representing athlete's name
   * @param height       - Double, representing athlete's height
   * @param weight       - Double, representing athlete's weight
   * @param league       - String, representing athlete's league
   **/
  public Athlete(Name athletesName, Double height, Double weight, String league) {
    this.athletesName = athletesName;
    this.height = height;
    this.weight = weight;
    this.league = league;
  }

  /**
   * Constructor for the class Athlete.
   *
   * @param athletesName - String, representing athlete's name
   * @param height       - Double, representing athlete's height
   * @param weight       - Double, representing athlete's weight
   **/
  public Athlete(Name athletesName, Double height, Double weight) {
    this.athletesName = athletesName;
    this.height = height;
    this.weight = weight;
    this.league = null;
  }

  /**
   * getter for the athlete's name
   * Returns athlete's name as an object Name
   **/
  public Name getAthletesName() {
    return athletesName;
  }

  /**
   * getter for the athlete's height
   * @return athlete's height
   */
  public Double getHeight() {
    return height;
  }


  /**
   * getter for the athlete's weight
   * @return athlete's weight
   */
  public Double getWeight() {
    return weight;
  }


  /**
   * getter for the athlete's league
   * @return athlete's league
   */
  public String getLeague() {
    return league;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Athlete athlete = (Athlete) o;
    return Objects.equals(athletesName, athlete.athletesName) && Objects.equals(
        height, athlete.height) && Objects.equals(weight, athlete.weight)
        && Objects.equals(league, athlete.league);
  }

  @Override
  public int hashCode() {
    return Objects.hash(athletesName, height, weight, league);
  }

  @Override
  public String toString() {
    return "Athlete{" +
        "athletesName=" + athletesName +
        ", height=" + height +
        ", weight=" + weight +
        ", league='" + league + '\'' +
        '}';
  }
}


