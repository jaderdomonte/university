package com.montesan.university.academic.infra.kafka.producer.subject;

import com.montesan.university.academic.subject.dto.SubjectDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SubjectServiceProducer {

    @Value("${topic.name.producer.subject}")
    private String topic;

    private final KafkaTemplate<String, SubjectDto> kafkaTemplate;

    public void send(SubjectDto subjectDto) {
        log.info("Message: {}", subjectDto);
        kafkaTemplate.send(topic, subjectDto);
    }
}