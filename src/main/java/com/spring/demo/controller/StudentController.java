package com.spring.demo.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentController extends MultiActionController {
    public ModelAndView action1(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("index");
    }

    public void action2(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html");
        response.getWriter().write("This is html content");
    }
}
