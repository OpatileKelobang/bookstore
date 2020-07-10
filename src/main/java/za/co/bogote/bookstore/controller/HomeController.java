package za.co.bogote.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("classActiveLogin", true);
        return "myAccount";
    }

    @RequestMapping("/forgotPassword")
    public String forgotPassword(Model model){
        model.addAttribute("classActiveForgotPassword", true);
        return "myAccount";
    }

    @RequestMapping("/newUser")
    public String newUser(Model model){
        model.addAttribute("classActiveNewUser", true);
        return "myAccount";
    }

}
