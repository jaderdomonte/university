package com.montesan.university.academic.subject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.montesan.university.academic.course.entity.Course;
import com.montesan.university.academic.subject.dto.SubjectDto;
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
public class Subject implements Persistable<UUID> {

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    private UUID id;

    private String name;

    private Integer period;

    @ManyToOne
    @JoinColumn(name = "id_course")
    @JsonIgnore
    private Course course;

    public SubjectDto toDto() {
        return new ModelMapper().map(this, SubjectDto.class);
    }

    @Override
    @JsonIgnore
    public boolean isNew() {
        return this.id == null;
    }
}