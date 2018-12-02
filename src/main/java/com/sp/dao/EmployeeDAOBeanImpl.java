package com.sp.dao;

import com.sp.models.Employee;
import com.sp.utils.HibernateConnectionConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDAOBeanImpl implements EmployeeDAOBean {

    private Session session = HibernateConnectionConfig.connectToDB(Employee.class).getCurrentSession();

    private SessionFactory sessionFactory = session.getSessionFactory();

    private void setNewSession(){
        session = HibernateConnectionConfig.connectToDB(Employee.class).openSession();
    }

    @Override
    public void createEmployeeInDataBase(Employee employee) {

        if(sessionFactory.isClosed()){
            setNewSession();
        }

        try{
            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();

        }finally {
            sessionFactory.close();
        }


    }

    @Override
    public List<Employee> getEmployees() {

        if(sessionFactory.isClosed())
            setNewSession();

        try{
            session.beginTransaction();

            return session.createQuery("from Employee ").getResultList();
        }finally {
            sessionFactory.close();
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
