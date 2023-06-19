package problem1;

/**
 * Represents an exception for invalid occupancy
 */
public class invalidOccupancyException extends Exception{

    /**
     * @param message error message
     */
    public invalidOccupancyException(String message) {
        super(message);
    }
}
