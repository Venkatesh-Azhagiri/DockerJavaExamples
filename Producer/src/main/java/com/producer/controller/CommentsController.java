package com.producer.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jayway.jsonpath.JsonPath;

@CrossOrigin(origins = "*")
@RestController
public class CommentsController {
	
	@ResponseBody
	@RequestMapping(value="/comments/{id}")
	public String getData(@PathVariable("id") String id) throws IOException {
		Resource resource = new ClassPathResource("comments.json");
	//	System.out.println("Exist::::"+resource.getFile().exists());
		BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
		StringBuilder sb = new StringBuilder();
		reader.lines().forEach(s->{
			sb.append(s);
		});
		Object dataObject = JsonPath.parse(sb.toString()).read("$[?(@.id == "+id+")]");
		String dataString = dataObject.toString();	
		System.out.println("dataString::"+dataString);		
		/*// yet to modify for filter
		 * Filter expensiveFilter =
		 * Filter.filter(Criteria.where("email").gt("Jayne_Kuhic@sydney.com")); Object
		 * expensive = JsonPath.parse(content) .read("$[*]", expensiveFilter); String
		 * dataString1 = expensive.toString();
		 * System.out.println("expensive::"+dataString1);
		 */		
		 return dataString;
	}
	
	

}
