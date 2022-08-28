package me.thijmenl98.configurations;

import me.thijmenl98.coaches.BasketballCoach;
import me.thijmenl98.coaches.Coach;
import me.thijmenl98.coaches.SwimCoach;
import me.thijmenl98.services.fortune.FortuneService;
import me.thijmenl98.services.fortune.RandomFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: SportConfig</h5>
 * <h5>Package: me.thijmenl98.configurations</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService randomFortuneService() {
        return new RandomFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(randomFortuneService());
    }

    @Bean
    public Coach basketballCoach() {
        return new BasketballCoach(randomFortuneService());
    }

}
