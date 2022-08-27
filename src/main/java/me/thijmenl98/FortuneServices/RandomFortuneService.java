package me.thijmenl98.FortuneServices;

import java.util.concurrent.ThreadLocalRandom;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: RandomFortuneService</h5>
 * <h5>Package: me.thijmenl98.FortuneServices</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
public class RandomFortuneService implements FortuneService {

    private final String[] fortunes = {
            "Your shoes will make you happy today.",
            "If winter comes, can spring be far behind?",
            "A short stranger will soon enter your life with blessings to share.",
            "Our deeds determine us, as much as we determine our deeds.",
            "The greatest love is self-love."
    };

    @Override
    public String getFortune() {
        return fortunes[ThreadLocalRandom.current().nextInt(fortunes.length)];
    }
}
