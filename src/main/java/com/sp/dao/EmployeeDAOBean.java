package com.sp.dao;

import com.sp.models.Employee;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeDAOBean {

    public void createEmployeeInDataBase(Employee employee);

    public void updateEmployeeInDataBase(int employeeId);

    public void updateEmployeeInDataBase(String email);

    public Employee getEmployeeFromDataBase(int employeeId);

    public Employee getEmployeeFromDataBase(String email);

    public void deleteEmployeeFromDataBase(int employeeId);

    public void deleteEmployeeFromDataBase(String email);

}
