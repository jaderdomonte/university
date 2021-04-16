package com.montesan.university.registration.infra.kafka;

import com.montesan.university.registration.enrolling.dto.EnrollingDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class EnrollingConsumer {

    @Value("${topic.name.producer}")
    private String topic;

    @KafkaListener(topics = "${topic.name.producer}", groupId = "group_id")
    @Payload
    public void consuming(EnrollingDto enrollingDto){
        log.info("Consuming: {}", enrollingDto);
    }
}