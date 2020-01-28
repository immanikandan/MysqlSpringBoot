package com.mysqllearning.repository;

import java.util.List;

import javax.persistence.NamedQuery;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.mysqllearning.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>,PagingAndSortingRepository<Student, Long>{
	List<Student> findByAge(int age);
	Page<Student> findAll(Pageable pageable);
	List<Student> findByNameEndsWith(char ch);
	@Query(value = "SELECT u FROM Student u")
	Page<Student> findAllStudent(Pageable page);
}
