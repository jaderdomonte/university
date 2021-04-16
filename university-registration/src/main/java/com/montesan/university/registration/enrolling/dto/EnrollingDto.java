package com.montesan.university.registration.enrolling.dto;

import com.montesan.university.registration.enrolling.entity.Enrolling;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnrollingDto {

    public String id;
    public String name;

    public Enrolling toEntity(){
        return new ModelMapper().map(this, Enrolling.class);
    }
}