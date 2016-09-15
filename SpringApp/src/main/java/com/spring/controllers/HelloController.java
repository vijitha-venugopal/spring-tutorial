package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by vijitha on 14/09/16.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginPage(ModelMap model) {
        model.addAttribute("login");
        return "login";
    }
    @RequestMapping(value = "/home",method = RequestMethod.POST)
    public String homePage(User user,Model model,Model model1){
        model.addAttribute("userName", user.getUserName());
        model1.addAttribute("userDob", user.getUserDob());
        return "user";
    }

}

