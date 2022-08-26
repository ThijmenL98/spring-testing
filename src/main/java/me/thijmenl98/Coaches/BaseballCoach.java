package me.thijmenl98.Coaches;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: BaseballCoach</h5>
 * <h5>Package: me.thijmenl98.Coaches.BaseballCoach</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-26
 **/
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

}
