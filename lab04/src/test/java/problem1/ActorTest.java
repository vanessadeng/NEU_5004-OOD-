package problem1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    private Actor testActor;
    private Name testName;
    private String[] testGenre = new String[2];
    private String[] testAwards = new String[2];
    private String[] testMovies = new String[2];
    private String[] testSeries = new String[2];
    private String[] testOtherMultimedia = new String[2];
    private Name expectedName;

    private String[] expectedGenre = new String[2];
    private String[] expectedAwards = new String[2];
    private String[] expectedMovies = new String[2];
    private String[] expectedSeries = new String[2];
    private String[] expectedOtherMultimedia = new String[2];


    @BeforeEach
    void setUp() {

        testName = new Name("John", "Doe");
        expectedName = new Name("John", "Doe");

        testGenre[0] = "Comedy";
        testGenre[1] = "Drama";
        expectedGenre[0] = "Comedy";
        expectedGenre[1] = "Drama";
        testAwards[0] = "Best Actor";
        testAwards[1] = "Best Supporting Actor";
        expectedAwards[0] = "Best Actor";
        expectedAwards[1] = "Best Supporting Actor";
        testMovies[0] = "Movie1";
        testMovies[1] = "Movie2";
        expectedMovies[0] = "Movie1";
        expectedMovies[1] = "Movie2";
        testSeries[0] = "Series1";
        testSeries[1] = "Series2";
        expectedSeries[0] = "Series1";
        expectedSeries[1] = "Series2";
        testOtherMultimedia[0] = "Other1";
        testOtherMultimedia[1] = "Other2";
        expectedOtherMultimedia[0] = "Other1";
        expectedOtherMultimedia[1] = "Other2";

        try {
            testActor = new Actor(testName, 20, testGenre, testAwards, testMovies, testSeries, testOtherMultimedia);
        } catch (Exception e) {
            System.out.println("Oh no, something went wrong!");
        }

    }

    @Test
    void actorWithinInvalidAge() {
        assertThrows(invalidAgeException.class, () -> new Actor(testName, -2, testGenre, testAwards, testMovies, testSeries, testOtherMultimedia));
    }

    @Test
    void actorWithinInvalidAge1() {
        assertThrows(invalidAgeException.class, () -> new Actor(testName, 138, testGenre, testAwards, testMovies, testSeries, testOtherMultimedia));
    }

    @Test
    void validActor() throws invalidAgeException {
        assertEquals(testActor, new Actor(testName, 20, testGenre, testAwards, testMovies, testSeries, testOtherMultimedia));

    }


    @Test
    void getMovies() {
        assertArrayEquals(expectedMovies, testActor.getMovies());
    }

    @Test
    void getSeries() {
        assertArrayEquals(expectedSeries, testActor.getSeries());
    }

    @Test
    void getOtherMultimedia() {
        assertArrayEquals(expectedOtherMultimedia, testActor.getOtherMultimedia());
    }


    @Test
    void validateAge() throws invalidAgeException {
        assertTrue(testActor.validateAge(20));
    }

    @Test
    void getName() {
        assertEquals(expectedName, testActor.getName());
    }

    @Test
    void getAge() {
        assertEquals(20, testActor.getAge());
    }

    @Test
    void getGenre() {
        assertArrayEquals(expectedGenre, testActor.getGenre());
    }

    @Test
    void getAwards() {
        assertArrayEquals(expectedAwards, testActor.getAwards());
    }


    @Test
    void testToString() {
    }

    @Test
    void receiveAward() {
        Actor expectedActor;
        expectedAwards = new String[3];
        expectedAwards[0] = "Best Actor";
        expectedAwards[1] = "Best Supporting Actor";
        expectedAwards[2] = "Oscar";
        try {
            expectedActor = (Actor) testActor.receiveAward("Oscar");
            assertArrayEquals(expectedAwards, expectedActor.getAwards());
        } catch (invalidAgeException e) {
            System.out.println("Oh no, something went wrong!");
        }

    }
    @Test
    void equals_sameObjects() {
        assertTrue(testActor.equals(testActor));
    }

    @Test
    void equals_nullTest(){
        assertFalse(testActor.equals(null));
    }

    @Test
    void equals_differentObjects() {
        assertFalse(testActor.equals(testName));
    }

    @Test
    void equals_differentArtistObjects(){
        try {
            Actor expectedActor = new Actor(testName, 20, testGenre, testAwards, testMovies, testSeries, testOtherMultimedia);
            assertFalse(testActor==(expectedActor));

        }catch (invalidAgeException e){
            System.out.println("Oh no, something went wrong!");
        }


}

}