package com.montesan.university.academic.course.service;

import com.montesan.university.academic.course.dto.CourseDto;
import com.montesan.university.academic.course.entity.Course;
import com.montesan.university.academic.course.repository.CourseRepository;
import com.montesan.university.academic.infra.kafka.producer.course.CourseServiceProducer;
import com.montesan.university.academic.subject.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseServiceProducer courseServiceProducer;
    private final CourseRepository repository;
    private final SubjectRepository subjectRepository;

    public CourseDto save(CourseDto courseDto){
        Course courseSaved = repository.save(courseDto.toEntity());
        courseServiceProducer.send(courseSaved.toDto());

        return courseSaved.toDto();
    }

    public List<Course> getCourses(){
        return repository.findAll();
    }
}