package com.cg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.springboot.bean.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {
}
