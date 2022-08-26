package me.thijmenl98;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: TrackCoach</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-26
 **/
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
