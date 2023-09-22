package com.work.controllerAdvisor;

import com.work.models.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class advisorController {

    @ModelAttribute("signupUser")
    public User getUserDefaults(){
        return new User();
    }

}
