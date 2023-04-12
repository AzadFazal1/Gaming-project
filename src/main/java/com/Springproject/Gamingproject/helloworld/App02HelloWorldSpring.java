package com.Springproject.Gamingproject.helloworld;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		try (// 1: Launch a spring context
			// 2: Configure the things that we want spring to manage
			// HelloWorldConfiguration - @Configuration
			// name - @Bean
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			// 3: Retrieving Beans managed by Spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("customAddress"));
			//System.out.println(context.getBean(Address.class));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		


	}

}
