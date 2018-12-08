package com.sp;

import com.sp.dao.EmployeeDAOBeanImpl;
import com.sp.models.Agreement;
import com.sp.models.Document;
import com.sp.models.Employee;
import com.sp.utils.AgreementType;
import com.sp.utils.DocumentState;
import com.sp.utils.HibernateConnectionConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateConnectionConfig.connectToDB(Agreement.class);

        Session session = sessionFactory.getCurrentSession();

        try{
            session.beginTransaction();

            LocalDate localDate = LocalDate.now();
            DocumentState state = DocumentState.SUSPEND;
            AgreementType type = AgreementType.B2B;
            String description = "You will be responsible for developing web app with business logic";
            String role = "junior java developer";
            int length = 3;

            Agreement agreement = new Agreement(localDate, state, type, description, role, length);

            session.save(agreement);

            session.getTransaction().commit();

        }finally {
            sessionFactory.close();
        }
    }

}
