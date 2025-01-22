package com.example.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//Field Injection Example
@Component
class BusinessClass
{
//	@Autowired
	Dependency1 dependency1;
	
//	@Autowired
	Dependency2 dependency2;
	
	
	//@Autowired - for constructor injection, no need of autowired annotation, it will be automatically autowired
public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
	super();
	System.out.println("Constructor Injection - BusinessClass");
	this.dependency1 = dependency1;
	this.dependency2 = dependency2;
}



//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection - setDependency2");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection - setDependency2");
//		this.dependency2 = dependency2;
//	}

	public String toString()
	{
		return "Using " +dependency1+ " and " +dependency2;
	}
}

@Component
class Dependency1
{
	
}

@Component
class Dependency2
{
	
}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean(BusinessClass.class));
		}		
	}
}
