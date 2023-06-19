package problem2;

/**
 * Thrown when the input dimension is invalid
 */
public class exceedDimensionException extends Exception {
    public exceedDimensionException(String invalidInput) {

super(invalidInput);
    }
}
