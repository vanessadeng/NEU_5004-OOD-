package problem2;

/**
 * Represents a recording artist with their details--first name and last name
 */
public class RecordingArtist extends Individual{

    /**
     * @param firstName the first name of the recording artist
     * @param lastName the last name of the recording artist
     */
    public RecordingArtist(String firstName, String lastName) {
        super(firstName, lastName);
    }


    /**
     * @return the string representation of the object
     */
    @Override
    public String toString() {
        return "RecordingArtist{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    /**
     * @param artist the artist to be checked if it is the same as this artist
     * @return true if the given artist is the same as this artist
     */
    @Override
    public Boolean containsArtist(RecordingArtist artist) {
        return artist.getFirstName() == this.getFirstName()
                && artist.getLastName() == this.getLastName();
    }
}
