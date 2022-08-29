package me.thijmenl98.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: SillyController</h5>
 * <h5>Package: me.thijmenl98.controllers</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-29
 **/
@Controller
@RequestMapping("/hello")
public class SillyController {

    @RequestMapping("/showForm")
    public String displayForm() {
        return "helloWorld/form";
    }

}
