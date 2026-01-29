package Library.Management.LibraryManagement.exception;

public class BookNotAvailableException extends RuntimeException{
    Long bookId;
    public BookNotAvailableException( Long bookId) {
       // this.bookId = bookId;
        super();
    }
}
