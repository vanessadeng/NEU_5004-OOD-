package problem1;

import java.util.Objects;

/**
 * Class Name stores information about a person's first, middle and last name
 */
public class Name {


  private String firstName;

  private String middleName;

  private String lastName;


  /**
   * Constructor for class Name
   * @param firstName - first name, represented as a String
   * @param middleName - middle name, represented as a String
   * @param lastName - last name, represented as a String
   */
  public Name(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }

  /**
   * getter for first name
   * @return firstName, as a String
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   *
   * @param firstName
   */

  /**
   * getter for middle name
   * @return middleName, as a String
   */
  public String getMiddleName() {
    return middleName;
  }



  /**
   * getter for last name
   * @return lastName, as a String
   */
  public String getLastName() {
    return lastName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Name name)) {
      return false;
    }
    return Objects.equals(getFirstName(), name.getFirstName()) && Objects.equals(
        getMiddleName(), name.getMiddleName()) && Objects.equals(getLastName(),
        name.getLastName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFirstName(), getMiddleName(), getLastName());
  }
}
