package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PledgeTest {

    Pledge testPledge;
    LocalDateTime testTime;

    @BeforeEach
    void setUp() {
        testTime = LocalDateTime.of(2020, 1, 1, 0, 0);
        testPledge = new Pledge(100.0, testTime);
        testPledge.setProcessingTime(LocalDateTime.of(2020, 2, 1, 0, 0));
    }

    @Test
    void getDonationAmount() {
        assertEquals(100.0, testPledge.getDonationAmount());
    }

    @Test
    void getCreationTime() {
        assertEquals(testTime, testPledge.getCreationTime());
    }


    @Test
    void testHashCode() {
        Pledge testPledge2 = new Pledge(100.0, testTime);
        Pledge testPledge3 = new Pledge(100.0, testTime);
        assertEquals(testPledge2.hashCode(), testPledge3.hashCode());
    }

    @Test
    void getProcessingTime() {
        assertEquals(LocalDateTime.of(2020, 2, 1, 0, 0), testPledge.getProcessingTime());
    }

    @Test
    void setProcessingTime() {
        testPledge.setProcessingTime(LocalDateTime.of(2020, 3, 1, 0, 0));
        assertEquals(LocalDateTime.of(2020, 3, 1, 0, 0), testPledge.getProcessingTime());

        Pledge testPledge2 = new Pledge(100.0, testTime);
        Exception e = assertThrows(IllegalArgumentException.class, () -> testPledge2.setProcessingTime(LocalDateTime.of(2019, 3, 1, 0, 0)));
        assertEquals("Processing time cannot be before creation time", e.getMessage());
    }

    @Test
    void removeProcessingDateTime() {
        testPledge.removeProcessingDateTime();
        assertEquals(null, testPledge.getProcessingTime());
    }

    @Test
    void getTotalDonationForYear() {
        assertEquals(100.0, testPledge.getTotalDonationForYear(2020));
        assertEquals(0.0, testPledge.getTotalDonationForYear(2021));
        assertEquals(0.0, testPledge.getTotalDonationForYear(2019));
    }

    @Test
    void testEquals_Null() {
        assertFalse(testPledge.equals(null));
    }

    @Test
    void testEquals_SameObject() {
        assertTrue(testPledge.equals(testPledge));

    }

    @Test
    void testEquals_DifferentClass() {
        assertFalse(testPledge.equals("String"));

    }
    @Test
    void testEquals_DifferentFields() {
        Pledge testPledge2 = new Pledge(200.0, testTime);
        Pledge testPledge3 = new Pledge(100.0, LocalDateTime.of(2020, 1, 1, 0, 1));
        assertFalse(testPledge.equals(testPledge2));
        assertFalse(testPledge.equals(testPledge3));

    }






    @Test
    void testToString() {
        String expected = "Pledge{" +
                "processingTime=" + testPledge.getProcessingTime() +
                ", donationAmount=" + testPledge.getDonationAmount() +
                ", creationTime=" + testPledge.getCreationTime()
                +
                '}';
    }
}