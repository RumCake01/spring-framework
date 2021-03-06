package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);// pass the name of the config class for which beans we want to create.

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        String dev = container.getBean(String.class);
        ft.createAccount();
        pt.createAccount();
        System.out.println(dev);




        
    }
}
