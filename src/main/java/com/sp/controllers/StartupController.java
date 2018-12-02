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




}
