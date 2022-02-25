package com.cydeo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
//@ComponentScan(basePackages = "com.cydeo")
@ComponentScan(basePackages = {"com.cydeo.proxy","com.cydeo.service","com.cydeo.repository"})
public class ProjectConfig {
}
