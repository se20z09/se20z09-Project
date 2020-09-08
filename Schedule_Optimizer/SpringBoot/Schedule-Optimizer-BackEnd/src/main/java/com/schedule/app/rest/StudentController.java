package com.schedule.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schedule.app.entity.Student;
import com.schedule.app.repository.StudentRepository;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	StudentRepository studRepo;

	@GetMapping("/allStudents")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Student> getInfo() {
		return studRepo.findAll();
	}
}
