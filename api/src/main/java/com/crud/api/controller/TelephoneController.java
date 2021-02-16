package com.crud.api.controller;

import java.util.List;

import com.crud.api.models.Telephone;
import com.crud.api.repository.TelephoneRepository;

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
public class TelephoneController {
    
    @Autowired
    private TelephoneRepository actions;
    
    @RequestMapping(value = "/telephone", method = RequestMethod.POST)
    public @ResponseBody Telephone save(@RequestBody Telephone telephone){
        return actions.save(telephone);
    }

    @RequestMapping(value = "/telephone", method = RequestMethod.GET)
    public @ResponseBody List<Telephone> findAll(){
        return actions.findAll();
    }

    @RequestMapping(value = "/telephone/{idTelephone}", method = RequestMethod.GET)
    public @ResponseBody Telephone findById(@PathVariable int idTelephone){
        return actions.findById(idTelephone);
    }

    @RequestMapping(value="/telephone", method = RequestMethod.PUT)
    public @ResponseBody Telephone change(@RequestBody Telephone dep){
        return actions.save(dep);
    }

    @RequestMapping(value = "/telephone/{idTelephone}", method = RequestMethod.DELETE)
    public @ResponseBody List<Telephone> delete(@PathVariable int idTelephone){
        Telephone tel = this.findById(idTelephone);
        this.actions.delete(tel);
        return this.actions.findAll();
    }



}
