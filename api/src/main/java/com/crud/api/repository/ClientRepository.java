package com.crud.api.repository;

import java.util.List;

import com.crud.api.models.Client;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer>{
    
    List<Client> findAll();

    Client findById(int idClient);

    Client findByCpf(String cpf);

    void delete (Client client);

    <CliMod extends Client> CliMod save(CliMod client);

}
