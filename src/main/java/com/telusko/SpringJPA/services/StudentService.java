package com.telusko.SpringJPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringJPA.model.Student;
import com.telusko.SpringJPA.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo sr;

	public List<Student> findAll() {
		return sr.findAll();
	}

	public Student findStudent(int id) {
		return sr.findById(id).orElse(new Student());
	}

	public void addStudent(Student student) {
		sr.save(student);
		
	}

	public void update(Student student) {
		sr.save(student);
		
	}

	public void delete(int id) {
		sr.deleteById(id);
		
	}

	public List<Student> findStudent(String name) {
		return sr.findAllByName(name);
	}
}
