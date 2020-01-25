package com.mysqllearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysqllearning.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
