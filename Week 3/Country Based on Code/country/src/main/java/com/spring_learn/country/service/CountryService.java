package com.spring_learn.country.service;
import java.util.ArrayList;
import com.spring_learn.country.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    @Autowired
    @Qualifier("country")
    ArrayList<Country> country;
    public Country getCountry(String code) {
        for(Country count: country){
            if(count.getCode().equalsIgnoreCase(code))return count;
        }
        return null;
    }
}
