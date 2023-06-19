package problem1;

import java.util.Arrays;
import java.util.Objects;

public class Poet extends AbstractArtist{

    private String publishingCompany;
    private String lastPublishedCollection;

    public Poet(Name name, Integer age, String[] genre, String[] awards, String publishingCompany, String lastPublishedCollection) throws invalidAgeException {
        super(name, age, genre, awards);
        this.publishingCompany = publishingCompany;
        this.lastPublishedCollection = lastPublishedCollection;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public String getLastPublishedCollection() {
        return lastPublishedCollection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Poet poet = (Poet) o;
        return Objects.equals(publishingCompany, poet.publishingCompany) && Objects.equals(lastPublishedCollection, poet.lastPublishedCollection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), publishingCompany, lastPublishedCollection);
    }

    public AbstractArtist receiveAward(String award) throws invalidAgeException{
        String[] newAwards = this.copyAwards(this.awards, award);
        return new Poet(this.name, this.age, this.genre, newAwards, this.publishingCompany, this.lastPublishedCollection);
    }

    @Override
    public String toString() {
        return "Poet{" +
                "publishingCompany='" + publishingCompany + '\'' +
                ", lastPublishedCollection='" + lastPublishedCollection + '\'' +
                ", name=" + name +
                ", age=" + age +
                ", genre=" + Arrays.toString(genre) +
                ", awards=" + Arrays.toString(awards) +
                '}';
    }
}
