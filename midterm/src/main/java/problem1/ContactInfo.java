package problem1;

import java.util.Objects;

/**
 * Class ContactInfo contains information about a person's physical address,
 */
/*
 Class ContactInfo contains information about a person's physical address,
 their phone number and email address.
 */
public class ContactInfo {
  private String streetAndNumber;
  private String city;
  private String state;
  private String ZIPcode;
  private String phoneNumber;
  private String emailAddress;

  /**
   * @param streetAndNumber street and number
   * @param city city
   * @param state state
   * @param ZIPcode ZIP code
   * @param phoneNumber phone number
   * @param emailAddress email address
   */
  public ContactInfo(String streetAndNumber, String city,
                     String state, String ZIPcode, String phoneNumber,
                     String emailAddress) {
    this.streetAndNumber = streetAndNumber;
    this.city = city;
    this.state = state;
    this.ZIPcode = ZIPcode;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
  }

  /**
   * @return street and number
   */
  public String getStreetAndNumber() {
    return streetAndNumber;
  }

  /**
   * @return city
   */
  public String getCity() {
    return city;
  }

  /**
   * @return state
   */
  public String getState() {
    return state;
  }

  /**
   * @return ZIP code
   */
  public String getZIPcode() {
    return ZIPcode;
  }

  /**
   * @return phone number
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * @return  email address
   */
  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * @param o object
   * @return true if two objects are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ContactInfo)) return false;
    ContactInfo that = (ContactInfo) o;
    return Objects.equals(getStreetAndNumber(), that.getStreetAndNumber()) &&
        Objects.equals(getCity(), that.getCity()) &&
        Objects.equals(getState(), that.getState()) &&
        Objects.equals(getZIPcode(), that.getZIPcode()) &&
        Objects.equals(getPhoneNumber(), that.getPhoneNumber()) &&
        Objects.equals(getEmailAddress(), that.getEmailAddress());
  }

  /**
   * @return hash code
   */
  @Override
  public int hashCode() {
    return Objects.hash(getStreetAndNumber(), getCity(),
        getState(), getZIPcode(), getPhoneNumber(), getEmailAddress());
  }
}
