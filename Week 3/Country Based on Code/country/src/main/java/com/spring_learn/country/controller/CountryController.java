package com.spring_learn.country.controller;
import com.spring_learn.country.model.Country;
import com.spring_learn.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @Autowired
    CountryService countryService;
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code){
        Country county = countryService.getCountry(code);
        return county;
    }
}
