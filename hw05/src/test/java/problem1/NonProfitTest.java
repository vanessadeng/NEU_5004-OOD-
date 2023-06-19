package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NonProfitTest {

    NonProfit testNonProfit;
    ArrayList<Donation> testDonationList;
    OneTimeDonation testOneTimeDonation;
    MonthlyDonation testMonthlyDonation;
    Pledge testPledge;

    @BeforeEach
    void setUp() {
        testOneTimeDonation = new OneTimeDonation(100.0, LocalDateTime.of(2020, 1, 1, 0, 0));
        testMonthlyDonation = new MonthlyDonation(100.0, LocalDateTime.of(2020, 1, 1, 0, 0));
        testPledge = new Pledge(100.0, LocalDateTime.of(2020, 1, 1, 0, 0), LocalDateTime.of(2020, 2, 1, 0, 0));
        testDonationList = new ArrayList<>(
                java.util.Arrays.asList(testOneTimeDonation, testMonthlyDonation, testPledge));
        testNonProfit = new NonProfit("Test", testDonationList);
        NonProfit testNonProfit2 = new NonProfit("Test2");
    }

    @Test
    void getOrganizationName() {
        assertEquals("Test", testNonProfit.getOrganizationName());
        assertEquals("Test2", new NonProfit("Test2").getOrganizationName());
    }

    @Test
    void getDonationList() {
        assertEquals(testDonationList, testNonProfit.getDonationList());
        assertEquals(new ArrayList<>(), new NonProfit("Test2").getDonationList());
    }

    @Test
    void getTotalDonationForYear() {
        assertEquals(1400.0, testNonProfit.getTotalDonationForYear(2020));
        assertEquals(1200.0, testNonProfit.getTotalDonationForYear(2021));
        assertEquals(0.0, testNonProfit.getTotalDonationForYear(2019));
    }

    @Test
    void testEquals_Null() {
        assertFalse(testNonProfit.equals(null));

    }

    @Test
    void testEquals_SameObjects() {
        assertTrue(testNonProfit.equals(testNonProfit));

    }

    @Test
    void testEquals_DifferentClass() {
        assertFalse(testNonProfit.equals("String"));

    }

    @Test
    void testEquals_DifferentFields() {
        NonProfit testNonProfit2 = new NonProfit("Test2", testDonationList);
        NonProfit testNonProfit3 = new NonProfit("Test", new ArrayList<>());
        assertFalse(testNonProfit.equals(testNonProfit2));
        assertFalse(testNonProfit.equals(testNonProfit3));


    }




    @Test
    void testHashCode() {
        testNonProfit = new NonProfit("Test", testDonationList);
        NonProfit testNonProfit2 = new NonProfit("Test", testDonationList);
        NonProfit testNonProfit3 = new NonProfit("Test", testDonationList);
        assertEquals(testNonProfit2.hashCode(), testNonProfit3.hashCode());


    }

    @Test
    void testToString() {
        String expectedString = "NonProfit{" +
                "organizationName='" + testNonProfit.getOrganizationName() + '\'' +
                ", donationList=" + testNonProfit.getDonationList() +
                '}';
    }
}