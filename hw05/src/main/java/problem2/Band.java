package problem2;

import java.util.LinkedList;
import java.util.Objects;

/**
 * Represents a band with its details--name and members
 */
public class Band extends Group{

    public String name;
    public LinkedList<RecordingArtist> members;

    /**
     * @param name   the name of the band
     * @param members the members of the band
     */
    public Band(String name, LinkedList<RecordingArtist> members) {
        this.name = name;
        this.members = members;
    }

    /**
     * @return the members of the band
     */
    public LinkedList<RecordingArtist> getMembers() {
        return members;
    }

    /**
     * @param artist the artist to be checked
     * @return true if the band contains the given artist, false otherwise
     */
    @Override
    public Boolean containsArtist(RecordingArtist artist) {
        return this.getMembers().contains(artist);
    }


    /**
     * @return the string representation of the object
     */
    public String getName() {
        return name;
    }

    /**
     * @param o the object to be compared
     * @return true if the given object is equal to this object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Band band = (Band) o;
        return Objects.equals(name, band.name) && Objects.equals(members, band.members);
    }

    /**
     * @return the hashcode of this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, members);
    }

    /**
     * @return the string representation of this object
     */
    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}
