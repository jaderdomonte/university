package com.montesan.university.registration.enrolling.service;

import com.montesan.university.registration.enrolling.dto.EnrollingDto;
import com.montesan.university.registration.enrolling.entity.Enrolling;
import com.montesan.university.registration.enrolling.repository.EnrollingRepository;
import com.montesan.university.registration.infra.kafka.EnrollingProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EnrollingService {

    private final EnrollingProducer enrollingProduce;
    private final EnrollingRepository repository;

    public EnrollingDto enroll(EnrollingDto enrollingDto){
        enrollingDto.setId(UUID.randomUUID().toString());

        Enrolling enrollingSave = repository.save(enrollingDto.toEntity());
        enrollingProduce.send(enrollingDto);

        return enrollingSave.toDto();
    }

    public List<EnrollingDto> listEnrollings(EnrollingDto enrollingDto) {
        List<Enrolling> enrollings = repository.listEnrollings(enrollingDto);

        return enrollings.stream().map(Enrolling::toDto).collect(Collectors.toList());
    }
}