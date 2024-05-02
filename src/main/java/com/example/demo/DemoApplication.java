package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("I am started now");
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){

		return args->{
			System.out.println("Lets inspect the beans provided by Spring boot");


			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName:beanNames){
				System.out.println(beanName);
				
			}
		};
		
	}

	@Bean
	public String getWelcomeString(){
		return "Welcome to spring boot application";

	}

	// @PostConstruct
	// public void printWelcomeString(){
	// 	System.out.println(getWelcomeString());
	// }

	@PostConstruct
	public void printWelcomeString(){
		System.out.println("I am POST-CONSTRUCT AFTER SPRING INITIALISED ALL THE BEANS");
	}

}
