package com.example.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) { };
record Address(String Lane, String City) { };

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name()
	{
		return "Chatur";
	}
	
	@Bean
	public int age()
	{
		return 20;
	}
	
	@Bean
	public Person person()
	{
		return new Person("Raghu", 18, new Address("Ravindra nagar colony", "Hyd"));
	}
	
	@Bean
	public Person person2MethodCall()
	{
		return new Person(name(),age(), address()); //using name and age beans for person2
	}
	
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) //name,age,address2
	{
		return new Person(name, age, address3); //using name and age beans for person2
	}
	
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) //name,age,address2
	{
		return new Person(name, age, address); //using name and age beans for person2
	}
	
	
	@Bean
	public Person person5qualifier(String name, int age, @Qualifier("address3qualifier") Address address) //name,age,address2
	{
		return new Person(name, age, address); //using name and age beans for person2
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address()
	{
		return new Address("Ravindra Nagar Colony", "Hyderabad");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3()
	{
		return new Address("Ravindra Nagar", "Hyderabad");
	}
	
}
