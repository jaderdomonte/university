package com.montesan.university.registration.infra.kafka;

import com.montesan.university.registration.course.dto.CourseDto;
import com.montesan.university.registration.subject.dto.SubjectDto;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@Configuration
@EnableKafka
public class KafkaConfig {

    private Map<String, Object> getBaseConfiguration() {
        // HashMap to store the configurations
        Map<String, Object> map = new HashMap<>();

        // put the host IP in the map
        map.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

        // put the group ID of consumer in the map
        map.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        map.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        map.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return map;
    }

    // Function to establish a connection
    // between Spring application
    // and Kafka server
    @Bean
    public ConsumerFactory<String, CourseDto> courseConsumer() {
        Map<String, Object> map = getBaseConfiguration();

        // return message in JSON formate
        return new DefaultKafkaConsumerFactory<>(map, new StringDeserializer(),
                new JsonDeserializer<>(CourseDto.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, CourseDto> courseListener() {
        ConcurrentKafkaListenerContainerFactory<String, CourseDto>
                factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(courseConsumer());
        return factory;
    }

    @Bean
    public ConsumerFactory<String, SubjectDto> subjectConsumer() {
        Map<String, Object> map = getBaseConfiguration();

        return new DefaultKafkaConsumerFactory<>(map, new StringDeserializer(),
                new JsonDeserializer<>(SubjectDto.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, SubjectDto> subjectListener() {
        ConcurrentKafkaListenerContainerFactory<String, SubjectDto>
                factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(subjectConsumer());
        return factory;
    }
}