package com.montesan.university.academic.student.controller;

import com.montesan.university.academic.student.dto.StudentDto;
import com.montesan.university.academic.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getStudents(StudentDto studentDto) {
        List<StudentDto> response = service.getStudents(studentDto);

        return ResponseEntity.ok(response);
    }
}