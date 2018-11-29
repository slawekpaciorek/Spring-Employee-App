package com.sp.controllers;

import com.sp.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

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

    @RequestMapping("/employee-confirm")
    public String confirmEmployee(
            @Valid @ModelAttribute("employee") Employee employee,
            BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "add-employee";
        }
        else {
            System.out.println("Confirmation page");
            return "confirmation";
        }
    }


}
