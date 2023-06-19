package problem1;

import java.util.Objects;

/**
 * Represents a room with its details--price, number of guests
 */
public class Room {


    protected Double price;
    protected Integer numberOfGuests;
    protected static final Integer MINIMUM_PRICE = 0;

    /**
     * @param price price of the room
     * @param numberOfGuests number of guests in the room
     * @throws invalidPriceException if price is less than 0
     */
    public Room(Double price, Integer numberOfGuests) throws invalidPriceException {
        if (price < MINIMUM_PRICE) {
            throw new invalidPriceException("Price must be greater than 0");
        }

        this.price = price;
        this.numberOfGuests = 0;
    }

    /**
     * @return true if the room is available, false otherwise
     */
    public Boolean isAvailable() {
        return this.numberOfGuests == 0;
    }


    /**
     * @return price of the room
     */
    public Double getPrice() {
        return this.price;
    }


    /**
     * @return number of guests in the room
     */
    public Integer getNumberOfGuests() {
        return this.numberOfGuests;
    }

    /**
     * @param o object to be compared
     * @return true if the two objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(price, room.price) && Objects.equals(numberOfGuests, room.numberOfGuests);
    }

    /**
     * @return hashcode of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(price, numberOfGuests);
    }
}
