package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MonthlyDonationTest {

    LocalDateTime testTime;
    MonthlyDonation testMonthlyDonation;



    @BeforeEach
    void setUp() {
        testTime = LocalDateTime.of(2020, 1, 1, 0, 0);
        testMonthlyDonation = new MonthlyDonation(100.0, testTime);
        testMonthlyDonation.setCancellationTime(LocalDateTime.of(2020, 2, 1, 0, 0));

    }

    @Test
    void getDonationAmount() {
        assertEquals(100.0, testMonthlyDonation.getDonationAmount());
    }

    @Test
    void getCreationTime() {
        assertEquals(testTime, testMonthlyDonation.getCreationTime());
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
        MonthlyDonation testMonthlyDonation2 = new MonthlyDonation(100.0, testTime);
        MonthlyDonation testMonthlyDonation3 = new MonthlyDonation(100.0, testTime);
        assertEquals(testMonthlyDonation2.hashCode(), testMonthlyDonation3.hashCode());

    }

    @Test
    void getCancellationTime() {
        assertEquals(LocalDateTime.of(2020, 2, 1, 0, 0), testMonthlyDonation.getCancellationTime());
    }

    @Test
    void setCancellationTime() {
        testMonthlyDonation.setCancellationTime(LocalDateTime.of(2020, 3, 1, 0, 0));
        assertEquals(LocalDateTime.of(2020, 3, 1, 0, 0), testMonthlyDonation.getCancellationTime());

        Exception e = assertThrows(IllegalArgumentException.class, () -> testMonthlyDonation.setCancellationTime(LocalDateTime.of(2019, 3, 1, 0, 0)));
        assertEquals("Cancellation time cannot be before creation time", e.getMessage());
    }

    @Test
    void getTotalDonationForYear() {
        assertEquals(200.0, testMonthlyDonation.getTotalDonationForYear(2020));
        assertEquals(0.0, testMonthlyDonation.getTotalDonationForYear(2021));
        assertEquals(0.0, testMonthlyDonation.getTotalDonationForYear(2019));

    }

    @Test
    void testEquals_Null() {
        assertFalse(testMonthlyDonation.equals(null));
    }
    @Test
    void testEquals_SameObject() {
        assertTrue(testMonthlyDonation.equals(testMonthlyDonation));
    }

    @Test
    void testEquals_DifferentType() {
        assertFalse(testMonthlyDonation.equals("test"));
    }

    @Test
    void testEquals_DifferentField() {
        MonthlyDonation testMonthlyDonation2 = new MonthlyDonation(200.0, testTime);
        assertFalse(testMonthlyDonation.equals(testMonthlyDonation2));
    }

    @Test
    void testEquals_DifferentField2() {
        LocalDateTime testTime2 = LocalDateTime.of(2020, 1, 2, 0, 0);
        MonthlyDonation testMonthlyDonation2 = new MonthlyDonation(100.0, testTime2);
        assertFalse(testMonthlyDonation.equals(testMonthlyDonation2));
    }







    @Test
    void testToString() {
        String expectedString = "MonthlyDonation{" +
                "cancellationTime=" +  testMonthlyDonation.getCancellationTime()+
                ", donationAmount=" + testMonthlyDonation.getDonationAmount() +
                ", creationTime=" + testMonthlyDonation.creationTime +
                '}';
        assertEquals(expectedString, testMonthlyDonation.toString());
    }
}