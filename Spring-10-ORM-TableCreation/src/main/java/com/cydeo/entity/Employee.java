package com.cydeo.entity;

import javax.persistence.*;



    @Entity
    public class Employee {  //employee

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        private String name;

    }




