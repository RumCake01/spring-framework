package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor  // with ths constructor we dont need to provide @Autowired annotation
public class Java {

    // field injection is not recommended
//    @Autowired
//    OfficeHours officeHours;


    // COnstructor injection, but instead we used ->
    // @AllArgumenrsConstructor because we have only one constructor
    OfficeHours officeHours;
//    @Autowired
//    public Java(OfficeHours officeHours){
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + officeHours.getHours());

    }
}
