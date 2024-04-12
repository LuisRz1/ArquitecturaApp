package pe.edu.upao.luisrz.arquitecturaapp.controller;

import jakarta.persistence.EntityManager;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upao.luisrz.arquitecturaapp.model.User;
import pe.edu.upao.luisrz.arquitecturaapp.repositories.UserRepository;
import pe.edu.upao.luisrz.arquitecturaapp.serializers.LoginRequest;
import pe.edu.upao.luisrz.arquitecturaapp.serializers.LoginResponse;
import pe.edu.upao.luisrz.arquitecturaapp.services.AuthenticationService;

import javax.swing.text.html.parser.Entity;
import java.util.Optional;

@RestController
public class LoginController {

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("api/v1/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        if (authenticationService.login(request.getUsername(), request.getPassword())) {
            return new LoginResponse("token");
        } else {
            throw new IllegalArgumentException("Usuario o contraseña incorrecto");
        }
    }
}