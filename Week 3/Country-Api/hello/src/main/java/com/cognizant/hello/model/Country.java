package com.cognizant.hello.model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger logger = LoggerFactory.getLogger("country.xml");
    private String code;
    private String name;
    public Country(){
        logger.info("Inside country");
    }
    public String getCode(){
        logger.info("Getting code");
        return code;
    }
    public void setCode(String code){
        logger.info("setting code");
        this.code = code;
    }
    public String getName(){
        logger.info("Getting name");
        return name;
    }
    public void setName(String name){
        logger.info("Setting name");
        this.name = name;
    }

}
