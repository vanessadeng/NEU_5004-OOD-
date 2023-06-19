package problem1;

import java.time.LocalDateTime;

/**
 * Represents a one-time donation with its details--donation amount and creation time
 */
public class OneTimeDonation extends Donation{
    /**
     * @param donationAmount the donation amount
     * @param creationTime  the creation time of the donation
     */
    public OneTimeDonation(Double donationAmount, LocalDateTime creationTime) {
        super(donationAmount, creationTime);
    }

    /**
     * @param year the year to be checked for total donation
     * @return the total donation for the given year
     */
    @Override
    public Double getTotalDonationForYear(Integer year) {
        if (this.creationTime.getYear() == year) {
            return this.donationAmount;
        }
        return 0.0;
    }


    /**
     * @return the string representation of the object
     */
    @Override
    public String toString() {
        return "OneTimeDonation{" +
                "donationAmount=" + donationAmount +
                ", creationTime=" + creationTime +
                '}';
    }



}
