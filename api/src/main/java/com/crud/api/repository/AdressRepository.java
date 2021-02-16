package com.crud.api.repository;

import java.util.List;

import com.crud.api.models.Adress;

import org.springframework.data.repository.CrudRepository;

public interface AdressRepository extends CrudRepository<Adress, Integer>{
    
    List<Adress> findAll();

    Adress findById(int idAdress);

    void delete(Adress adress);

    <AdMod extends Adress> AdMod save(AdMod adress);

}
