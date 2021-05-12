package com.montesan.university.academic.student.dto;

import com.montesan.university.academic.course.dto.CourseDto;
import com.montesan.university.academic.student.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {

    private UUID id;
    private String name;
    private CourseDto course;

    public Student toEntity(){
        return new ModelMapper().map(this, Student.class);
    }
}