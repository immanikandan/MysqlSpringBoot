package com.mysqllearning.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysqllearning.model.Student;
import com.mysqllearning.repository.StudentRepository;

@Component
public class StudentDao {
	
	@Autowired
	StudentRepository studentrepository;
	public Student create(Student stu) {
		return studentrepository.save(stu);
		
	}
	public List<Student> retrieve(){
		return studentrepository.findAll();
		 
	}
	//public Student update(int index,Student stu) {
		//	if(students.get(index)!=null)
		//		students.set(index,(stu));
		//		return stu;
	public void delete(Student stu) {
		{
			studentrepository.delete(stu);
		}
	}

}
