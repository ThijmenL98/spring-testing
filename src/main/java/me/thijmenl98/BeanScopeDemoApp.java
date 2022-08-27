package me.thijmenl98;

import me.thijmenl98.Coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: BeanScopeDemoApp</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
public class BeanScopeDemoApp {

    public static void main(String[] args) {
        // Load the spring configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = applicationContext.getBean("myCoach", Coach.class);

        Coach alphaCoach = applicationContext.getBean("myCoach", Coach.class);

        // Check if they are the same
        boolean result = (theCoach == alphaCoach);

        // Print out results
        System.out.println("\nAre similar?: " + result);
        System.out.println("Memory locations: " + theCoach + " and " + alphaCoach);

        // Close the context
        applicationContext.close();
    }

}
