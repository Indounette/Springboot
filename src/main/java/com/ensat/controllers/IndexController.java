package com.ensat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Homepage controller.
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    ModelAndView index() {
        return new ModelAndView("index");
    }
    @GetMapping("home")
    public String getHome(){
        return "home";
    }

}
