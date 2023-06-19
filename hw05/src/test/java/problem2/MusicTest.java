package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MusicTest {
    Music testMusic;
    Music testMusic2;
    RecordingArtist testArtist;
    RecordingArtist testArtist2;
    RecordingArtist testArtist3;
    Band testBand;
    @BeforeEach
    void setUp() {
        testArtist = new RecordingArtist("John", "Doe");
        testArtist2 = new RecordingArtist("Rebecca", "Smith");
        testArtist3 = new RecordingArtist("Vivian", "Jones");
        LinkedList<RecordingArtist> testArtistList = new LinkedList<>();
        testArtistList.add(testArtist);
        testArtistList.add(testArtist2);
        testArtistList.add(testArtist3);

        testBand = new Band("The Beatles", testArtistList);
        testMusic = new Music(testArtist, "The Beatles", 1960);
        testMusic2 = new Music(testBand, "The Beatles", 1960);
    }

    @Test
    void getCreator() {
        assertEquals(testArtist, testMusic.getCreator());
        assertEquals(testBand, testMusic2.getCreator());
    }

    @Test
    void getTitle() {
        assertEquals("The Beatles", testMusic.getTitle());
        assertEquals("The Beatles", testMusic2.getTitle());
    }

    @Test
    void getYear() {
        assertEquals(1960, testMusic.getYear());
    }

    @Test
    void testEquals_Null() {
        assertFalse(testMusic.equals(null));
    }

    @Test
    void testEquals_SameObjects() {
        assertTrue(testMusic.equals(testMusic));
    }
    @Test
    void testEquals_DifferentType() {
        assertFalse(testMusic.equals("test"));
    }

    @Test
    void testEquals_DifferentFields() {
        Music testMusic3 = new Music(testArtist, "The Beatles", 1961);
        assertFalse(testMusic.equals(testMusic3));
        Music testMusic4 = new Music(testArtist2, "The Beatles", 1960);
        assertFalse(testMusic.equals(testMusic4));
    }


    @Test
    void testHashCode() {
        Music testMusic3 = new Music(testArtist, "The Beatles", 1960);
        assertEquals(testMusic.hashCode(), testMusic3.hashCode());
    }

    @Test
    void testToString() {
        assertEquals("Music{creator=RecordingArtist{firstName='John', lastName='Doe'}, title='The Beatles', year=1960}", testMusic.toString());
    }
}