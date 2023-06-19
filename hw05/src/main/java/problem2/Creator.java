package problem2;

/**
 * Represents a creator with their details--first name and last name
 */
public abstract class Creator {

    /**
     * @param firstName the first name of the creator
     */
    public Creator() {
    }

    /**
     * @param artist    the artist to be checked
     * @return
     */
    public abstract Boolean containsArtist(RecordingArtist artist);
}
