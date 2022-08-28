package me.thijmenl98.coaches;

import me.thijmenl98.services.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: SwimCoach</h5>
 * <h5>Package: me.thijmenl98.coaches</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-28
 **/
@Component
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach() {}

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    public void init() {
        System.out.println("[" + this.getClass().getSimpleName() + "] initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[" + this.getClass().getSimpleName() + "] destroyed");
    }

    @Autowired
    @Qualifier("randomFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "[" + this.getClass().getSimpleName() + "]: Swim 10 lanes";
    }

    @Override
    public String getDailyFortune() {
        return "[" + this.getClass().getSimpleName() + "]: " + fortuneService.getDailyFortune();
    }

}
