package me.thijmenl98;

import me.thijmenl98.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: AnnotationDemoApp</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
public class AnnotationDemoApp {

    public static void main(String[] args) {
        // Read Spring config file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get bean from Spring container
        Coach tennisCoach = applicationContext.getBean("tennisCoach", Coach.class);
        Coach golfCoach = applicationContext.getBean("golfCoach", Coach.class);

        // Call method on bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(golfCoach.getDailyWorkout());

        // Close context
        applicationContext.close();
    }

}
