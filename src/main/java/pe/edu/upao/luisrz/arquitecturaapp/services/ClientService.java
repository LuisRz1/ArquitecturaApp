package pe.edu.upao.luisrz.arquitecturaapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.luisrz.arquitecturaapp.model.Client;
import pe.edu.upao.luisrz.arquitecturaapp.repositories.ClientRepository;
import pe.edu.upao.luisrz.arquitecturaapp.serializers.EditarClienteRequest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    public ClientRepository clientRepository;

    public Client addClient(Client client){
      return  clientRepository.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client updateClient(EditarClienteRequest request){
        Optional<Client> client = clientRepository.findById(request.getId());
        client.get().setEmail(request.getEmail());

        return client.get();
    }

    public List<Client> eliminarClient(Long id){
        Optional<Client> client = clientRepository.findById(id);
        if(client.isEmpty()){
            throw new RuntimeException("Cliente no encontrado");
        }
        clientRepository.delete(client.get());
        return getAllClients();
    }

}

