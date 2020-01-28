package com.mysqllearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mysqllearning.model.Student;
import com.mysqllearning.repository.StudentRepository;
import com.mysqllearning.service.StudentService;

@RestController
@RequestMapping("/v1")
public class StudentController {
	@Autowired
	StudentService studentservice;
	
	@PostMapping("/student")
	public Student create(@RequestBody Student stu)
	{
		return studentservice.create(stu);
	}
	@GetMapping("/student")
	public Page<Student>retrieve() {
		return studentservice.retrieve();
	}
	
	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable long id) {
		studentservice.delete(id);
	}
	@PutMapping("/student/{id}")
	public void update(@PathVariable("id") long id,@RequestBody Student stu) {
		studentservice.update(id,stu);
	}
	@GetMapping("/student/{age}")
	public List<Student> search(@PathVariable int age) {
		
		return studentservice.search(age);
	}
	
	@GetMapping("/student/search/{ch}")
	public List<Student> searchbyname(@PathVariable char ch) {
		
		return studentservice.searchbyname(ch);
	}
	@GetMapping("/student/page/{page}")
	public Page<Student> get(@PathVariable int page) {
		return studentservice.get(page);
	}
	
	
}
