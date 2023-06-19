package problem1;

/**
 * Class User is a class that stores information about a User
 * including the user's firstname, lastname,phone number, email and credentials
 */
public class User {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Credentials credentials;

    /**
     * Constructor, creating a new User object, with the provided
     first name, last name, phone number, email address and credential pair.
     * @param firstName - first name, stored as String
     * @param lastName - last name, stored as String
     * @param phoneNumber - phone number, stored as  String, consisting of ten characters
     * @param email - email, stored as String
     * @param credentials - credential, stored as Credentials
     */
    public User(String firstName, String lastName, String phoneNumber, String email, Credentials credentials) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber.matches("^\\d{10}$") ? phoneNumber : "Not a phone number.";
        this.email = email;
        this.credentials = credentials;
    }

    /**
     * Returns the first name
     * @return the first name, stored as String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter to set the firstname as given firstname
     * @param firstName - first name, stored as String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getter for the lastname
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for the lastname to be the given lastname
     * @param lastName - last name, stored as String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the phone number
     * @return the phone number stored as String
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phone number to the given phone number
     * @param phoneNumber - phone number, encoded String, consisting of ten characters
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber.matches("^\\d{10}$") ? phoneNumber : "Not a phone number.";
    }

    /**
     * Returns the email
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter to set the email address to be the given email
     * @param email, stored as String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter for the credentials
     * @return the credentials as Credential object
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Setter to set the credentials
     * @param credentials - credential, stored as Credentials
     */
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
}
