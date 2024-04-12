package pe.edu.upao.luisrz.arquitecturaapp.serializers.producto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductoSerializer {
    private String nombre;
    private Long precio;
}
