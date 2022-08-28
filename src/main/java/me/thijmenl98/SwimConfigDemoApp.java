package me.thijmenl98;

import me.thijmenl98.coaches.BasketballCoach;
import me.thijmenl98.coaches.SwimCoach;
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
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
        BasketballCoach basketballCoach = context.getBean("basketballCoach", BasketballCoach.class);

        // Call method on bean
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());
        System.out.println("Details: " +  swimCoach.getEmail() + " from " + swimCoach.getTeam());

        System.out.println("");

        System.out.println(basketballCoach.getDailyWorkout());
        System.out.println(basketballCoach.getDailyFortune());

        // Close context
        context.close();
    }

}
