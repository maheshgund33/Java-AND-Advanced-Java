package com.firstDemo.Exercise;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import Exercise1.BusinessCalculationService;
import Exercise1.MongoDBDataService;
import Exercise1.MySqlDataService;

@Configuration
@ComponentScan("Exercise1")
public class Calculator {
	
	public static void main(String[] args) {
		 
		
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Calculator.class)) {

        	 System.out.println(context.getBean(BusinessCalculationService.class).findmax());
          
        	
            
            
        }
	}
	
	

}

