package problem1;

/**
 * Represents a donation with its details--donation amount and creation time
 */
public interface IDonation {


    /**
     * @param year the year to be checked
     * @return true if the donation is made in the given year
     */
    public Double getTotalDonationForYear(Integer year);
}
