package pe.edu.upao.luisrz.arquitecturaapp.serializers.producto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EditarProductoRequest {
    private String nombre;
    private Long precio;
    private Long id;
}
