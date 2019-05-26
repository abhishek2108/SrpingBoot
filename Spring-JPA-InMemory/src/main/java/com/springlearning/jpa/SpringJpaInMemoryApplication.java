package com.springlearning.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springlearning.jpa.model.Student;
import com.springlearning.jpa.repository.JPARepository;

@SpringBootApplication
public class SpringJpaInMemoryApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaInMemoryApplication.class, args);
	}
	
	@Autowired
	JPARepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		Student student = new Student("Abhishek","Computer Science",8,"Ranchi");
		Student student1 = new Student("Fazal","Information Science",8,"Bangalore");
		
		repo.save(student);
		repo.save(student1);
	}
}
