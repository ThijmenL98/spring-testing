package me.thijmenl98.controllers;

import me.thijmenl98.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h3>Project: spring-bc</h3>
 * <h5>File: StudentController</h5>
 * <h5>Package: me.thijmenl98.controllers</h5>
 *
 * @author Thijmen Langendam
 * @date 2022-08-29
 **/
@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);

        return "student/form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {
        System.out.println("New student Registered: " + student.getFirstName() + " " + student.getLastName());
        return "student/confirmation";
    }

}
