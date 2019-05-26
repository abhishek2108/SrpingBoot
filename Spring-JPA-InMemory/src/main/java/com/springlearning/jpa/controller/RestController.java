package com.springlearning.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlearning.jpa.model.Student;
import com.springlearning.jpa.repository.JPARepository;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/restApi")
public class RestController {

	@Autowired
	JPARepository repository;
	
	@GetMapping("/getAll")
	public List<Student> getAllStudents() {

		return repository.findAll();

	}
	
	@GetMapping("/getOne/{id}")
	public Optional<Student> getOneStudent(@PathVariable Long id) {

		return repository.findById(id);

	}
	

}
