package me.thijmenl98;

import me.thijmenl98.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: TestHibernate</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-09-17
 **/
public class TestHibernateQuerying {

    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Querying all Students");
            TypedQuery<Student> query = session.createQuery("from Student", Student.class);
            List<Student> studentList = query.getResultList();

            for (Student s : studentList) {
                System.out.println(s);
            }

            session.getTransaction().commit();
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("\nCreating new Student object");
            Student student = new Student("Nik", "Tesla", "n_tesla@gmail.com");

            System.out.println("Saving student");
            System.out.println(student);
            session.save(student);

            session.getTransaction().commit();
            System.out.println("Saved student with ID: " + student.getId());

            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("\nQuerying all GMail Students that underscore their name");
            query = session.createQuery("from Student s where s.email like '%_%@gmail.com'", Student.class);
            studentList = query.getResultList();

            for (Student s : studentList) {
                System.out.println(s);
            }

            session.getTransaction().commit();
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("\nUpdating first name of student with ID: " + student.getId());
            Student updatedStudent = session.get(Student.class, student.getId());
            updatedStudent.setFirstName("Nikola");

            session.getTransaction().commit();
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("\nQuerying all Students");
            query = session.createQuery("from Student", Student.class);
            studentList = query.getResultList();

            for (Student s : studentList) {
                System.out.println(s);
            }

            session.getTransaction().commit();
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("\nDeleting student with ID: " + student.getId());
            session.delete(updatedStudent);

            session.getTransaction().commit();
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("\nQuerying all Students");
            query = session.createQuery("from Student", Student.class);
            studentList = query.getResultList();

            for (Student s : studentList) {
                System.out.println(s);
            }

            session.getTransaction().commit();
            System.out.println("Done");
        }

    }

}
