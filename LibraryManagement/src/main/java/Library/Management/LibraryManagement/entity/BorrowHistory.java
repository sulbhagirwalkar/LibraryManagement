package Library.Management.LibraryManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BorrowHistory {
    @Id @GeneratedValue
    private long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Book book;

    private LocalDate borrowedDate;
    private LocalDate expectedReturnDate;
    private LocalDate actualReturnDate;
    private boolean returned;
}
