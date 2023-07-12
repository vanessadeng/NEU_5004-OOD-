import java.util.ArrayList;
import java.util.List;

/**
 * @param <P> Property type
 * @param <C> Contract type
 */
public class Agent<P extends Property, C extends Contract> {

    private String name;
    private List<Listing<P, C>> listings;
    private Double commissionRate;
    private Double totalEarnings;
    private static final Double ZERO = 0.0;
    private static final Double ONE = 1.0;


    /**
     * @param name Agent name
     * @param listings List of listings
     * @param commissionRate Commission rate
     * @throws InvalidRateException If commission rate is not between 0 and 1
     */
    public Agent(String name, List<Listing<P, C>> listings, Double commissionRate)
        throws InvalidRateException {
        this.checkValidRate(commissionRate);
        this.name = name;
        this.listings = listings;
        this.commissionRate = commissionRate;
        this.totalEarnings = 0.0;
    }

    /**
     * @param name Agent name
     * @param commissionRate Commission rate
     * @throws InvalidRateException If commission rate is not between 0 and 1
     */
    public Agent(String name, Double commissionRate) throws InvalidRateException {
        this.checkValidRate(commissionRate);
        this.name = name;
        this.listings = new ArrayList<>();
        this.commissionRate = commissionRate;
        this.totalEarnings = 0.0;
    }

    /**
     * @return Agent name as String
     */
    public String getName() {
        return name;
    }

    /**
     * @return List of listings as List
     */
    public List<Listing<P, C>> getListings() {
        return listings;
    }

    /**
     * @return Commission rate as Double
     */
    public Double getCommissionRate() {
        return commissionRate;
    }

    /**
     * @return Total earnings as Double
     */
    public Double getTotalEarnings() {
        return totalEarnings;
    }

    /**
     * @param listing Listing to be added
     */
    public void addListing(Listing<P, C> listing) {
        this.listings.add(listing);
    }

    /**
     * @param newListing Listing to be checked
     * @return True if the listing is in the current list, false otherwise
     */
    private Boolean inCurrentList(Listing newListing) {
        for (Listing item: listings) {
            if (item.equals(newListing)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param listing Listing to be completed
     * @throws ListingNotExistException If the listing is not in the current list
     * @throws NegativeValueException If the total earnings is negative
     */
    public void completeListing(Listing<P, C> listing)
        throws ListingNotExistException, NegativeValueException {
        if (inCurrentList(listing)) {
            listings.remove(listing);
            totalEarnings += listing.getContract().calculateCommission() * commissionRate;
            this.checkNegativeValue(totalEarnings);
        } else throw new ListingNotExistException("The listing is not exist.");
    }

    /**
     * @param listing Listing to be dropped
     * @throws ListingNotExistException If the listing is not in the current list
     */
    public void dropListing(Listing<P, C> listing) throws ListingNotExistException {
        if (inCurrentList(listing)) {
            listings.remove(listing);
        } else throw new ListingNotExistException("The listing is not exist.");
    }

    /**
     * @return Total portfolio value as Double
     */
    public Double getTotalPortfolioValue() {
        Double total = 0.0;
        for (Listing item: listings) {
            total += item.getContract().calculateCommission() * commissionRate;
        }
        return total;
    }

    /**
     * @param value Value to be checked
     * @param <T> Number type
     * @throws InvalidRateException If the value is not between 0 and 1
     */
    public <T extends Number> void checkValidRate(T value)
        throws InvalidRateException {
        if (value.doubleValue() < ZERO || value.doubleValue() > ONE) {
            throw new InvalidRateException("Rate is invalid");
        }
    }

    /**
     * @param value Value to be checked
     * @param <T> Number type
     * @throws NegativeValueException If the value is negative
     */
    public <T extends Number> void checkNegativeValue(T value)
        throws NegativeValueException {
        if (value.doubleValue() < ZERO) {
            throw new NegativeValueException("Value can't be negative");
        }
    }
}


