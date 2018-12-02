package com.sp.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
public class HibernateConnectionConfig {

    public static SessionFactory connectToDB(Class<?> tClass){

        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(tClass).
                buildSessionFactory();

        return factory;

    }

}
