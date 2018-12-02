package com.sp.dao;

import com.sp.models.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeDAOBean {

    public void createEmployeeInDataBase(Employee employee);

    public List<Employee> getEmployees();

    public void updateEmployeeInDataBase(int employeeId);

    public Employee getEmployeeFromDataBase(int employeeId);

    public Employee getEmployeeFromDataBase(String email);

    public void deleteEmployeeFromDataBase(int employeeId);

}
