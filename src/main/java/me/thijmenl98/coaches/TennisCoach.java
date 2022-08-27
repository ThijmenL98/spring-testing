package me.thijmenl98.coaches;

import me.thijmenl98.services.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: TennisCoach</h5>
 * <h5>Package: me.thijmenl98.coaches</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach() {
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "[" + this.getClass().getSimpleName() + "]: " + "Hit 100 balls";
    }

    @Override
    public String getDailyFortune() {
        return "[" + this.getClass().getSimpleName() + "]: " + fortuneService.getDailyFortune();
    }

}
