package me.thijmenl98.coaches;

import org.springframework.stereotype.Component;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: GolfCoach</h5>
 * <h5>Package: me.thijmenl98.coaches</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
@Component
public class GolfCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice on driving range";
    }

}
