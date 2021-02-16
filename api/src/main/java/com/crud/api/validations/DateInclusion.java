package com.crud.api.validations;

import java.time.LocalDate;

public class DateInclusion {
    
    public static String getSysdate(){
        LocalDate localDate = LocalDate.now();
        String sysdate = localDate.toString();
        return sysdate;
    }
}
