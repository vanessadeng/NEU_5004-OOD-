package problem2;

/**
 * Exception BookNotFoundException is thrown when a book is not found in the catalog.
 */
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String s) {
        super(s);
    }
}
