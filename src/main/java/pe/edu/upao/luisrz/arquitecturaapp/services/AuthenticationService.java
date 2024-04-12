package pe.edu.upao.luisrz.arquitecturaapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.luisrz.arquitecturaapp.model.User;
import pe.edu.upao.luisrz.arquitecturaapp.repositories.UserRepository;
import pe.edu.upao.luisrz.arquitecturaapp.serializers.LoginResponse;

import java.util.Optional;

@Service
public class AuthenticationService {

    @Autowired
    public UserRepository userRepository;

    public boolean login(String username, String password){
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isPresent()){
            if (user.get().getPassword().equals("1234")){
                return  true;
            }
        }
        return false;
    }
}

