package com.example.restapi.demo.restapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(

            StudentRepository repository){

                return args -> {
                    Student alfred = new Student(
                            "Alfred",
                            LocalDate.of(2000, Month.SEPTEMBER, 2),
                            "alfred@gmail.com"

                    );

                    Student john = new Student(
                            "John",
                            LocalDate.of(2001, Month.SEPTEMBER, 2),
                            "john@gmail.com"

                    );

                    repository.saveAll(
                            List.of(alfred, john)
                    );
                };
            }
}
