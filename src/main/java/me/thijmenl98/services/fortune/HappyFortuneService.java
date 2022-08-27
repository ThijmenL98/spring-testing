package me.thijmenl98.services.fortune;

import org.springframework.stereotype.Component;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: HappyFortuneService</h5>
 * <h5>Package: me.thijmenl98.services.fortune</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "Today will be your lucky day!";
    }

}
