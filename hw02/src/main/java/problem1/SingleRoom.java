package problem1;

/**
 * Represents a single room with details--maximum occupancy, price, and number of guests
 */
public class SingleRoom extends Room{

    protected Integer maximumOccupancy = 1;

    /**
     * @param price  price of the room
     * @param numberOfGuests number of guests in the room
     * @param maximumOccupancy maximum occupancy of the room
     * @throws invalidPriceException if price is less than 0 or greater than 1000
     * @throws invalidOccupancyException if number of guests is greater than maximum occupancy
     */
    public SingleRoom(Double price, Integer numberOfGuests, Integer maximumOccupancy) throws invalidPriceException, invalidOccupancyException {
        super(price, numberOfGuests);
        if (numberOfGuests > maximumOccupancy) {
            throw new invalidOccupancyException("Number of guests cannot exceed maximum occupancy");
        }
        if (price < MINIMUM_PRICE) {
            throw new invalidPriceException("Price must be greater than 0");
        }
            this.maximumOccupancy = maximumOccupancy;
        }

    /**
     * @param numOfGuests number of guests to be booked
     * @throws invalidOccupancyException if number of guests is greater than maximum occupancy
     */
    public void bookRoom(int numOfGuests) throws invalidOccupancyException,unavailableRoomException{
        if (isAvailable()== false) {
            throw new unavailableRoomException("Room is not available");
        }
        if (numOfGuests > this.maximumOccupancy) {
            throw new invalidOccupancyException("Number of guests cannot exceed maximum occupancy");
        }
        this.numberOfGuests = numOfGuests;
    }

    /**
     * @return maximum occupancy of the room
     */
    public Integer getMaximumOccupancy() {
        return maximumOccupancy;
    }


    /**
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "SingleRoom{" +
                "maximumOccupancy=" + maximumOccupancy +
                ", price=" + price +
                ", numberOfGuests=" + numberOfGuests +
                '}';
    }
}





