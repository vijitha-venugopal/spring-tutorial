package org.o7planning.tutorial.springmvctiles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
    public String homePage(Model model) {
        model.addAttribute("login");
        return "homePage";
    }

    @RequestMapping(value = { "/userpage" }, method = RequestMethod.POST)
    public String contactusPage(User user,Model model,Model model1) {
            model.addAttribute("userName", user.getUserName());
            model1.addAttribute("userDob", user.getUserDob());
        return "contactusPage";
    }
}
