package com.montesan.university.registration.course.repository;

import com.montesan.university.registration.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {
}
