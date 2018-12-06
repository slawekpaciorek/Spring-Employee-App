package com.sp.controllers;

import com.sp.dao.EmployeeDAOBean;
import com.sp.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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

        System.out.println("Launch searching employee module");
        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "find-employee";
    }

    @RequestMapping("/employee-card")
    public String showEmployee(
            @ModelAttribute("employee") Employee employee,
            Model model){

        System.out.println("Searching modul - result");
        Employee searchingEmployee = null;
        int id = employee.getId();
        String email = employee.getEmail();

        if(id > 0 && email==null)
            searchingEmployee = employeeDAOBean.getEmployeeFromDataBase(id);

        if(email!=null)
            searchingEmployee = employeeDAOBean.getEmployeeFromDataBase(email);

        if(searchingEmployee == null) {
            String message = "Ther is no such an employee";
            model.addAttribute("message", message);
        }
        else
            model.addAttribute("searchingEmployee", searchingEmployee);

        return "employee-card";
    }

    @RequestMapping("/employee-delete-confirmation")
    public String deleteEmployee(HttpServletRequest request, Model model){

        int id = Integer.valueOf(request.getParameter("id"));


        Employee employee = employeeDAOBean.getEmployeeFromDataBase(id);
        model.addAttribute("model", employee);

        employeeDAOBean.deleteEmployeeFromDataBase(id);


        return "employee-delete-confirmation";

    }
    @RequestMapping("/employee-modification-form")
    public String modifyEmployee(Model model, HttpServletRequest request,HttpSession session){

        int id = Integer.valueOf(request.getParameter("id"));

        session.setAttribute("id", id);

        Employee employee = employeeDAOBean.getEmployeeFromDataBase(id);

        model.addAttribute("employee", employee);

        return "employee-modification-form";
    }

    @RequestMapping("/employee-modification-confirm")
    public String modifyEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult, Model model, HttpSession session){

        if(bindingResult.hasErrors())
            return "employee-modification-form";

        model.addAttribute("newEmployee", employee);

        int id = Integer.valueOf((Integer) session.getAttribute("id"));

        employee.setId(id);

        employeeDAOBean.updateEmployeeInDataBase(employee);

        return "employee-modification confirm";

    }


}
