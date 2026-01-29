package Library.Management.LibraryManagement.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String msg){
        super(msg);
    }

}
