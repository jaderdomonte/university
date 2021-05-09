package com.montesan.university.registration.infra.kafka.consume;

import com.montesan.university.registration.course.dto.CourseDto;
import com.montesan.university.registration.course.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class CourseServiceConsumer {

    private final CourseRepository repository;

//    @Payload
    @KafkaListener(topics = "${topic.name.consumer.course}", groupId = "group_id", containerFactory = "courseListener")
    public void consuming(CourseDto courseDto){
        log.info("Consuming: {}", courseDto);
        repository.save(courseDto.toEntity());
    }
}