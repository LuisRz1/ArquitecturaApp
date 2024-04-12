package pe.edu.upao.luisrz.arquitecturaapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upao.luisrz.arquitecturaapp.model.Client;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
