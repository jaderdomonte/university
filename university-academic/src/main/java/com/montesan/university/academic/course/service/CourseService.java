package com.montesan.university.academic.course.service;

import com.montesan.university.academic.course.entity.Course;
import com.montesan.university.academic.course.repository.CourseRepository;
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