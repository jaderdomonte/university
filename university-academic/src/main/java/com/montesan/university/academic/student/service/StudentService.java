package com.montesan.university.academic.student.service;

import com.montesan.university.academic.student.dto.StudentDto;
import com.montesan.university.academic.student.entity.Student;
import com.montesan.university.academic.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public List<StudentDto> getStudents(StudentDto studentDto) {
        List<Student> students = repository.listEnrollings(studentDto);

        return students.stream().map(Student::toDto).collect(Collectors.toList());
    }
}