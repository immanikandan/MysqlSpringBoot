package com.mysqllearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysqllearning.dao.StudentDao;
import com.mysqllearning.model.Student;

@Component
public class StudentService {
	@Autowired
	StudentDao studentdao;
	
	
	public Student create(Student stu) {
		
		return studentdao.create(stu);
	}
	public List<Student> retrieve() {
		return studentdao.retrieve();
	}
	 public void delete(Student stu) {
		studentdao.delete(stu);
	}

}
