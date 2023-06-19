package problem1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Represents a monthly donation with its details--donation amount, creation time and cancellation time
 */
public class MonthlyDonation extends Donation {


    private static final Integer MONTHS_IN_YEAR = 12;
    private LocalDateTime cancellationTime;

    /**
     * @param donationAmount the donation amount
     * @param creationTime  the creation time of the donation
     */
    public MonthlyDonation(Double donationAmount, LocalDateTime creationTime) {
        super(donationAmount, creationTime);
    }


    /**
     * @return the cancellation time of the donation
     */
    public LocalDateTime getCancellationTime() {
        return cancellationTime;
    }

    /**
     * @param cancellationTime the cancellation time of the donation
     * @throws IllegalArgumentException if the cancellation time is before the creation time
     */
    public void setCancellationTime(LocalDateTime cancellationTime) throws IllegalArgumentException {
        if (cancellationTime.isBefore(this.creationTime)) {
            throw new IllegalArgumentException("Cancellation time cannot be before creation time");
        }
        this.cancellationTime = cancellationTime;
    }


    /**
     * @param year the year to be checked for total donation
     * @return the total donation for the given year
     */
    @Override
    public Double getTotalDonationForYear(Integer year) {
        if (this.cancellationTime == null || this.cancellationTime.getYear() > year) {
            if (this.creationTime.getYear() == year) {
                return this.donationAmount * (MONTHS_IN_YEAR - this.creationTime.getMonthValue() + 1);
            } else if (this.creationTime.getYear() < year) {
                return this.donationAmount * MONTHS_IN_YEAR;
            } else {
                return 0.0;
            }
        } else if (this.cancellationTime.getYear() < year) {
            return 0.0;
        } else {
            if (this.creationTime.getYear() < year) {
                if (this.cancellationTime.getDayOfMonth() < this.creationTime.getDayOfMonth()) {
                    return this.donationAmount * (this.cancellationTime.getMonthValue() - 1);
                } else {
                    return this.donationAmount * this.cancellationTime.getMonthValue();
                }
            } else if (this.creationTime.getYear() == year) {
                if (this.cancellationTime.getDayOfMonth() < this.creationTime.getDayOfMonth()) {
                    return this.donationAmount * (this.cancellationTime.getMonthValue() - this.creationTime.getMonthValue());
                } else {
                    return this.donationAmount * (this.cancellationTime.getMonthValue() - this.creationTime.getMonthValue() + 1);
                }
            } else {
                return 0.0;
            }
        }
    }

    /**
     * @param o the object to be compared with
     * @return true if the given object is equal to this monthly donation
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MonthlyDonation that = (MonthlyDonation) o;
        return Objects.equals(cancellationTime, that.cancellationTime);
    }

    /**
     * @return the hashcode of this monthly donation
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cancellationTime);
    }

    /**
     * @return the string representation of this monthly donation
     */
    @Override
    public String toString() {
        return "MonthlyDonation{" +
                "cancellationTime=" + cancellationTime +
                ", donationAmount=" + donationAmount +
                ", creationTime=" + creationTime +
                '}';
    }
}
