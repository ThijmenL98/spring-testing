package me.thijmenl98.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: HelloWorldController</h5>
 * <h5>Package: me.thijmenl98.controllers</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-29
 **/
@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloWorld/form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloWorld/process";
    }


}
