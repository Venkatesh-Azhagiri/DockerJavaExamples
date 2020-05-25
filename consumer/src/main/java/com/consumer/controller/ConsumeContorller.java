package com.consumer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumeContorller {
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	
	@GetMapping(path="/consume/{id}/comments")
	public String getComments(@PathVariable("id") String id, HttpServletRequest request) {
		System.out.println("request url::"+request.getHeader("host"));
		String url ="http://"+request.getHeader("host").substring(0, request.getHeader("host").indexOf(":"))+":8080"+"/comments/";
		System.out.println("url:::"+url);
		  //restTemplate= 
		ResponseEntity<String> response =
				this.restTemplate().getForEntity(url + id, String.class);
		return response.getBody().toString();				
	}

}
