package Library.Management.LibraryManagement.service;

import Library.Management.LibraryManagement.entity.Book;
import Library.Management.LibraryManagement.entity.User;

import java.util.List;

public interface BookService {
    public Book borrowBook(Long bookId, User user);
    public Book addBook(Book book);
    public List<Book> getAvailableBooks();

    List<Book> getAllBooks();

    void deleteBook(Long bookId);
}
