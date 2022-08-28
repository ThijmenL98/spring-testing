package me.thijmenl98;

import me.thijmenl98.coaches.Coach;
import me.thijmenl98.configurations.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: SwimConfigDemoApp</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-28
 **/
public class SwimConfigDemoApp {

    public static void main(String[] args) {
        // Read Spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get bean from Spring container
        Coach swimCoach = context.getBean("swimCoach", Coach.class);

        // Call method on bean
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());

        // Close context
        context.close();
    }

}
