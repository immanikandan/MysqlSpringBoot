package com.mysqllearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysqllearning.model.Student;

@RestController
@RequestMapping("/v1")
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome";
	}
	@PostMapping("/newstudent")
	public Student create(@RequestBody Student stu) {
		return stu;
	}

}
