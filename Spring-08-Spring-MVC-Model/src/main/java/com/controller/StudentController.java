package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homepage(Model model){ // method parameter.
        model.addAttribute("name", "Cydeo"); // takes two parameters
        model.addAttribute("course", "MVC");

        return "student/welcome" ;
    }
}
