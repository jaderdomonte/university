package com.montesan.university.registration.course.dto;

import com.montesan.university.registration.course.entity.Course;
import com.montesan.university.registration.subject.dto.SubjectDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto implements Serializable {

    private UUID id;
    private String name;
    private List<SubjectDto> subjects;

    public Course toEntity(){
        return new ModelMapper().map(this, Course.class);
    }
}