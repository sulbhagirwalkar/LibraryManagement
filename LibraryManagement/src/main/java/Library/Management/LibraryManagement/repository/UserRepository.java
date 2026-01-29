package Library.Management.LibraryManagement.repository;

import Library.Management.LibraryManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
