package com.schedule.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.schedule.app.entity.Courses;

public interface CourseRepository extends JpaRepository<Courses, String> {

}
