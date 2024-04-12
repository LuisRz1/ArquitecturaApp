package pe.edu.upao.luisrz.arquitecturaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upao.luisrz.arquitecturaapp.model.Client;
import pe.edu.upao.luisrz.arquitecturaapp.serializers.ClientRequest;
import pe.edu.upao.luisrz.arquitecturaapp.serializers.EditarClienteRequest;
import pe.edu.upao.luisrz.arquitecturaapp.services.ClientService;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/listar")
    public List<ClientRequest> listarClientes(){
        return clientService.getAllClients().stream().map((it) -> new ClientRequest(it.getNombreCompleto(), it.getDni(), it.getEmail())).toList();
    }
    @PostMapping("/crear")
    public Client crearCliente(@RequestBody ClientRequest request){
        Client client = new Client(null, request.getNombreCompleto(), request.getEmail(), request.getDni());
        return clientService.addClient(client);
    }
    @PutMapping("/actualizar")
    public Client editarClient(@RequestBody EditarClienteRequest request){
        return clientService.updateClient(request);
    }
    @DeleteMapping("/eliminar")
    public List<Client> eliminarClient(@RequestBody Long id){
        return clientService.eliminarClient(id);
    }
}
