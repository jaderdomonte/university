package com.montesan.university.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableKafka
public class UniversityRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityRegistrationApplication.class, args);
	}
}