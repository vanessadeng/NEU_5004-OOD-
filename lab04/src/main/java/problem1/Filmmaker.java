package problem1;

import java.util.Arrays;

public class Filmmaker extends MultimediaArtist{

    public Filmmaker(Name name, Integer age, String[] genre, String[] awards, String[] movies, String[] series, String[] otherMultimedia) throws invalidAgeException {
        super(name, age, genre, awards, movies, series, otherMultimedia);
    }

    public AbstractArtist receiveAward(String award) throws invalidAgeException{
        String[] newAwards = this.copyAwards(this.awards, award);
        return new Filmmaker(this.name, this.age, this.genre, newAwards, this.movies, this.series, this.otherMultimedia);
    }

    @Override
    public String toString() {
        return "Filmmaker{" +
                "movies=" + Arrays.toString(movies) +
                ", series=" + Arrays.toString(series) +
                ", otherMultimedia=" + Arrays.toString(otherMultimedia) +
                ", name=" + name +
                ", age=" + age +
                ", genre=" + Arrays.toString(genre) +
                ", awards=" + Arrays.toString(awards) +
                '}';
    }
}
