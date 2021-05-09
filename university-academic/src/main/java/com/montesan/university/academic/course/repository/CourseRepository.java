package com.montesan.university.academic.course.repository;

import com.montesan.university.academic.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
