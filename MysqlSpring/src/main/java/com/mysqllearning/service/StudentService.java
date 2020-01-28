package com.mysqllearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.mysqllearning.dao.StudentDao;
import com.mysqllearning.model.Student;

@Component
public class StudentService {
	@Autowired
	StudentDao studentdao;
	
	
	public Student create(Student stu) {
		
		return studentdao.create(stu);
	}
	public Page<Student> retrieve() {
		return studentdao.retrieve();
	}
	 public void delete(long id) {
		studentdao.delete(id);
	}
	 public void update(long id,Student stu) {
		studentdao.update(id,stu);
	 }
	 public List<Student> search(int age) {
		 return studentdao.search(age);
	 }
	 public List<Student> searchbyname(char ch) {
			
			return studentdao.searchbyname(ch);
		}
	 public Page<Student> get(int page) {
			return studentdao.get(page);
		}
}
