package com.montesan.university.academic.infra.kafka.producer.course;

import com.montesan.university.academic.course.dto.CourseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CourseProducer {

    @Value("${topic.name.producer.course}")
    private String topic;

    private final KafkaTemplate<String, CourseDto> kafkaTemplate;

    public void send(CourseDto courseDto) {
        log.info("Message: {}", courseDto);
        kafkaTemplate.send(topic, courseDto);
    }
}