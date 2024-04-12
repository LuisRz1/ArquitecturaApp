package pe.edu.upao.luisrz.arquitecturaapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "productos")
@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_producto")
    private Long idProducto;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name= "precio", nullable = false)
    private Long precio;
}
