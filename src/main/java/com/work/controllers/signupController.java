package com.work.controllers;

import com.work.models.User;
import com.work.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class signupController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/signup")
    public ModelAndView getSignup(){
        ModelAndView signupPage = new ModelAndView("signup");
        System.out.println("Signing Up");
        signupPage.addObject("PageTitle","signup");
        return signupPage;
    }

    @PostMapping("/signup")
    public ModelAndView signup(@Valid @ModelAttribute("signupUser") User user, BindingResult result, @RequestParam("name") String name,
                               @RequestParam("password") String password, @RequestParam("confirm_password") String confirm_password){
        ModelAndView signup = new ModelAndView("signup");

        if(confirm_password.isEmpty() && result.hasErrors()){
            signup.addObject("confirm","Required");
            return signup;
        }

        //TODO: Check Password Match
        if (!password.equals(confirm_password)){
            signup.addObject("passwordMismatch","Enter Similar Passwords");
            return signup;
        }

        //TODO: Hash Password
        String hash_password = BCrypt.hashpw(password, BCrypt.gensalt());

        //TODO: Register User
        userRepository.signupUser(name,hash_password);

        //TODO: Successful Signup
        // Redirect to the login page on successful signup
        ModelAndView login = new ModelAndView("login");
        String successMessage = "Signup Complete. You can now log in.";
        login.addObject("success", successMessage);

        return login;

    }
}


