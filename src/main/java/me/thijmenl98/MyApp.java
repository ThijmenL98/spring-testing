package me.thijmenl98;

import me.thijmenl98.Coaches.BaseballCoach;
import me.thijmenl98.Coaches.Coach;
import me.thijmenl98.Coaches.TrackCoach;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: MyApp</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-26
 **/
public class MyApp {

    public static void main(String[] args) {
        // Create the object
        Coach bCoach = new BaseballCoach();
        Coach tCoach = new TrackCoach();

        // Use the object
        System.out.println(bCoach.getDailyWorkout());
        System.out.println(tCoach.getDailyWorkout());
    }

}
