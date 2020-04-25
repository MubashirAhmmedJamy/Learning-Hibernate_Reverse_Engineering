package dao;

import entity.Employee;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/*
- Create the table in database schema
- Create a web application using hibernate framework. It will require 
you choose the dabase connection and when the project creation is finished 
you'll have a hibernate.cfg.xml file in default package. It will contain
session-factory configuration.

- Create a hibernate.reveng.xml file in default package. You'll have to
choose the tables while creating this file.

- Create 2 packages named dao & entity

- Create a hibernate pojo file in the entity class. This will create a java class

- Create a hibernate utility class in the dao package

- Create a class with a main function to run hibernate crud operations
*/

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        
        emp.setJoiningDate(new Date());
        emp.setName("John Cena");
        emp.setSalary(10);
        
        SessionFactory sessionFactory = Utility.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("everything closed");
    }
}
