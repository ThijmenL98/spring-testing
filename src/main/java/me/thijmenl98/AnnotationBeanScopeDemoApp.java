package me.thijmenl98;

import me.thijmenl98.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: AnnotationBeanScopeDemoApp</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        // Load Config file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from Spring container
        Coach theCoach = applicationContext.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = applicationContext.getBean("tennisCoach", Coach.class);

        // Check and print if they are the same
        System.out.println(theCoach == alphaCoach);
        System.out.println("Memory locations: " + theCoach + " & " + alphaCoach);

        // Close context
        applicationContext.close();
    }

}
