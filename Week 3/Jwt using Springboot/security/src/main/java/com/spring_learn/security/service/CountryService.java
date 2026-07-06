package com.spring_learn.security.service;

import com.spring_learn.security.model.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountryService {
    ArrayList<Country> cont;
    public ArrayList<Country> getCountry() {
        return cont;
    }
}
