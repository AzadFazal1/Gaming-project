package com.Springproject.Gamingproject.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
	
};

record Address(String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Azad";
	}

	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Ravi", 20);
		
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(), age());
		
		return person;
	}
	
	@Bean(name = "customAddress")
	public Address address() {
		var address = new Address("218 Graves Ave", "Champaign");
		return address;
	}
}
