package pe.edu.upao.luisrz.arquitecturaapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upao.luisrz.arquitecturaapp.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u from User u where u.username = :username")
    Optional<User> findByUsername(String username);
}
