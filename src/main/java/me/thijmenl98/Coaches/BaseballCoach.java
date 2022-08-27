package me.thijmenl98.Coaches;

import me.thijmenl98.FortuneServices.FortuneService;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: BaseballCoach</h5>
 * <h5>Package: me.thijmenl98.Coaches</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-26
 **/
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress, team;

    public BaseballCoach() {
    }

    public BaseballCoach(FortuneService fService) {
        this.fortuneService = fService;
    }

    public void init() {
        System.out.println("Initializing " + this.getClass().getSimpleName());
    }

    public void destroy() {
        System.out.println("Destroying " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return "[" + this.getClass().getSimpleName() + "]: " + fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
