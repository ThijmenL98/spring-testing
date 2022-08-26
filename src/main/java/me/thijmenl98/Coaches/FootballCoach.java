package me.thijmenl98.Coaches;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: FootballCoach</h5>
 * <h5>Package: me.thijmenl98.Coaches</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-26
 **/
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Shoot 50 balls";
    }

}
