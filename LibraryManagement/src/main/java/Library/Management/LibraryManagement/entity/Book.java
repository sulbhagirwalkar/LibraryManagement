package Library.Management.LibraryManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private String genre;
    private int totalCopies;

    /* public int getAvailableCopies() {
        return totalCopies - c
    } */

    public void setAvailableCopies(int i) {
    }

    public int getAvailableCopies() {
        return getAvailableCopies();
    }
}
