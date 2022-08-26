package me.thijmenl98.FortuneServices;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: HappyFortuneService</h5>
 * <h5>Package: me.thijmenl98.FortuneServices</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-26
 **/
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "You will score a point today!";
    }

}
