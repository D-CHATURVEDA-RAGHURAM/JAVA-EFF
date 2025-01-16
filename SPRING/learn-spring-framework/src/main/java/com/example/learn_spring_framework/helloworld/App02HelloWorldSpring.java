package com.example.learn_spring_framework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1. Launch a spring application
		//2. configure the things that we want spring to manage - @configuration class
		
		//HelloWorldConfiguration - @Configuration
		//name - @Bean
		//3. Retrieving Beans named by Spring
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Person.class)); //type class
			System.out.println(context.getBean(Address.class)); //type class
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("person5qualifier"));
		}
		
		
		
		
		
	}

}
