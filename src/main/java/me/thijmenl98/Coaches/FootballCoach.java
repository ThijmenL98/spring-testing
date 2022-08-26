package me.thijmenl98.Coaches;

import me.thijmenl98.FortuneServices.FortuneService;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: FootballCoach</h5>
 * <h5>Package: me.thijmenl98.Coaches</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-26
 **/
public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach() {}
    public FootballCoach(FortuneService fService) {
        this.fortuneService = fService;
    }

    @Override
    public String getDailyWorkout() {
        return "Shoot 50 balls";
    }

    @Override
    public String getDailyFortune() {
        return "[FC]: " + fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
