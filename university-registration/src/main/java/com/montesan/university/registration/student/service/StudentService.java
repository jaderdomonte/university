package com.montesan.university.registration.student.service;

import com.montesan.university.registration.student.dto.StudentDto;
import com.montesan.university.registration.student.entity.Student;
import com.montesan.university.registration.student.repository.StudentRepository;
import com.montesan.university.registration.infra.kafka.produce.StudentProducer;
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

    public StudentDto save(StudentDto studentDto) {
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