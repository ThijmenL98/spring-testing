package me.thijmenl98;

import me.thijmenl98.coaches.Coach;
import me.thijmenl98.configurations.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: ConfigDemoApp</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
public class ConfigDemoApp {

    public static void main(String[] args) {
        // Read Spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get bean from Spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        // Call method on bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        // Close context
        context.close();
    }

}
