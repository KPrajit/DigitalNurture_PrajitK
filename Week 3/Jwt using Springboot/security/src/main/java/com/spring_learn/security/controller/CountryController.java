package com.spring_learn.security.controller;
import com.spring_learn.security.model.Country;
import com.spring_learn.security.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping
public class CountryController {
    @Autowired
    CountryService countryService;
    @GetMapping("/country")
    public ArrayList<Country> getCountry(){
        return countryService.getCountry();

    }
}
