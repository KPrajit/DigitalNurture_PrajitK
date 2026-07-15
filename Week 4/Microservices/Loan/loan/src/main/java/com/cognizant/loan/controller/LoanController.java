package com.cognizant.loan.controller;
import com.cognizant.loan.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/loans/{number}")
    public Loan getloan(@PathVariable int number){
        return new Loan(
                number,"Personal",2500000,20000,20
        );
    }
}
