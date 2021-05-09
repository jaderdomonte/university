package com.montesan.university.academic.subject.entity;

import com.montesan.university.academic.course.entity.Course;
import com.montesan.university.academic.subject.dto.SubjectDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject implements Serializable {

    @Id
    private String id;

    private String name;

    private Integer period;

    @ManyToOne
    @JoinColumn(name = "id_course")
    private Course course;

    public SubjectDto toDto(){
        return new ModelMapper().map(this, SubjectDto.class);
    }
}