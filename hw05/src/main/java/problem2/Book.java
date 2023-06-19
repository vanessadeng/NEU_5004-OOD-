package problem2;

/**
 * Represents a book with its details--author, title, year
 */
public class Book extends Item{


    /**
     * @param author the author of the book
     * @param title the title of the book
     * @param year the year of publication of the book
     */
    public Book(Author author, String title, Integer year) {
        super(author, title, year);
    }


}
