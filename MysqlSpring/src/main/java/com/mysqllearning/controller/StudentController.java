package com.mysqllearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.mysqllearning.service.StudentService;

@RestController
@RequestMapping("/school")
public class StudentController {
	@Autowired
	StudentService studentservice;
	
	@PostMapping("/student")
	public Student create(@RequestBody Student stu)
	{
		return studentservice.create(stu);
	}
	@GetMapping("/student")
	public List<Student>retrieve() {
		return studentservice.retrieve();
	}
	
	@DeleteMapping("/student")
	public void delete(@RequestBody Student stu) {
		studentservice.delete(stu);
	}

}
