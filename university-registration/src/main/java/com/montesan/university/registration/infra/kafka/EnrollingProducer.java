package com.montesan.university.registration.infra.kafka;

import com.montesan.university.registration.enrolling.dto.EnrollingDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EnrollingProducer {

    @Value("${topic.name.producer}")
    private String topic;

    private final KafkaTemplate<String, EnrollingDto> kafkaTemplate;

    public void send(EnrollingDto studentDto) {
//        log.info("Message: {}", studentDto);
        kafkaTemplate.send(topic, studentDto);
    }
}