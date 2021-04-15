package com.montesan.university.registration.enrolling.service;

import com.montesan.university.registration.enrolling.dto.EnrollingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.montesan.university.registration.infra.kafka.*;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EnrollingService {

    private final EnrollingProduce enrollingProduce;

    public void enroll(EnrollingDto studentDto){
        studentDto.setId(UUID.randomUUID().toString());
        enrollingProduce.send(studentDto);
    }
}