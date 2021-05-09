package com.montesan.university.academic.course.controller;

import com.montesan.university.academic.course.dto.CourseDto;
import com.montesan.university.academic.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService service;

    @PostMapping
    public ResponseEntity<?> createCourse(@RequestBody CourseDto courseDto){
        return ResponseEntity.ok(service.save(courseDto));
    }

    @GetMapping
    public ResponseEntity<?> getCourses(){
        return ResponseEntity.ok(service.getCourses());
    }
}