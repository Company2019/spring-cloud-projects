package com.student.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component

public class BookService implements IBookService {
	RestTemplate restTemplate;
	
	@Autowired
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public String getBook() {
		URI uri = URI.create("http://localhost:8082/book");
		return this.restTemplate.getForObject(uri, String.class);
	}

	public String reliable() {
		if(true) {
//			throw new RuntimeException();
		}
		return "Cloud Native Java (O'Reilly)1";
	}

}