package pe.edu.upao.luisrz.arquitecturaapp.serializers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientRequest {
    private String nombreCompleto;
    private String email;
    private String dni;
}
