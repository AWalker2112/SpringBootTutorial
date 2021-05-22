package com.aw.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student alex = new Student(

					"Alex", 20, LocalDate.of(2020, 01, 01), "alex@gmail.com"

			);
			Student henry = new Student(

					"Henry", 20, LocalDate.of(2020, 01, 01), "henry@gmail.com"

			);
			repository.saveAll(List.of(alex, henry));
		};
	}
}
