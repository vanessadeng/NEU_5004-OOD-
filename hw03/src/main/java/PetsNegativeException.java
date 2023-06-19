/**
 * PetsNegativeException is a custom exception class that is thrown when the number of pets is negative.
 */
public class PetsNegativeException extends Exception{

    /**
     * @param message The message of the exception
     */
    public PetsNegativeException(String message) {
        super(message);
    }
}
