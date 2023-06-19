package problem1;

import java.util.Arrays;
import java.util.Objects;

public abstract  class  AbstractArtist implements IArtist {

   private static final Integer MINIMUM_AGE = 0;
   private static final Integer MAXIMUM_AGE = 128;
   protected Name name;

   protected Integer age;

   protected String[] genre;

   protected String[] awards;

   protected boolean validateAge(Integer age) throws invalidAgeException {
      if (age < this.MINIMUM_AGE || age > this.MAXIMUM_AGE) {
         throw new invalidAgeException("The artist's age has to be between 0 and 128");
      } else {
         return true;
      }
   }

   public AbstractArtist(Name name, Integer age, String[] genre, String[] awards) throws invalidAgeException {
      if (this.validateAge(age)) {
         this.name = name;
         this.age = age;
         this.genre = genre;
         this.awards = awards;
      }

   }

   public Name getName() {
      return name;
   }

   public Integer getAge() {
      return age;
   }

   public String[] getGenre() {
      return genre;
   }

   public String[] getAwards() {
      return awards;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      AbstractArtist that = (AbstractArtist) o;
      return Objects.equals(name, that.name) && Objects.equals(age, that.age) && Arrays.equals(genre, that.genre) && Arrays.equals(awards, that.awards);
   }

   @Override
   public int hashCode() {
      int result = Objects.hash(name, age);
      result = 31 * result + Arrays.hashCode(genre);
      result = 31 * result + Arrays.hashCode(awards);
      return result;
   }


   protected String[] copyAwards(String[] awards, String award) {
      String[] newAwards = new String[awards.length + 1];
      for (int i = 0; i < awards.length; i++) {
         newAwards[i] = awards[i];
      }
      newAwards[awards.length] = award;
      return newAwards;
   }



}
