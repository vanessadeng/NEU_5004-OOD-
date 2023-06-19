package problem1;

import java.util.Arrays;
import java.util.Objects;

public class Musician extends AbstractArtist{

    private String recordingCompany;

    private String lastRecordAlbum;

    public Musician(Name name, Integer age, String[] genre, String[] awards, String recordingCompany, String lastRecordAlbum) throws invalidAgeException {
        super(name, age, genre, awards);
        this.recordingCompany = recordingCompany;
        this.lastRecordAlbum = lastRecordAlbum;
    }

    public String getRecordingCompany() {
        return recordingCompany;
    }

    public String getLastRecordAlbum() {
        return lastRecordAlbum;
    }

    public AbstractArtist receiveAward(String award) throws invalidAgeException{
        String[] newAwards = this.copyAwards(this.awards, award);
        return new Musician(this.name, this.age, this.genre, newAwards, this.recordingCompany, this.lastRecordAlbum);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Musician musician = (Musician) o;
        return Objects.equals(recordingCompany, musician.recordingCompany) && Objects.equals(lastRecordAlbum, musician.lastRecordAlbum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), recordingCompany, lastRecordAlbum);
    }

    @Override
    public String toString() {
        return "Musician{" +
                "recordingCompany='" + recordingCompany + '\'' +
                ", lastRecordAlbum='" + lastRecordAlbum + '\'' +
                ", name=" + name +
                ", age=" + age +
                ", genre=" + Arrays.toString(genre) +
                ", awards=" + Arrays.toString(awards) +
                '}';
    }
}
