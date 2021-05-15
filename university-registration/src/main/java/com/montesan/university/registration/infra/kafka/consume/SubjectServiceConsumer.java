package com.montesan.university.registration.infra.kafka.consume;

import com.montesan.university.registration.subject.dto.SubjectDto;
import com.montesan.university.registration.subject.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class SubjectServiceConsumer {

    private final SubjectRepository repository;

    @KafkaListener(topics = "${topic.name.consumer.subject}", groupId = "group_id", containerFactory = "subjectListener")
    public void consuming(SubjectDto subjectDto){
        log.info("Consuming: {}", subjectDto);
        repository.save(subjectDto.toEntity());
    }
}