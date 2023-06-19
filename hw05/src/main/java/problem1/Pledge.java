package problem1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Represents a pledge with its details--donation amount, creation time and processing time
 */
public class Pledge extends Donation{

    private LocalDateTime processingTime;

    /**
     * @param donationAmount the donation amount
     * @param creationTime the creation time of the donation
     */
    public Pledge(Double donationAmount, LocalDateTime creationTime) {
        super(donationAmount, creationTime);
        this.processingTime = null;
    }

    /**
     * @param donationAmount the donation amount
     * @param creationTime the creation time of the donation
     * @param processingTime the processing time of the donation
     */
    public Pledge(Double donationAmount, LocalDateTime creationTime, LocalDateTime processingTime) {
        super(donationAmount, creationTime);
        this.processingTime = processingTime;
    }

    /**
     * @return the processing time of the donation
     */
    public LocalDateTime getProcessingTime() {
        return processingTime;
    }

    /**
     * @param processingTime the processing time of the donation
     */
    public void setProcessingTime(LocalDateTime processingTime) {
        if (processingTime.isBefore(this.creationTime)) {
            throw new IllegalArgumentException("Processing time cannot be before creation time");
        }
        this.processingTime = processingTime;
    }

    /**
     * Remove the processing time of the donation
     */
    public void removeProcessingDateTime()  {
        this.processingTime = null;
    }

    /**
     * @param year the year to be checked for total donation
     * @return the total donation for the given year
     */
    @Override
    public Double getTotalDonationForYear(Integer year) {
        if (this.processingTime == null || this.processingTime.getYear() != year){
            return 0.0;
        }else {
            return this.donationAmount;
        }
    }

    /**
     * @param o the object to be compared with
     * @return true if the given object is equal to this object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pledge pledge = (Pledge) o;
        return Objects.equals(processingTime, pledge.processingTime);
    }

    /**
     * @return the hash code of this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), processingTime);
    }

    /**
     * @return the string representation of the object
     */
    @Override
    public String toString() {
        return "Pledge{" +
                "processingTime=" + processingTime +
                ", donationAmount=" + donationAmount +
                ", creationTime=" + creationTime +
                '}';
    }
}
