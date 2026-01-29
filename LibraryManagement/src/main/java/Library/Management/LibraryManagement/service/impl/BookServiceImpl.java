package Library.Management.LibraryManagement.service.impl;

import Library.Management.LibraryManagement.entity.Book;
import Library.Management.LibraryManagement.entity.User;
import Library.Management.LibraryManagement.exception.BookNotAvailableException;
import Library.Management.LibraryManagement.exception.BookNotFoundException;
import Library.Management.LibraryManagement.repository.BookRepository;
import Library.Management.LibraryManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;


    public Book borrowBook(Long bookId, Long userId) {

        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));
                //.orElseThrow(() -> new RuntimeException("Book not found"));
        //save history
        //send notification by using multithreading
        if(book.getAvailableCopies() <= 0) throw new RuntimeException("book not found");
        book.setAvailableCopies(book.getAvailableCopies()-1);
        bookRepository.save(book);
        return book;

    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book borrowBook(Long bookId, User user) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book not found exception"));

        if(book.getAvailableCopies() <= 0){
            throw new BookNotAvailableException(bookId);
        }
        book.setAvailableCopies(book.getAvailableCopies()-1);
        bookRepository.save(book);
        //save to borrowHistory
        //log activity
        return book;
    }
    @Override
    public List<Book> getAvailableBooks() {
        return bookRepository.findAll().stream()
                .filter(b -> b.getAvailableCopies() > 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooks() {
        return List.of();
    }

}
