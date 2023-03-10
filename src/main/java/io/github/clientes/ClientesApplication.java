package io.github.clientes;

import io.github.clientes.model.Cliente;
import io.github.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClienteRepository repository){
        return  args -> {
            Cliente cliente =  Cliente.builder().nome("carlos").cpf("07272825499").build();
            repository.save(cliente);
        };

    }



    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class,args);
    }
}
