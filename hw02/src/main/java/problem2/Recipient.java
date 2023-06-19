package problem2;

import java.util.Objects;

/**
 * Represents a Recipient with their details--firstname, lastname, and emailAddress
 */
public class Recipient {

    protected String firstname;
    protected String lastname;
    protected String emailAddress;


    /**
     * @param firstname   the first name of the recipient
     * @param lastname   the last name of the recipient
     * @param emailAddress the email address of the recipient
     */
    public Recipient(String firstname, String lastname, String emailAddress) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailAddress = emailAddress;
    }


    /**
     * @return the first name of the recipient
     */
    public String getFirstname() {
        return firstname;
    }


    /**
     * @param firstname the first name of the recipient
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    /**
     * @return the last name of the recipient
     */
    public String getLastname() {
        return lastname;
    }


    /**
     * @param lastname  the last name of the recipient
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    /**
     * @return the email address of the recipient
     */
    public String getEmailAddress() {
        return emailAddress;
    }


    /**
     * @param emailAddress the email address of the recipient
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @param o the object to be compared
     * @return true if the two objects are the same; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recipient recipient = (Recipient) o;
        return Objects.equals(firstname, recipient.firstname) && Objects.equals(
                lastname, recipient.lastname) && Objects.equals(emailAddress,
                recipient.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, emailAddress);
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}