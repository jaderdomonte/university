package com.montesan.university.registration.enrolling.service;

import com.montesan.university.registration.enrolling.dto.EnrollingDto;
import com.montesan.university.registration.enrolling.entity.Enrolling;
import com.montesan.university.registration.enrolling.repository.EnrollingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.montesan.university.registration.infra.kafka.*;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EnrollingService {

    private final EnrollingProduce enrollingProduce;
    private final EnrollingRepository repository;

    public void enroll(EnrollingDto enrollingDto){
        enrollingDto.setId(UUID.randomUUID().toString());

        Enrolling enrolling = new Enrolling(enrollingDto.getId(), enrollingDto.getName());

        enrollingProduce.send(enrollingDto);
    }
}