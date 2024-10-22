package com.telusko.SpringJPA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.SpringJPA.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{


	List<Student> findAllByName(String name);

}
