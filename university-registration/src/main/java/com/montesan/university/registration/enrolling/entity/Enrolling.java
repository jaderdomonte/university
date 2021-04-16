package com.montesan.university.registration.enrolling.entity;

import com.montesan.university.registration.enrolling.dto.EnrollingDto;
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
public class Enrolling implements Serializable {

    @Id
    public String id;

    public String name;

    public EnrollingDto toDto(){
        return new ModelMapper().map(this, EnrollingDto.class);
    }
}