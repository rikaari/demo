package com.work.controllers;

import com.work.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class authController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public ModelAndView getLogin(){
        ModelAndView loginPage = new ModelAndView("login");
        System.out.println("Logging In");
        loginPage.addObject("PageTitle","login");
        return loginPage;
    }

    @PostMapping("/login")
    public String login(@RequestParam("name") String name,
                        @RequestParam("password") String password,
                        Model model){

        //TODO:Validate form data.
        if(name.isEmpty() || name == null || password.isEmpty() || password==null ){
            model.addAttribute("error", "Fields Cannot BeEmpty");
            return "login";
        }

        //TODO:Check if name exists.
        String nameInDb = userRepository.getUserName(name);
        if (nameInDb != null && !nameInDb.isEmpty()) {
            String passwordInDb = userRepository.getUserPassword(nameInDb);

            if (!BCrypt.checkpw(password, passwordInDb)) {
                model.addAttribute("error", "Incorrect Password");
                return "login";
            } else {
                model.addAttribute("success", "Login Successful");
                return "dashboard";
            }
        } else {
            model.addAttribute("error", "Username not found"); // Updated error message
            return "login";
        }


    }
}
