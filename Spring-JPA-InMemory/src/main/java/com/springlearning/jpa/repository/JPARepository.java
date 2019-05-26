package com.springlearning.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springlearning.jpa.model.Student;

@Repository
public interface JPARepository extends JpaRepository<Student, Long> {

}
