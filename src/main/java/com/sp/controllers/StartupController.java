package com.sp.controllers;

import com.sp.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StartupController {

    @RequestMapping("/")
    public String showIndex(){
        System.out.println("Launch frontpage");
        return "index";
    }

    @RequestMapping("/add-employee")
    public String addForm(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee", employee );

        System.out.println("Launch add form employee");
        return "add-form";
    }

}
