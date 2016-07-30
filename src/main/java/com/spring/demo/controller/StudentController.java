package com.spring.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/save/{firstName}/{lastName}")
    ModelAndView save(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
        ModelAndView modelAndView = new ModelAndView("student/show");
        modelAndView.addObject("name", firstName + " " + lastName);
        return modelAndView;
    }
}
