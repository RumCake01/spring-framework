package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {
    // create an object that we want Spring to create a bean for

    // this return an instance of FulltimeMentor
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }
    //@Bean(name ="p1")
    @Bean
    @Primary
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

    //@Bean(name = "p2")
    @Bean
    PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }




}
