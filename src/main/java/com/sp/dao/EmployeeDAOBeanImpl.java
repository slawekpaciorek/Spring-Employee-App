package com.sp.dao;

import com.sp.models.Employee;
import com.sp.utils.HibernateConnectionConfig;
import org.hibernate.Session;

public class EmployeeDAOBeanImpl implements EmployeeDAOBean {

    private Session session = HibernateConnectionConfig.connectToDB(Employee.class);

    @Override
    public void createEmployeeInDataBase(Employee employee) {

        try{
            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();

        }finally {
            session.getSessionFactory().close();
        }


    }

    @Override
    public void updateEmployeeInDataBase(int employeeId) {

    }

    @Override
    public void updateEmployeeInDataBase(String email) {

    }

    @Override
    public Employee getEmployeeFromDataBase(int employeeId) {
        return null;
    }

    @Override
    public Employee getEmployeeFromDataBase(String email) {
        return null;
    }

    @Override
    public void deleteEmployeeFromDataBase(int employeeId) {

    }

    @Override
    public void deleteEmployeeFromDataBase(String email) {

    }
}
