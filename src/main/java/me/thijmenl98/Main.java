package me.thijmenl98;

import me.thijmenl98.model.Instructor;
import me.thijmenl98.model.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: Main</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-09-20
 **/
public class Main {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            int idToUse = 156;

            session.beginTransaction();
            InstructorDetail detail = session.get(InstructorDetail.class, idToUse);
            Instructor instructor = detail.getParentInstructor();

            System.out.println("Fetched " + instructor);

            session.getTransaction().commit();
            System.out.println("Done");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }

    }
}
