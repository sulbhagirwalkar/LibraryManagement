package Library.Management.LibraryManagement.exception;

import org.springframework.http.HttpStatus;

public class LibraryException extends RuntimeException{

    public LibraryException(String message, HttpStatus httpStatus) {
        super(message);
    }
}
