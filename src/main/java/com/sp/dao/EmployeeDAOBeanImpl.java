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
    public void updateEmployeeInDataBase(Employee employee) {

        if(sessionFactory.isClosed())
            setNewSession();

        try{

            session.beginTransaction();

            session.update(employee);

            session.getTransaction().commit();

        }
        finally {
            sessionFactory.close();
        }

    }


    @Override
    public Employee getEmployeeFromDataBase(int employeeId) {

        if(sessionFactory.isClosed())
            setNewSession();

        try {
            session.beginTransaction();

            return session.get(Employee.class, employeeId);
        }
        finally {
            sessionFactory.close();
        }
    }

    @Override
    public Employee getEmployeeFromDataBase(String email) {

        if(sessionFactory.isClosed())
            setNewSession();

        try {
            session.beginTransaction();

            List<Employee> list = session.createQuery("from Employee ").getResultList();

            Employee employee = null;
            boolean isPresent = list.stream().anyMatch(employee1 -> employee1.getEmail().equals(email));

            if(isPresent==true)
                employee = list.stream().filter(x->x.getEmail().equals(email)).findAny().get();
            return employee;
        }
        finally {
            sessionFactory.close();
        }
    }

    @Override
    public void deleteEmployeeFromDataBase(int employeeId) {

        Employee employee = getEmployeeFromDataBase(employeeId);

        if(sessionFactory.isClosed())
            setNewSession();

        try{
            session.beginTransaction();

            session.delete(employee);

            session.getTransaction().commit();
        }finally {
            sessionFactory.close();
        }

    }

}
