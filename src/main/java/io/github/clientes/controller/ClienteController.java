package io.github.clientes.controller;


import io.github.clientes.model.Cliente;
import io.github.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

private final ClienteRepository repository;

    @Autowired
    public ClienteController(ClienteRepository repository){
    this.repository = repository;
}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar( @RequestBody Cliente cliente){
        return repository.save(cliente);
    }

}
