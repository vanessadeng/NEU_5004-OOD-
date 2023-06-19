package problem1;

/**
 *  a class representing a double room including its price, number of guests and maximum occupancy
 *  A double room can be booked by 2 guests
 */
public class DoubleRoom extends Room{

    protected Integer maximumOccupancy = 2;

    /**
     * @param price  `price of the room
     * @param numberOfGuests number of guests in the room
     * @param maximumOccupancy maximum occupancy of the room
     * @throws invalidPriceException if price is less than 0
     * @throws invalidOccupancyException    if number of guests is greater than maximum occupancy
     */
    public DoubleRoom(Double price, Integer numberOfGuests, Integer maximumOccupancy) throws invalidPriceException,invalidOccupancyException {
        super(price, numberOfGuests);
        if (numberOfGuests > this.maximumOccupancy) {
            throw new invalidOccupancyException("Number of guests cannot exceed maximum occupancy");
        }
        if (price < MINIMUM_PRICE) {
            throw new invalidPriceException("Price must be greater than 0");
        }
        this.maximumOccupancy = maximumOccupancy;
    }

    /**
     * @return maximum occupancy of the room
     */
    public Integer getMaximumOccupancy() {
        return maximumOccupancy;
    }


    /**
     * @param numOfGuests number of guests to be booked
     * @throws invalidOccupancyException if number of guests is greater than maximum occupancy
     */
    public void bookRoom(int numOfGuests) throws invalidOccupancyException, unavailableRoomException {
        if (isAvailable()== false) {
            throw new unavailableRoomException("Room is not available");
        }
        if (numOfGuests > this.maximumOccupancy) {
            throw new invalidOccupancyException("Number of guests cannot exceed maximum occupancy");
        }
        this.numberOfGuests = numOfGuests;
    }

    @Override
    public String toString() {
        return "DoubleRoom{" +
                "maximumOccupancy=" + maximumOccupancy +
                ", price=" + price +
                ", numberOfGuests=" + numberOfGuests +
                '}';
    }
}
