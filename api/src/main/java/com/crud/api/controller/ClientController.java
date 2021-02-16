package com.crud.api.controller;

import java.util.List;

import com.crud.api.models.Client;
import com.crud.api.repository.ClientRepository;
import com.crud.api.validations.CpfValidation;

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
public class ClientController {
    
    @Autowired
    private ClientRepository actions;
    
    @RequestMapping(value = "/client", method = RequestMethod.POST)
    public @ResponseBody Client save(@RequestBody Client client){
        return actions.save(client);
    }

    @RequestMapping(value = "/client/cpf/valid/{cpf}", method = RequestMethod.GET)
    public @ResponseBody boolean cpfExists(@PathVariable String cpf){
        if(CpfValidation.isCPF(cpf)){
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public @ResponseBody List<Client> findAll(){
        return actions.findAll();
    }

    @RequestMapping(value = "/client/id/{idClient}", method = RequestMethod.GET)
    public @ResponseBody Client findById(@PathVariable int idClient){
        return actions.findById(idClient);
    }

    @RequestMapping(value = "/client/cpf/{cpf}", method = RequestMethod.GET)
    public @ResponseBody boolean findByCpf(@PathVariable String cpf){
        if(actions.findByCpf(cpf) != null){
            return true;
        }
        return false;
    }

    @RequestMapping(value="/client", method = RequestMethod.PUT)
    public @ResponseBody Client change(@RequestBody Client cli){
        return actions.save(cli);
    }

    @RequestMapping(value = "/client/{idClient}", method = RequestMethod.DELETE)
    public @ResponseBody List<Client> delete(@PathVariable int idClient){
        Client cli = this.findById(idClient);
        this.actions.delete(cli);
        return this.actions.findAll();
    }

}
