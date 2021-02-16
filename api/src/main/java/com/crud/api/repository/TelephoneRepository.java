package com.crud.api.repository;

import java.util.List;

import com.crud.api.models.Telephone;

import org.springframework.data.repository.CrudRepository;

public interface TelephoneRepository extends CrudRepository<Telephone, Integer>{
    
    List<Telephone> findAll();

    Telephone findById(int idTelephone);

    void delete (Telephone telephone);

    <TelMod extends Telephone> TelMod save(TelMod telephone);
}
