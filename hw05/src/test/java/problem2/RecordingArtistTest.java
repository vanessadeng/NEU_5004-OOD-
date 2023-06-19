package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordingArtistTest {

    RecordingArtist testArtist;


    @BeforeEach
    void setUp() {
        testArtist = new RecordingArtist("random", "person");
    }

    @Test
    void getFirstName() {
        assertEquals("random", testArtist.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("person", testArtist.getLastName());
    }

    @Test
    void testEquals_Null() {
        assertFalse(testArtist.equals(null));
    }

    @Test
    void testEquals_SameObjects() {
        assertTrue(testArtist.equals(testArtist));

    }

    @Test
    void testEquals_DifferentClass() {
        assertFalse(testArtist.equals("test"));

    }

    @Test
    void testEquals_DifferentFields() {
        RecordingArtist testArtist2 = new RecordingArtist("random", "people");
        assertFalse(testArtist.equals(testArtist2));


    }

    @Test
    void testHashCode() {
        RecordingArtist testArtist2 = new RecordingArtist("random", "person");
        assertEquals(testArtist.hashCode(), testArtist2.hashCode());
    }

    @Test
    void testToString() {
        assertEquals("RecordingArtist{firstName='random', lastName='person'}", testArtist.toString());
    }
}