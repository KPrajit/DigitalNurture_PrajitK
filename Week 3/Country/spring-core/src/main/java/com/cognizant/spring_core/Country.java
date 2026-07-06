package com.cognizant.spring_core;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger logger = LoggerFactory.getLogger(Country.class);
    private String name;
    private String code;
    public Country(){
        logger.debug("Inside Country class");
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
        logger.info("getting name");
        return name;
    }
    public void setName(String name){
        logger.info("Setting name");
        this.name = name;
    }
    public String toString(){
        return "Code"+code+" Name"+name;
    }
}
