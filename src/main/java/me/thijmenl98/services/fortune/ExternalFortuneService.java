package me.thijmenl98.services.fortune;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: ExternalFortuneService</h5>
 * <h5>Package: me.thijmenl98.services.fortune</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
@Component
public class ExternalFortuneService implements FortuneService{

    @Value("${fortunes.list}")
    private String[] fortunes;

    @Override
    public String getDailyFortune() {
        return fortunes[ThreadLocalRandom.current().nextInt(fortunes.length)];
    }

}
