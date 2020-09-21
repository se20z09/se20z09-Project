package com.schedule.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schedule.app.entity.Courses;
import com.schedule.app.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CoursesController {
	@Autowired
	CourseRepository courseRepo;

	@GetMapping("/allCourses")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Courses> getInfo() {
		return courseRepo.findAll();
	}
}
