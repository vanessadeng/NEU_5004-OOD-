package problem3;

/**
 * Class Identifier represents an identifier, including the user name, year and country
 */
public class Identifier {

  private final String userName;
  private final Integer year;
  private final String country;


  /**
   * @param userName user name
   * @param year year created
   * @param country country created
   */
  public Identifier(String userName, Integer year, String country) {
    this.userName = userName;
    this.year = year;
    this.country = country;
  }

  /**
   * getter for user name
   * @return user name stored in String
   */
  public String getUserName() {
    return userName;
  }


  /**
   * getter for year
   * @return year stored in Integer
   */
  public Integer getYear() {
    return year;
  }


  /**
   * getter for country
   * @return country stored in String
   */
  public String getCountry() {
    return country;
  }


}
