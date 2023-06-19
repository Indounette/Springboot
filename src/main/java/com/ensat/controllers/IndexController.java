package com.ensat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Homepage controller.
 */
@Controller
public class IndexController {

    @GetMapping("/home")
    ModelAndView index() {
        return new ModelAndView("index");
    }

}
