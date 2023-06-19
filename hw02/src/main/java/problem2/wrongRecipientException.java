package problem2;

/**
 * Thrown when the input dimension is invalid
 */
public class wrongRecipientException extends Throwable{

    public wrongRecipientException(String message) {
        super(message);
    }
}
