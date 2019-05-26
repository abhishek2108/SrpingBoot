package com.springlearning.consuming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.springlearning.consuming.datamodel.Student;

@org.springframework.web.bind.annotation.RestController
@PropertySource("classpath:app.properties")
@RequestMapping("/restApi")
public class RestController {
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Value("${oneStudent}")
	String urlForOneStudent;
	
	@Value("${allStudents}")
	String urlForAllStudents;
	
	@GetMapping("/getOne/{id}")
	public Student getOnestudent(@PathVariable Long id, RestTemplate restTemplate) {
		 
		 ResponseEntity<Student> student = restTemplate.exchange(urlForOneStudent+id, HttpMethod.GET ,null, new ParameterizedTypeReference<Student>() {
		});
		//restTemplate.getForObject(urlForOneStudent, Student.class);
		System.out.println(student.getBody());
		return student.getBody();
		
		
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllstudents(RestTemplate restTemplate) {
		
		ResponseEntity<List<Student>> studentEntity =restTemplate.exchange(urlForAllStudents,HttpMethod.GET,null, new ParameterizedTypeReference<List<Student>>() {
		} );
		System.out.println(studentEntity.getBody());
		return studentEntity.getBody();
		
		
	}
}
