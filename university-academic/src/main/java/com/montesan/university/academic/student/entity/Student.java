package com.montesan.university.academic.student.entity;

import com.montesan.university.academic.course.entity.Course;
import com.montesan.university.academic.student.dto.StudentDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Persistable<UUID> {

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    private UUID id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "id_course")
    private Course course;

    public StudentDto toDto(){
        return new ModelMapper().map(this, StudentDto.class);
    }

    @Override
    public boolean isNew() {
        return this.id == null;
    }
}