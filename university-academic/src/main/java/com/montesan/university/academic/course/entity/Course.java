package com.montesan.university.academic.course.entity;

import com.montesan.university.academic.course.dto.CourseDto;
import com.montesan.university.academic.subject.dto.SubjectDto;
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
public class Course implements Serializable {

    @Id
    private String id;

    private String name;

    public CourseDto toDto(){
        return new ModelMapper().map(this, CourseDto.class);
    }
}