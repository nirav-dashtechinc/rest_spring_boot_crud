package com.rest.spring.boot.crud.service;

import java.util.List;

import com.rest.spring.boot.crud.entity.Student;

public interface StudentService {
	public List<Student> findAll();
	public Student findById(int id);
	public void saveOrUpdate(Student student);
	public void delete(int id);
}
