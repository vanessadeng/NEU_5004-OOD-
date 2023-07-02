package problem2;

/**
 * Interface BookCatalogInterface contains all operation for a book catalog.
 */
public interface BookCatalogInterface {


    /**
     * @return true if the catalog is empty, false otherwise
     */
    Boolean isEmpty();

    /**
     * @return the number of books in the catalog
     */
    Integer count();

    /**
     * @param bookTitle - the title of the book
     * @return true if the catalog contains the book, false otherwise
     */
    Boolean contains(String bookTitle);

    /**
     * @param book - the book to be added
     * @return a new BookCatalog with the added book
     */
    NonEmptyBookCatalog addBook(Book book);

    /**
     * @param book - the book to be removed
     * @return a new BookCatalog with the removed book
     * @throws BookNotFoundException - if the book is not in the catalog
     */
    BookCatalog removeBook(Book book) throws BookNotFoundException;

    /**
     * @param numRequests  - the minimum number of requests
     * @param numLoanedTimes - the minimum number of times the book has been loaned
     * @return a new BookCatalog with the books that have been requested at least numRequests times and have been loaned at least numLoanedTimes times
     */
    BookCatalog findBooksOfRequestsNumber(Integer numRequests, Integer numLoanedTimes);

    /**
     * @param type - the type of the book
     * @return a new BookCatalog with the books of the given type
     */
    BookCatalog findBooksOfType(String type);


    /**
     * @param bookID - the ID of the book
     * @return a new BookCatalog with the book of the given ID
     * @throws BookNotFoundException - if the book is not in the catalog
     */
    BookCatalog findBooksOfID(String bookID) throws BookNotFoundException;

    /**
     * @param type    - the type of the book
     * @param numCopies - the number of copies of the book
     * @return a new BookCatalog with the books of the given type and number of copies
     */
    BookCatalog findBooksOfTypeAndRequests(String type, Integer numCopies);




}
