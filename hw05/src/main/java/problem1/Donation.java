package problem1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Represents a donation with its details--donation amount and creation time
 */
public abstract class Donation implements IDonation{

    protected Double donationAmount;

    protected LocalDateTime creationTime;

    /**
     * @param donationAmount the donation amount
     * @param creationTime the creation time of the donation
     */
    public Donation(Double donationAmount, LocalDateTime creationTime) {
        this.donationAmount = donationAmount;
        this.creationTime = creationTime;
    }

    /**
     * @return the donation amount
     */
    public Double getDonationAmount() {
        return donationAmount;
    }

    /**
     * @return the creation time of the donation
     */
    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    /**
     * @param o the object to be compared
     * @return true if the given object is equal to this donation
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return Objects.equals(donationAmount, donation.donationAmount) && Objects.equals(creationTime, donation.creationTime);
    }

    /**
     * @return the hashcode of this donation
     */
    @Override
    public int hashCode() {
        return Objects.hash(donationAmount, creationTime);
    }


}
