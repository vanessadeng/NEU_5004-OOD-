package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class OneTimeDonationTest {

    OneTimeDonation testOneTimeDonation;
    LocalDateTime testLocalDateTime;


    @BeforeEach
    void setUp() {
        testLocalDateTime = LocalDateTime.of(2020, 1, 1, 1, 1);
        testOneTimeDonation = new OneTimeDonation(100.0, testLocalDateTime);
    }

    @Test
    void getDonationAmount() {
        assertEquals(100.0, testOneTimeDonation.getDonationAmount());
    }

    @Test
    void getCreationTime() {
        assertEquals(testLocalDateTime, testOneTimeDonation.getCreationTime());
    }

    @Test
    void testEquals_Null() {
        assertFalse(testOneTimeDonation.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        assertFalse(testOneTimeDonation.equals("String"));
    }

    @Test
    void testEquals_SameObject() {
        assertTrue(testOneTimeDonation.equals(testOneTimeDonation));
    }

    @Test
    void testEquals_DifferentFields() {
        OneTimeDonation testOneTimeDonation2 = new OneTimeDonation(300.0, testLocalDateTime);
        OneTimeDonation testOneTimeDonation3 = new OneTimeDonation(400.0, testLocalDateTime);
        assertFalse(testOneTimeDonation2.equals(testOneTimeDonation3));

        OneTimeDonation testOneTimeDonation4 = new OneTimeDonation(100.0, LocalDateTime.of(2021, 1, 1, 1, 2));
        assertFalse(testOneTimeDonation.equals(testOneTimeDonation4));
    }




    @Test
    void testHashCode() {
        OneTimeDonation testOneTimeDonation2 = new OneTimeDonation(100.0, testLocalDateTime);
        OneTimeDonation testOneTimeDonation3 = new OneTimeDonation(100.0, testLocalDateTime);
        assertEquals(testOneTimeDonation2.hashCode(), testOneTimeDonation3.hashCode());
    }

    @Test
    void getTotalDonationForYear() {
        assertEquals(100.0, testOneTimeDonation.getTotalDonationForYear(2020));
        assertEquals(0.0, testOneTimeDonation.getTotalDonationForYear(2021));
        assertEquals(0.0, testOneTimeDonation.getTotalDonationForYear(2019));
    }

    @Test
    void testToString() {
        String expectedString = "OneTimeDonation{" +
                "donationAmount=" + testOneTimeDonation.getDonationAmount() +
                ", creationTime=" + testOneTimeDonation.getCreationTime() +
                '}';
    }
}