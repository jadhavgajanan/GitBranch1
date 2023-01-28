package com.BikkadIT.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
@Service
public class FlightService {
	
	public void getSycAllFlight() {
		
		WebClient web=WebClient.create();
		String url="http://mu.mulesoft-training.com/essentials/united/flights";
		String block = web.get()
		.uri(url)
		.accept(MediaType.APPLICATION_JSON)
		.retrieve()
		.bodyToMono(String.class)
		.block();
		System.out.println(block);
		System.out.println("Welcome to Bikkad IT");
	}
	
	public void getASycAllFlight() {
		WebClient webClient=WebClient.create();
		String url="http://mu.mulesoft-training.com/essentials/united/flights";
		webClient.get()
		.uri(url)
		.accept(MediaType.APPLICATION_JSON)
		.retrieve()
		.bodyToMono(String.class)
		.subscribe(System.out::println);
		System.out.println("Welcome To BikkadIT");
	}

}
