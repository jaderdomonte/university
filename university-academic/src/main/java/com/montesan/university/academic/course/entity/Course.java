package com.montesan.university.academic.course.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.montesan.university.academic.course.dto.CourseDto;
import com.montesan.university.academic.subject.dto.SubjectDto;
import com.montesan.university.academic.subject.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course implements Persistable<UUID> {

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    private UUID id;

    private String name;

    @OneToMany(cascade = CascadeType.REMOVE,
                    fetch = FetchType.EAGER, mappedBy = "course")
    private List<Subject> subjects;

    public CourseDto toDto(){
        return new ModelMapper().map(this, CourseDto.class);
    }

    @Override
    @JsonIgnore
    public boolean isNew() {
        return this.id == id;
    }
}