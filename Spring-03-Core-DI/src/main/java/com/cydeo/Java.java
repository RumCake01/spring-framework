package com.cydeo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {

    // field injection
//    @Autowired
//    OfficeHours officeHours;


    // COnstructor injection

    OfficeHours officeHours;
    @Autowired
    public Java(OfficeHours officeHours){
        this.officeHours = officeHours;
    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()));

    }
}
