package me.thijmenl98;

import me.thijmenl98.Coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: MySpringApp</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-26
 **/
public class MySpringApp {

    public static void main(String[] args) {
        // Load Spring Config File
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve Bean from Spring Container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // Call Methods on Bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Close Context
        context.close();
    }

}
