package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class BandTest {

    private Band testBand;
    private RecordingArtist testRecordingArtist;
    private RecordingArtist testRecordingArtist2;
    private RecordingArtist testRecordingArtist3;



    @BeforeEach
    void setUp() {
        testRecordingArtist = new RecordingArtist("John", "Doe");
        testRecordingArtist2 = new RecordingArtist("Rebecca", "Smith");
        testRecordingArtist3 = new RecordingArtist("Vivian", "Jones");
        LinkedList<RecordingArtist> testRecordingArtistList = new LinkedList<>();
        testRecordingArtistList.add(testRecordingArtist);
        testRecordingArtistList.add(testRecordingArtist2);
        testRecordingArtistList.add(testRecordingArtist3);
        testBand = new Band("The Beatles", testRecordingArtistList);
    }

    @Test
    void getName() {
        assertEquals("The Beatles", testBand.getName());
    }

    @Test
    void testEquals_Null() {
        assertFalse(testBand.equals(null));
    }

    @Test
    void testEquals_SameObject() {
        assertTrue(testBand.equals(testBand));
    }

    @Test
    void testEquals_DifferentClass() {
        assertFalse(testBand.equals("test"));
    }

    @Test
    void testEquals_DifferentFields() {
        LinkedList<RecordingArtist> testRecordingArtistList2 = new LinkedList<>();
        testRecordingArtistList2.add(testRecordingArtist);
        testRecordingArtistList2.add(testRecordingArtist2);
        Band testBand2 = new Band("The Beatles", testRecordingArtistList2);
        assertFalse(testBand.equals(testBand2));
    }




    @Test
    void testHashCode() {
        LinkedList<RecordingArtist> testRecordingArtistList2 = new LinkedList<>();
        testRecordingArtistList2.add(testRecordingArtist);
        testRecordingArtistList2.add(testRecordingArtist2);
        testRecordingArtistList2.add(testRecordingArtist3);
        Band testBand2 = new Band("The Beatles", testRecordingArtistList2);
        assertEquals(testBand.hashCode(), testBand2.hashCode());
    }

    @Test
    void testToString() {
        String expectedString = "Band{" +
                "name='" + testBand.getName() + '\'' +
                ", members=" + testBand.getMembers() +
                '}';
        assertEquals(expectedString, testBand.toString());
    }
}