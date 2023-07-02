package problem2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * Class Book contains information about a book, as needed for a library management system.
 */
public class Book {

    private String bookID;
    private String bookTitle;
    private String[] authors;
    private BookType bookType;
    private LocalDate dateOfFirstPrint;
    private LocalDate dateOfTheLatestRevision;
    private Integer numCopies;
    private Integer numLoansInPreviousYear;
    private Integer currentNumRequests;

    /**
     * Constructor for a class Book.
     * @param bookID bookID is a unique book identifier, represented as a String.
     * @param bookTitle book title, represented as a String.
     * @param authors lost of book authors, represented as an array of Strings.
     * @param bookType book type, represented as a custom data type BookType.
     * @param dateOfFirstPrint date the book was first printed, represented as LocalDate.
     * @param dateOfTheLatestRevision date of the book's latest revision, represented as a LocalDate.
     * @param numCopies number of copies available in the library, represented as an Integer.
     * @param numLoansInPreviousYear number of times this book was loaned or loan extended in the
     *                               last year.
     * @param currentNumRequests current number of requests (holds) on this book.
     */
    public Book(String bookID, String bookTitle, String[] authors, BookType bookType,
                LocalDate dateOfFirstPrint, LocalDate dateOfTheLatestRevision, Integer numCopies,
                Integer numLoansInPreviousYear, Integer currentNumRequests) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.authors = authors;
        this.bookType = bookType;
        this.dateOfFirstPrint = dateOfFirstPrint;
        this.dateOfTheLatestRevision = dateOfTheLatestRevision;
        this.numCopies = numCopies;
        this.numLoansInPreviousYear = numLoansInPreviousYear;
        this.currentNumRequests = currentNumRequests;
    }

    /**
     * Getter for the book's unique identifier.
     * @return book's ID, represented as String.
     */
    public String getBookID() {
        return bookID;
    }

    /**
     * Getter for the book's title.
     * @return book's title, represented as String.
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Getter for the book's authors.
     * @return book's authors, represented as an array of Strings.
     */
    public String[] getAuthors() {
        return authors;
    }

    /**
     * Getter for the book type.
     * @return book type, represented as a custom data type, BookType.
     */
    public BookType getBookType() {
        return bookType;
    }

    /**
     * Getter for the date of the first publication of the book.
     * @return date of the first publication, represented as LocalDate.
     */
    public LocalDate getDateOfFirstPrint() {
        return dateOfFirstPrint;
    }

    /**
     * Getter for the date of the last publication of the book.
     * @return date of the last publication, represented as LocalDate.
     */
    public LocalDate getDateOfTheLatestRevision() {
        return dateOfTheLatestRevision;
    }

    /**
     * Getter for the number of copies of the book, owned by the library.
     * @return number of copies of the book, represented as an Integer.
     */
    public Integer getNumCopies() {
        return numCopies;
    }

    /**
     * Getter for the number of loans and extended loans for the book, made in the last year.
     * @return number of loans and extended loans for the book, made in the last year,
     * represented as an Integer.
     */
    public Integer getNumLoansInPreviousYear() {
        return numLoansInPreviousYear;
    }

    /**
     * Getter for the current number of requests (holds) made on the book.
     * @return current number of requests (holds) made on the book,
     * represented as an Integer.
     */
    public Integer getCurrentNumRequests() {
        return currentNumRequests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(bookID, book.bookID) && Objects.equals(bookTitle,
                book.bookTitle) && Arrays.equals(authors, book.authors) && bookType == book.bookType
                && Objects.equals(dateOfFirstPrint, book.dateOfFirstPrint)
                && Objects.equals(dateOfTheLatestRevision, book.dateOfTheLatestRevision)
                && Objects.equals(numCopies, book.numCopies) && Objects.equals(
                numLoansInPreviousYear, book.numLoansInPreviousYear) && Objects.equals(
                currentNumRequests, book.currentNumRequests);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(bookID, bookTitle, bookType, dateOfFirstPrint,
                dateOfTheLatestRevision,
                numCopies, numLoansInPreviousYear, currentNumRequests);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID='" + bookID + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", bookType=" + bookType +
                ", dateOfFirstPrint=" + dateOfFirstPrint +
                ", dateOfTheLatestRevision=" + dateOfTheLatestRevision +
                ", numCopies=" + numCopies +
                ", numLoansInPreviousYear=" + numLoansInPreviousYear +
                ", currentNumRequests=" + currentNumRequests +
                '}';
    }
}
