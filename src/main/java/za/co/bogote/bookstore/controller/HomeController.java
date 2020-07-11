package za.co.bogote.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import za.co.bogote.bookstore.domain.security.PasswordResetToken;

import java.util.Locale;

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
    public String forgotPassword(
            Locale locale,
            @RequestParam("token") String token,
            Model model) {
        PasswordResetToken passwordResetToken = userServive.getPasswordResetToken(token);

        model.addAttribute("classActiveForgotPassword", true);
        return "myAccount";
    }

    @RequestMapping("/newUser")
    public String newUser(Model model){
        model.addAttribute("classActiveNewUser", true);
        return "myAccount";
    }

}
