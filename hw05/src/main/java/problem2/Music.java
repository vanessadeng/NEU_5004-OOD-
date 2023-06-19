package problem2;

/**
 * Represents a music with its details--creator, title, year
 */
public class Music extends Item{
    /**
     * @param recordingArtist the recording artist of the music
     * @param title the title of the music
     * @param year the year of publication of the music
     */
    public Music(RecordingArtist recordingArtist, String title, Integer year) {
        super(recordingArtist, title, year);
    }

    /**
     * @param band the band of the music
     * @param title the title of the music
     * @param year the year of publication of the music
     */
    public Music(Band band, String title, Integer year) {
        super(band, title, year);
    }

    /**
     * @return the creator of the music
     */
    @Override
    public String toString() {
        return "Music{" +
                "creator=" + creator +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
