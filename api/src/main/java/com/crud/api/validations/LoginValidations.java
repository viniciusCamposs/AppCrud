package com.crud.api.validations;

public class LoginValidations {
    
    public boolean loginVerify(String user, String password){
        if(user.equals("1234567") && password.equals("1234567")){
            return true;
        }

        return false;
    }

}
