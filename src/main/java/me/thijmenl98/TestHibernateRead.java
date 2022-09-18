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
public class TestHibernateRead {

    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            System.out.println("Creating new Student object");
            Student student = new Student("Daffy", "Duck", "daffy_duck@gmail.com");

            session.beginTransaction();

            System.out.println("Saving student");
            System.out.println(student);
            session.save(student);

            session.getTransaction().commit();
            System.out.println("Saved student with ID: " + student.getId());

            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Getting student with ID: " + student.getId());
            Student retrievedStudent = session.get(Student.class, student.getId());

            System.out.println("Get complete: " + retrievedStudent);

            session.getTransaction().commit();

            System.out.println("Done");
        }

    }

}
