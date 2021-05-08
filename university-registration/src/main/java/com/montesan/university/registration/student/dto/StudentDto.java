package com.montesan.university.registration.student.dto;

import com.montesan.university.registration.course.dto.CourseDto;
import com.montesan.university.registration.student.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {

    private String id;
    private String name;
    private CourseDto course;


    public Student toEntity(){
        return new ModelMapper().map(this, Student.class);
    }
}