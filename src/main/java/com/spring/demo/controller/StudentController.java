package com.spring.demo.controller;


import com.spring.demo.co.StudentCO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RequestMapping("/student")
@Controller
public class StudentController {

    @RequestMapping("/")
    ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping("/sayHello")
    @ResponseBody
    String sayHello() {
        return "Hello World";
    }

    @RequestMapping("/greet")
    ModelAndView greet() {
        ModelAndView modelAndView = new ModelAndView("greet");
        modelAndView.addObject("greeting", "Hello World");
        return modelAndView;
    }

    @RequestMapping("/create")
    ModelAndView create() {
        return new ModelAndView("student/create");
    }

    @RequestMapping(value = "/save")
    ModelAndView save(StudentCO studentCO) {
        ModelAndView modelAndView = new ModelAndView("student/show");
        modelAndView.addObject("name", studentCO.getFirstName() + " " + studentCO.getLastName());
        return modelAndView;
    }
}
