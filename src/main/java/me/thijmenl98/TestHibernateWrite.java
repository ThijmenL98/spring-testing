package me.thijmenl98;

import me.thijmenl98.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: TestHibernate</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-09-17
 **/
public class TestHibernateWrite {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            System.out.println("Creating new Student object");
            Student student = new Student("Paul", "Walker", "paul_walker@gmail.com");

            session.beginTransaction();

            System.out.println("Saving student");
            session.save(student);

            session.getTransaction().commit();

            System.out.println("Done");
        } finally {
            factory.close();
        }

    }

}
