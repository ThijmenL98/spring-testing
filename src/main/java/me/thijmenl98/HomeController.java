package me.thijmenl98;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: HomeController</h5>
 * <h5>Package: me.thijmenl98</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-29
 **/
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String showMyPage() {
        return "main-menu";
    }

}
