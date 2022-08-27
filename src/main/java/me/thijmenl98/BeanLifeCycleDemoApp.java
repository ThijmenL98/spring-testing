package me.thijmenl98;

import me.thijmenl98.Coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: BeanScopeDemoApp</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-27
 **/
public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {
        // Load the spring configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = applicationContext.getBean("myCoach", Coach.class);

        // Close the context
        applicationContext.close();
    }

}
