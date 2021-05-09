package com.montesan.university.academic.subject.dto;

import com.montesan.university.academic.course.dto.CourseDto;
import com.montesan.university.academic.subject.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectDto implements Serializable {

    @Id
    private String id;
    private String name;
    private Integer period;
    private CourseDto course;

    public Subject toEntity(){
        return new ModelMapper().map(this, Subject.class);
    }
}