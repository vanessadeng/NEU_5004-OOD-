package problem2;

/**
 * Interface BookCatalog contains methods to operate on a book catalog.
 */
public class EmptyBookCatalog extends BookCatalog{
    /**
     * @return true if the catalog is empty, false otherwise
     */
    @Override
    public Boolean isEmpty() {
        return Boolean.TRUE;
    }

    /**
     * @return the number of books in the catalog
     */
    @Override
    public Integer count() {
        return 0;
    }

    /**
     * @param bookTitle - the title of the book to be checked
     * @return true if the catalog contains the book, false otherwise
     */
    @Override
    public Boolean contains(String bookTitle) {
        return Boolean.FALSE;
    }

    /**
     * @param book - the book to be added to the catalog
     * @return a new BookCatalog with the added book
     */
    @Override
    public NonEmptyBookCatalog addBook(Book book) {
        return new NonEmptyBookCatalog(book,this);

    }

    /**
     * @param book - the book to be removed
     * @return a new BookCatalog with the removed book
     * @throws BookNotFoundException - if the book is not in the catalog
     */
    @Override
    public BookCatalog removeBook(Book book) throws BookNotFoundException {
        throw new BookNotFoundException("This book is not in the catalog.");

    }

    /**
     * @param numRequests    - the minimum number of requests
     * @param numLoanedTimes - the minimum number of times the book has been loaned
     * @return
     */
    @Override
    public BookCatalog findBooksOfRequestsNumber(Integer numRequests, Integer numLoanedTimes) {
        return new EmptyBookCatalog();
    }

    /**
     * @param type - the type of the book to be checked
     * @return a new BookCatalog with the books of the given type
     */
    @Override
    public BookCatalog findBooksOfType(String type) {
        return new EmptyBookCatalog();
    }

    /**
     * @param bookID - the ID of the book to be checked
     * @return a new BookCatalog with the book of the given ID
     * @throws BookNotFoundException - if the book is not in the catalog
     */
    @Override
    public EmptyBookCatalog findBooksOfID(String bookID) throws BookNotFoundException {
        throw new BookNotFoundException("This book is not in the catalog.");
    }

    /**
     * @param type      - the type of the book to be checked
     * @param numCopies - the number of copies of the book
     * @return
     */
    @Override
    public BookCatalog findBooksOfTypeAndRequests(String type, Integer numCopies) {
        return new EmptyBookCatalog();
    }
}
