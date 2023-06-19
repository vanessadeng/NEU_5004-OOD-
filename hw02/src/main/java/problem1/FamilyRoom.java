package problem1;

/**
 * Represents a family room which is a type of room. A family room has a maximum occupancy of 4.
 */
public class FamilyRoom extends Room{

    protected Integer maximumOccupancy = 4;

    /**
     * @param price  price of the room
     * @param numberOfGuests  number of guests in the room
     * @param maximumOccupancy  maximum occupancy of the room
     * @throws invalidPriceException  if price is less than 0 or greater than 1000
     * @throws invalidOccupancyException if number of guests is greater than maximum occupancy
     */
    public FamilyRoom(Double price, Integer numberOfGuests, Integer maximumOccupancy) throws invalidPriceException,invalidOccupancyException {
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
    public void bookRoom(int numOfGuests) throws invalidOccupancyException, unavailableRoomException{
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
        return "FamilyRoom{" +
                "maximumOccupancy=" + maximumOccupancy +
                ", price=" + price +
                ", numberOfGuests=" + numberOfGuests +
                '}';
    }
}



