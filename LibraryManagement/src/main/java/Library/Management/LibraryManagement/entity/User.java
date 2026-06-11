package Library.Management.LibraryManagement.entity;

import Library.Management.LibraryManagement.enums.Role;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;

 private String name;
 private String email;
 private String password;

 @Enumerated(EnumType.STRING)
    private Role role; //USER, LIBRARIAN, ADMIN
}
