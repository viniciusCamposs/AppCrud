package com.crud.api.controller;

import java.util.List;

import com.crud.api.models.Adress;
import com.crud.api.repository.AdressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/crud")
public class AdressController {
    
    @Autowired
    private AdressRepository actions;
    
    @RequestMapping(value = "/adress", method = RequestMethod.POST)
    public @ResponseBody Adress save(@RequestBody Adress adress){
        return actions.save(adress);
    }

    @RequestMapping(value = "/adress", method = RequestMethod.GET)
    public @ResponseBody List<Adress> findAll(){
        return actions.findAll();
    }

    @RequestMapping(value = "/adress/{idAdress}", method = RequestMethod.GET)
    public @ResponseBody Adress findById(@PathVariable int idAdress){
        return actions.findById(idAdress);
    }

    @RequestMapping(value="/adress", method = RequestMethod.PUT)
    public @ResponseBody Adress change(@RequestBody Adress adr){
        return actions.save(adr);
    }

    @RequestMapping(value = "/adress/{idAdress}", method = RequestMethod.DELETE)
    public @ResponseBody List<Adress> delete(@PathVariable int idAdress){
        Adress adr = this.findById(idAdress);
        this.actions.delete(adr);
        return this.actions.findAll();
    }


}
