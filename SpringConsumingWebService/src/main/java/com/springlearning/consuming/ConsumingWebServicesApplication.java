package com.springlearning.consuming;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.springlearning.consuming.datamodel.Student;

@SpringBootApplication
public class ConsumingWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingWebServicesApplication.class, args);
	}
	
	//For loading data and printing at Startup of SpringBoot Application
	
	/*
	 * @Bean public RestTemplate restTemplate(RestTemplateBuilder builder) { return
	 * builder.build(); }
	 * 
	 * @Bean public Student run (RestTemplate restTemplate) throws Exception {
	 * Student Student =
	 * restTemplate.getForObject("http://localhost:1001/restApi/getOne",
	 * Student.class);
	 * 
	 * ResponseEntity<List<com.springlearning.consuming.datamodel.Student>> StudentE
	 * = restTemplate.exchange("http://localhost:1001/restApi/getAll",
	 * HttpMethod.GET, null, new ParameterizedTypeReference<List<Student>>(){});
	 * System.out.println(StudentE.getBody()); System.out.println(Student); return
	 * Student;
	 * 
	 * }
	 */
}
