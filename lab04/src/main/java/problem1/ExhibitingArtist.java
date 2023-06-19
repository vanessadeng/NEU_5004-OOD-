package problem1;

import java.util.Arrays;

public class ExhibitingArtist extends AbstractArtist{


    protected String[] exhibits;

    public ExhibitingArtist(Name name, Integer age, String[] genre, String[] awards, String[] exhibits) throws invalidAgeException {
        super(name, age, genre, awards);
        this.exhibits = exhibits;
    }

    public String[] getExhibits() {
        return exhibits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExhibitingArtist that = (ExhibitingArtist) o;
        return Arrays.equals(exhibits, that.exhibits);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(exhibits);
        return result;
    }

    @Override
    public AbstractArtist receiveAward(String award) throws invalidAgeException {
        //TOOD 漏写
        return null;
    }
}
