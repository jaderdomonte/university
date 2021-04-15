package com.montesan.university.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class UniversityRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityRegistrationApplication.class, args);
	}
}