package com.sp.controllers;

import com.sp.dao.EmployeeDAOBean;
import com.sp.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/db")
public class DatabaseController {

    @Autowired
    EmployeeDAOBean employeeDAOBean;

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
            BindingResult bindingResult,
            HttpSession httpSession){

        if(bindingResult.hasErrors()){
            return "add-form";
        }
        else {
            System.out.println("Confirmation page");
            Employee sessionEmployee = employee;
            httpSession.setAttribute("sessionEmployee",sessionEmployee);
            return "confirmation";
        }
    }

    @RequestMapping("/confirmation-success")
    public String insertEmployee(HttpSession httpSession, Model model){

        Employee employee = (Employee) httpSession.getAttribute("sessionEmployee");
        model.addAttribute("sessionEmployee", employee);

        employeeDAOBean.createEmployeeInDataBase(employee);

        return "confirmation-success";
    }

    @RequestMapping("/employment-database")
    public String databaseView(Model model){

        List<Employee> employees = employeeDAOBean.getEmployees();
        model.addAttribute("employees", employees);

        return "database-view";

    }

    @RequestMapping("/find-employee")
    public String findEmployee(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "find-employee";
    }

    @RequestMapping("/employee-card")
    public String showEmployee(
            @Valid @ModelAttribute("employee") Employee employee,
            BindingResult bindingResult,
            Model model){

        Employee searchingEmployee = null;
//
//        if(bindingResult.hasErrors())
//            return "find-employee";

        int id = employee.getId();
        String email = employee.getEmail();

        if(id > 0 && email==null)
            searchingEmployee = employeeDAOBean.getEmployeeFromDataBase(id);

        if(email!=null)
            searchingEmployee = employeeDAOBean.getEmployeeFromDataBase(email);

        model.addAttribute("searchingEmployee", searchingEmployee);
        return "employee-card";
    }


}
