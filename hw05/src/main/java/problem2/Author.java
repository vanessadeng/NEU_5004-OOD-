package problem2;

/**
 * Represents an author with their details--first name and last name
 */
public class Author extends Individual{

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public Boolean containsArtist(RecordingArtist artist) {
        return false;
    }


    /**
     * @return the string representation of the object
     */
    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    }

