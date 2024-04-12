package pe.edu.upao.luisrz.arquitecturaapp.serializers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginRequest {
    String username;
    String password;
}
