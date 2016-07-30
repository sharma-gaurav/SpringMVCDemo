package com.spring.demo.controller;


import com.spring.demo.co.StudentCO;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RequestMapping("/student")
@Controller
public class StudentController {

    @InitBinder
    void init(DataBinder dataBinder) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
        dataBinder.registerCustomEditor(Date.class, "dateOfBirth", new CustomDateEditor(simpleDateFormat, true));
    }

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
    ModelAndView save(@ModelAttribute("student") StudentCO studentCO, BindingResult bindingResult) {
        ModelAndView modelAndView;
        if (bindingResult.hasErrors()) {
            modelAndView = new ModelAndView("student/create");
        } else {
            modelAndView = new ModelAndView("student/show");
        }
        return modelAndView;
    }

    @ModelAttribute
    void commonProperties(Model model) {
        model.addAttribute("heading", "Welcome to Spring MVC!");
    }
}
