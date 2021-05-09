package com.montesan.university.academic.student.service;

import com.montesan.university.academic.student.dto.StudentDto;
import com.montesan.university.academic.student.entity.Student;
import com.montesan.university.academic.student.repository.StudentRepository;
import com.montesan.university.academic.infra.kafka.StudentProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentProducer studentProducer;
    private final StudentRepository repository;

    public StudentDto save(StudentDto studentDto){
        studentDto.setId(UUID.randomUUID().toString());

        Student studentSave = repository.save(studentDto.toEntity());
        studentProducer.send(studentDto);

        return studentSave.toDto();
    }

    public List<StudentDto> getStudents(StudentDto studentDto) {
        List<Student> students = repository.listEnrollings(studentDto);

        return students.stream().map(Student::toDto).collect(Collectors.toList());
    }
}