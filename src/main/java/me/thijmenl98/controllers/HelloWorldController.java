package me.thijmenl98.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/shoutFormResult")
    public String shout(@RequestParam("studentName") String name, Model model) {
        String message = "Hello, " + name + "!";

        model.addAttribute("introduction", message);

        return "helloWorld/process";
    }

}
