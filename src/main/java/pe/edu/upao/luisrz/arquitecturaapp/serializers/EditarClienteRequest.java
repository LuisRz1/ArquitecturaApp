package pe.edu.upao.luisrz.arquitecturaapp.serializers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EditarClienteRequest {
    private Long id;
    private String nombreCompleto;
    private String dni;
    private String email;
}
