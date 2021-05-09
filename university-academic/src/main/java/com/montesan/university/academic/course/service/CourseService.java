package com.montesan.university.academic.course.service;

import com.montesan.university.academic.course.dto.CourseDto;
import com.montesan.university.academic.course.entity.Course;
import com.montesan.university.academic.course.repository.CourseRepository;
import com.montesan.university.academic.infra.kafka.producer.course.CourseProducer;
import com.montesan.university.academic.infra.kafka.producer.subject.SubjectProducer;
import com.montesan.university.academic.student.dto.StudentDto;
import com.montesan.university.academic.student.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseProducer courseProducer;
    private final CourseRepository repository;

    public CourseDto save(CourseDto courseDto){
        courseDto.setId(UUID.randomUUID().toString());

        Course courseSaved = repository.save(courseDto.toEntity());
        courseProducer.send(courseDto);

        return courseSaved.toDto();
    }

    public List<Course> getCourses(){
        return repository.findAll();
    }
}