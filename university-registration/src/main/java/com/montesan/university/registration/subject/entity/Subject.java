package com.montesan.university.registration.subject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.montesan.university.registration.course.entity.Course;
import com.montesan.university.registration.subject.dto.SubjectDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject implements Persistable<UUID> {

    @Id
    private UUID id;

    private String name;

    private Integer period;

    @ManyToOne
    @JoinColumn(name = "id_course")
    @JsonIgnore
    private Course course;

    public SubjectDto toDto(){
        return new ModelMapper().map(this, SubjectDto.class);
    }

    @Override
    @JsonIgnore
    public boolean isNew() {
        return this.id == null;
    }
}