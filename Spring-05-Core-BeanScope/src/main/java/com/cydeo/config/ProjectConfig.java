package com.cydeo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
//@ComponentScan(basePackages =  = "com.cydeo")  either this way or the one below3
@ComponentScan(basePackages = {"com.cydeo.proxy", "com.cydeo.service", "com.cydeo.repository"} )
public class ProjectConfig {

}
