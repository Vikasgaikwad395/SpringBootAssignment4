package com.vikas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOperationController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/offers")
    public  String showOffers(){
        return  "offer";
    }

    @GetMapping("/balance")
    public  String showBalance(){
        return "show_balance";
    }
    @GetMapping("/loanApprove")
    public String approvalLoan(){
        return "Loan";
    }
    @GetMapping("/denied")
    public String accessDenied(){
        return "Access_Denied";
    }
    @GetMapping("/about")
    public String showAbout(){
        return "about";
    }
}
