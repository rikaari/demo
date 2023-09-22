package com.work.controllerAdvisor;


import com.work.models.Login;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class loginAdvisor {

    @ModelAttribute("LoginUSer")
    public Login getLoginDefaults(){
        return new Login();
    }
}
