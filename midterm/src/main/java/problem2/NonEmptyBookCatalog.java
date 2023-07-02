package problem2;

/**
 * Interface BookCatalog contains methods to operate on a book catalog.
 */
public class NonEmptyBookCatalog extends BookCatalog{

    private Book firstBook;
    private BookCatalog restOfCatalog;


    private static final Integer MIN_NUM_REQUESTS = 1000;
    private static final Integer MIN_NUM_LOANED_TIMES = 2000;

    private static final BookType requiredType = BookType.PAPERBACK;
    private static final Integer requiredNumCopies = 50;

    /**
     * @param book - the first book in the catalog
     * @param restOfCatalog - the rest of the catalog
     */
    public NonEmptyBookCatalog(Book book, BookCatalog restOfCatalog) {
        this.firstBook = book;
        this.restOfCatalog = restOfCatalog;
    }

    /**
     * @return true if the catalog is empty, false otherwise
     */
    @Override
    public Boolean isEmpty() {
        return Boolean.FALSE;
    }

    /**
     * @return the number of books in the catalog
     */
    @Override
    public Integer count() {
        return 1+restOfCatalog.count();
    }

    /**
     * @param bookTitle - the title of the book
     * @return true if the catalog contains the book, false otherwise
     */
    @Override
    public Boolean contains(String bookTitle) {
        if (this.firstBook.getBookTitle().equals(bookTitle)) {
            return Boolean.TRUE;
        }else return restOfCatalog.contains(bookTitle);
    }

    /**
     * @param book - the book to be added to the catalog
     * @return a new BookCatalog with the added book
     */
    @Override
    public  NonEmptyBookCatalog addBook(Book book) {
        if (!this.contains(book.getBookTitle())) {
            return new NonEmptyBookCatalog(book,this);
    }   else if (this.firstBook.getBookTitle().equals(book.getBookTitle())) {
            return new NonEmptyBookCatalog(book,this.restOfCatalog);
        } else {
            return new NonEmptyBookCatalog(this.firstBook,this.restOfCatalog.addBook(book));
        }
    }

    /**
     * @param book - the book to be removed
     * @return a new BookCatalog with the removed book
     * @throws BookNotFoundException - if the book is not in the catalog
     */
    @Override
    public BookCatalog removeBook(Book book) throws BookNotFoundException {
        if (!this.contains(book.getBookTitle())) {
            throw new BookNotFoundException("This book is not in the catalog.");
        } else if (this.firstBook.getBookTitle().equals(book.getBookTitle())) {
            return this.restOfCatalog;
        } else {
            return this.restOfCatalog.removeBook(book);
        }
    }

    /**
     * @param MIN_NUM_REQUESTS     - the minimum number of requests
     * @param MIN_NUM_LOANED_TIMES - the minimum number of times the book has been loaned
     * @return a new BookCatalog with the books that meet the requirements
     */
    @Override
    public BookCatalog findBooksOfRequestsNumber(Integer MIN_NUM_REQUESTS, Integer MIN_NUM_LOANED_TIMES) {
        if (this.firstBook.getCurrentNumRequests() >= MIN_NUM_REQUESTS && this.firstBook.getNumLoansInPreviousYear()>= MIN_NUM_LOANED_TIMES) {
            return new NonEmptyBookCatalog(this.firstBook, this.restOfCatalog.findBooksOfRequestsNumber(MIN_NUM_REQUESTS, MIN_NUM_LOANED_TIMES));
        } else {
            return this.restOfCatalog.findBooksOfRequestsNumber(MIN_NUM_REQUESTS, MIN_NUM_LOANED_TIMES);
        }
    }


    /**
     * @param type - the type of the book
     * @return a new BookCatalog with the books of the required type
     */
    @Override
    public BookCatalog findBooksOfType(String type) {
        if (this.firstBook.getBookType().equals(type)) {
            return new NonEmptyBookCatalog(this.firstBook, this.restOfCatalog.findBooksOfType(type));
        } else {
            return this.restOfCatalog.findBooksOfType(type);
        }
    }

    /**
     * @param bookID - the ID of the book
     * @return a new BookCatalog with the books of the required ID
     * @throws BookNotFoundException - if the book is not in the catalog
     */
    @Override
    public BookCatalog findBooksOfID(String bookID) throws BookNotFoundException {
        if (this.firstBook.getBookID().equals(bookID)) {
            return new NonEmptyBookCatalog(this.firstBook, this.restOfCatalog.findBooksOfID(bookID));
        } else {
            return this.restOfCatalog.findBooksOfID(bookID);
        }
    }

    /**
     * @param requiredType      - the type of the book
     * @param requiredNumCopies - the number of copies of the book
     * @return a new BookCatalog with the books of the required type and number of copies
     */
    @Override
    public BookCatalog findBooksOfTypeAndRequests(String requiredType, Integer requiredNumCopies) {
        if (this.firstBook.getBookType().equals(requiredType) && this.firstBook.getCurrentNumRequests() >= requiredNumCopies) {
            return new NonEmptyBookCatalog(this.firstBook, this.restOfCatalog.findBooksOfTypeAndRequests(requiredType, requiredNumCopies));
        } else {
            return this.restOfCatalog.findBooksOfTypeAndRequests(requiredType, requiredNumCopies);
        }
    }
    }

