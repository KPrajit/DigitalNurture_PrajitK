package com.cognizant.spring_core;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringCoreApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringCoreApplication.class);
	public static void main(String[] args){
		logger.info("Inside main");
		displayCountry();
	}

	public static void displayCountry(){
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country",Country.class);
		logger.info("Country:{}",country);


		}


}
