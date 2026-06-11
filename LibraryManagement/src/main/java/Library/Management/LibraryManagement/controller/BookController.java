package Library.Management.LibraryManagement.controller;

import Library.Management.LibraryManagement.entity.Book;
import Library.Management.LibraryManagement.entity.User;
import Library.Management.LibraryManagement.service.BookService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    @PreAuthorize("hasRole('LIBRARIAN')")
    public ResponseEntity<Book> borrowBook(@PathVariable Long id, @RequestParam User user){
        Book book = bookService.borrowBook(id, user);
        return ResponseEntity.ok(bookService.addBook(book));
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());

    }
}
