package com.BikkadIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.service.FlightService;

@SpringBootApplication
public class WebClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WebClientApplication.class, args);
		FlightService bean = context.getBean(FlightService.class);
		System.out.println("This is synchronus output ");
		bean.getSycAllFlight();
		System.out.println("This is Asynchronus output");
		bean.getASycAllFlight();
	}

}
