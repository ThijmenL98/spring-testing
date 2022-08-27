package me.thijmenl98.services.fortune;

import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: RandomFortuneService</h5>
 * <h5>Package: me.thijmenl98.services.fortune</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
@Component
public class RandomFortuneService implements FortuneService {

    private final String[] fortunes = {
            "Don’t hold onto things that require a tight grip.",
            "Look how far you've come.",
            "Turn your wounds into wisdom.",
            "You are your best thing.",
            "There is always something left to love.",
            "Stay hungry. Stay foolish.",
            "Try and fail, but never fail to try.",
            "Get busy living or get busy dying.",
            "Kid, you'll move mountains.",
            "Be bold, be courageous, be your best.",
            "Wishes are granted in a mother's heart."
    };

    @Override
    public String getDailyFortune() {
        return fortunes[ThreadLocalRandom.current().nextInt(fortunes.length)];
    }

}
