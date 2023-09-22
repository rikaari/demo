package com.work.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {

    @GetMapping("/")
    public ModelAndView getIndex(){
        ModelAndView getPage = new ModelAndView();
        getPage.setViewName("index"); // Assuming "index" is the name of your JSP file
        getPage.addObject("PageTitle", "Home");
        System.out.println("Is Working");
        return getPage;
    }

    @GetMapping("/deposit")
    public ModelAndView getDeposit(){
        ModelAndView deposit = new ModelAndView();
        deposit.setViewName("deposit"); // Assuming "deposit" is the name of your JSP file
        deposit.addObject("PageTitle", "Home");
        System.out.println("Depositing");
        return deposit;
    }

    @GetMapping("/withdraw")
    public ModelAndView getWithdraw(){
        ModelAndView withdraw = new ModelAndView();
        withdraw.setViewName("withdraw"); // Assuming "withdraw" is the name of your JSP file
        withdraw.addObject("PageTitle", "Home");
        System.out.println("Withdrawing");
        return withdraw;
    }

    @GetMapping("/transfer")
    public ModelAndView getTransfer(){
        ModelAndView transfer = new ModelAndView();
        transfer.setViewName("transfer"); // Assuming "withdraw" is the name of your JSP file
        transfer.addObject("PageTitle", "Home");
        System.out.println("Transferring");
        return transfer;
    }

    @GetMapping("/payment")
    public ModelAndView getPayment(){
        ModelAndView payment = new ModelAndView();
        payment.setViewName("transfer"); // Assuming "withdraw" is the name of your JSP file
        payment.addObject("PageTitle", "Home");
        System.out.println("Transferring");
        return payment;
    }



}
