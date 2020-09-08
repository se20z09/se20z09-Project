package com.schedule.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.schedule.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}