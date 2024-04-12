package pe.edu.upao.luisrz.arquitecturaapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upao.luisrz.arquitecturaapp.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
