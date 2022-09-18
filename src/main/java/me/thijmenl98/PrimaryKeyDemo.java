package me.thijmenl98;

import me.thijmenl98.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: PrimaryKeyDemo</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-09-17
 **/
public class PrimaryKeyDemo {

    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            System.out.println("Creating new Student object");
            Student student1 = new Student("Paul", "Walker", "paul_walker@gmail.com");
            Student student2 = new Student("John", "Doe", "john_doe@gmail.com");
            Student student3 = new Student("Mary", "Public", "mary_public@gmail.com");
            Student student4 = new Student("Joe", "Apple", "joe_apple@gmail.com");

            session.beginTransaction();

            System.out.println("Saving students");
            session.save(student1);
            session.save(student2);
            session.save(student3);
            session.save(student4);

            session.getTransaction().commit();

            System.out.println("Done");
        }

    }

}
