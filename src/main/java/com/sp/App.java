package com.sp;

import com.sp.dao.EmployeeDAOBeanImpl;
import com.sp.models.Employee;

public class App {

    public static void main(String[] args) {

        System.out.println("Setting employee");

        Employee employee = new Employee();
        employee.setName("Sławek");
        employee.setLastName("Paciorek");
        employee.setSalary(5500.00);
        employee.setEmail("sp@gmail.com");

        System.out.println("Creating instance of EmployeeDAOBeanImpl");

        EmployeeDAOBeanImpl employeeDAOBean = new EmployeeDAOBeanImpl();

        System.out.println("Saving employee to DB");

        employeeDAOBean.createEmployeeInDataBase(employee);

        System.out.println("Success!");



    }

}
