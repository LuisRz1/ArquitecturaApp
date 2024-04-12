package pe.edu.upao.luisrz.arquitecturaapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appclient")
public class Client {
    @Id
    @Column(name = "idClient")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nombreCompleto")
    private String nombreCompleto;
    @Column(name = "Email")
    private String email;
    @Column(name = "DNI")
    private String dni;
}
