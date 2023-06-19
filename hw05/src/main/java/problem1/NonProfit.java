package problem1;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents a non-profit organization with its details--organization name and donation list
 */
public class NonProfit {


    private String organizationName;

    private ArrayList<Donation> donationList;

    /**
     * @param organizationName the name of the non-profit organization
     * @param donationList    the list of donations made to the non-profit organization
     */
    public NonProfit(String organizationName, ArrayList<Donation> donationList) {
        this.organizationName = organizationName;
        this.donationList = donationList;
    }

    /**
     * @param organizationName the name of the non-profit organization
     */
    public NonProfit(String organizationName) {
        this.organizationName = organizationName;
        this.donationList = new ArrayList<>();
    }

    /**
     * @return the name of the non-profit organization
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * @return the list of donations made to the non-profit organization
     */
    public ArrayList<Donation> getDonationList() {
        return donationList;
    }

    /**
     * @param year the year to be checked for total donation
     * @return the total donation for the given year
     */
    public Double getTotalDonationForYear(Integer year) {
        Double total = 0.0;
        for (Donation donation : this.donationList) {
            total += donation.getTotalDonationForYear(year);
        }
        return total;
    }

    /**
     * @param o     the object to be compared
     * @return true if the given object is equal to this object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonProfit nonProfit = (NonProfit) o;
        return Objects.equals(organizationName, nonProfit.organizationName) && Objects.equals(donationList, nonProfit.donationList);
    }

    /**
     * @return the hashcode of this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(organizationName, donationList);
    }

    /**
     * @return the string representation of this object
     */
    @Override
    public String toString() {
        return "NonProfit{" +
                "organizationName='" + organizationName + '\'' +
                ", donationList=" + donationList +
                '}';
    }


}
