package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vijitha on 14/09/16.
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/hai",method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("hello");
        return "hello";
    }
}
