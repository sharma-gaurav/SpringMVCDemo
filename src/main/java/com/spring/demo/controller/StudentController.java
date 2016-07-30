package com.spring.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/student")
@Controller
public class StudentController {

    @RequestMapping("/")
    ModelAndView index() {
        return new ModelAndView("index");
    }
}
