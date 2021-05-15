package com.montesan.university.registration.subject.dto;

import com.montesan.university.registration.course.dto.CourseDto;
import com.montesan.university.registration.subject.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectDto implements Serializable {

    private UUID id;
    private String name;
    private Integer period;
    private CourseDto course;

    public Subject toEntity() {
        return new ModelMapper().map(this, Subject.class);
    }
}