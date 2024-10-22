package com.telusko.SpringJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.SpringJPA.model.Student;
import com.telusko.SpringJPA.services.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@GetMapping("students")
	public List<Student> getAllStudent()
	{
		return ss.findAll();
	}
	
	@GetMapping("student/{id}")
	public Student getStudent(@PathVariable("id") int id)
	{
		return ss.findStudent(id);
	}
	
	@GetMapping("student/name/{name}")
	public List<Student> getStudent(@PathVariable("name") String name)
	{
		return ss.findStudent(name);
	}
	
	@PostMapping("student")
	public String postMethodName(@RequestBody Student student) {
		ss.addStudent(student);
		return "added";
	}
	
	@PutMapping("student")
	public String updateStudent(@RequestBody Student student)
	{
		ss.update(student);
		return "updated";
	}
	
	@DeleteMapping("student/{id}")
	public String deleteStudent(@PathVariable("id") int id)
	{
		ss.delete(id);
		return "deleted";
	}
	

}
