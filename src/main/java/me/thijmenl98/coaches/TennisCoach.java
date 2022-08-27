package me.thijmenl98.coaches;

import me.thijmenl98.services.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: TennisCoach</h5>
 * <h5>Package: me.thijmenl98.coaches</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
@Component
@Scope("singleton")
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach() {
    }

    @PostConstruct
    public void init() {
        System.out.println("[" + this.getClass().getSimpleName() + "] initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[" + this.getClass().getSimpleName() + "] destroyed");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    @Autowired
    @Qualifier("randomFortuneService")
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
