package Library.Management.LibraryManagement.exception;

public class BookNotAvailableException extends RuntimeException{
    Long bookId;
    public BookNotAvailableException( Long bookId) {
        super("Book is not available");
        this.bookId = bookId;
    }
}
