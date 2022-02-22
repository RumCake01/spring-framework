package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {



 @Bean
    Car car() {
        Car c = new Car();
        c.setMake("BMW");
        return c;
}
//
     // ****   // Example of direct wiring
//    @Bean
//    Person person(){
//        Person p =new Person();
//        p.setName("Anna");
//        p.setCar(car());
//        return p;
//    }


    // ****  Example of Auto-wiring

    @Bean
    Person person(Car car) {
        Person p = new Person();
        p.setName("Anna");
        p.setCar(car);
        return p;
    }
}
