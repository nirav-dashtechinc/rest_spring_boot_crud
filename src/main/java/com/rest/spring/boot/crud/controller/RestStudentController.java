package com.rest.spring.boot.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.spring.boot.crud.entity.Student;
import com.rest.spring.boot.crud.service.StudentService;

@RestController
@RequestMapping("/students")
public class RestStudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/demo")
	public String demo() {
		return "This is demo method";
	}

	@GetMapping
	public List<Student> findAll() {
		return studentService.findAll();
	}

	@GetMapping("/{id}")
	public Student findById(@PathVariable("id") int id) {
		return studentService.findById(id);
	}

	@PostMapping
	public String save(@RequestBody Student student) {
		studentService.saveOrUpdate(student);
		return "Student added successfully.";
	}

	@PutMapping
	public String update(@RequestBody Student student) {
		studentService.saveOrUpdate(student);
		return "Student updated successfully.";
	}

	@DeleteMapping("/{id}")
	public List<Student> delete(@PathVariable("id") int id) {
		studentService.delete(id);
		return studentService.findAll();
	}
}
