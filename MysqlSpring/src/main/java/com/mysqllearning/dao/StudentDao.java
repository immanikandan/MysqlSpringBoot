package com.mysqllearning.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.mysqllearning.model.Student;
import com.mysqllearning.repository.StudentRepository;

@Component
public class StudentDao {
	
	@Autowired
	StudentRepository studentrepository;
	public Student create(Student stu) {
		return studentrepository.save(stu);
		
	}
	public Page<Student> retrieve(){
		Pageable page= PageRequest.of(0,5,Sort.by("id").descending());
		return studentrepository.findAll(page);
		 
	}
	public void delete(long id) {
		studentrepository.deleteById(id);
	}
	public void update(long id,Student stu) {
		Student s=studentrepository.getOne(id);
		s.setName(stu.getName());
		s.setAge(stu.getAge());
		studentrepository.save(s);
	}
	public List<Student>  search(int age) {
		return studentrepository.findByAge(age);
	}
	public List<Student> searchbyname(char ch) {
		return studentrepository.findByNameEndsWith(ch);
	}
	public Page<Student> get(int page) {
		Pageable p= PageRequest.of(page,5,Sort.by("id").ascending());

		return studentrepository.findAllStudent(p);
	}

}
