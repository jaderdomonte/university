package com.montesan.university.academic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class UniversityAcademicApplication {

    public static void main(String[] args) {

        SpringApplication.run(UniversityAcademicApplication.class, args);
    }
}