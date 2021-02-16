package com.crud.api.controller;

import com.crud.api.validations.LoginValidations;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/crud")
public class LoginController {
    
    LoginValidations validation = new LoginValidations();

    @RequestMapping(value="/login/{user}/{password}", method = RequestMethod.GET)
    public @ResponseBody boolean verificaLogin(@PathVariable String user, @PathVariable String password){
        if(this.validation.loginVerify(user, password)){
            return true;
        }

        return false;
    }

}
