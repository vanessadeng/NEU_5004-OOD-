package problem1;

/**
 * Represents an exception for invalid price
 */
public class invalidPriceException extends Exception{

    /**
     * @param message error message
     */
    public invalidPriceException(String message) {
        super(message);
    }
}
