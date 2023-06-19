package problem1;

import java.util.Arrays;

public class Painter extends ExhibitingArtist{

    public Painter(Name name, Integer age, String[] genre, String[] awards, String[] exhibits) throws invalidAgeException {
        super(name, age, genre, awards, exhibits);
    }
    public AbstractArtist receiveAward(String award) throws invalidAgeException{
        String[] newAwards = this.copyAwards(this.awards, award);
        return new Painter(this.name, this.age, this.genre, newAwards, this.exhibits);
    }

    @Override
    public String toString() {
        return "Painter{" +
                "exhibits=" + Arrays.toString(exhibits) +
                ", name=" + name +
                ", age=" + age +
                ", genre=" + Arrays.toString(genre) +
                ", awards=" + Arrays.toString(awards) +
                '}';
    }
}
