package za.co.bogote.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import za.co.bogote.bookstore.domain.security.PasswordResetToken;
import za.co.bogote.bookstore.service.UserService;

import java.util.Locale;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

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
    public String forgotPassword(Model model) {
        model.addAttribute("classActiveForgotPassword", true);
        return "myAccount";
    }

    @RequestMapping("/newUser")
    public String newUser(
            Locale locale,
            @RequestParam("token") String token,
            Model model) {

        PasswordResetToken passwordResetToken = userService.getPasswordResetToken(token);

        model.addAttribute("classActiveNewUser", true);
        return "myAccount";
    }

}
