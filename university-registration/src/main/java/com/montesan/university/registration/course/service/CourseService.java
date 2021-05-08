package com.montesan.university.registration.course.service;

import com.montesan.university.registration.course.entity.Course;
import com.montesan.university.registration.course.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository repository;

    public List<Course> getCourses(){
        return repository.findAll();
    }
}