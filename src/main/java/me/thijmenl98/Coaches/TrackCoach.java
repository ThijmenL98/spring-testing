package me.thijmenl98.Coaches;

import me.thijmenl98.FortuneServices.FortuneService;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: TrackCoach</h5>
 * <h5>Package: me.thijmenl98.Coaches</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-26
 **/
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {}
    public TrackCoach(FortuneService fService) {
        this.fortuneService = fService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "[TC]: " + fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
