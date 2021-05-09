package com.montesan.university.academic.course.dto;

import com.montesan.university.academic.course.entity.Course;
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
public class CourseDto implements Serializable {

    @Id
    private String id;
    private String name;

    public Course toEntity(){
        return new ModelMapper().map(this, Course.class);
    }
}