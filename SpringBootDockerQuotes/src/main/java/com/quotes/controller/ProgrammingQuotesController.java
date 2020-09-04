package com.quotes.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ProgrammingQuotesController {
	
	@GetMapping("/programming/quotes")
	public String getAllQuotes() throws IOException {
		Resource resource = new ClassPathResource("programming-quotes.json");
		BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
		StringBuilder sb = new StringBuilder();
		reader.lines().forEach(s->{
			sb.append(s);
		});
		return sb.toString();
	}

}
