package me.thijmenl98.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: CustomerController</h5>
 * <h5>Package: me.thijmenl98.controller</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-09-28
 **/
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/list")
    public String getCustomerList(Model model) {


        return "list-customers";
    }

}
