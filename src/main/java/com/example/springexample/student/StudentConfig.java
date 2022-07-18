package com.example.springexample.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.AUGUST;
import static java.util.Calendar.JUNE;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mark_lee = new Student(
                    "Mark Lee",
                    "mark.lee@gmail.com",
                    LocalDate.of(1999, AUGUST, 2)
            );

            Student haechan_lee = new Student(
                    "Haechan Lee",
                    "haechan.lee@gmail.com",
                    LocalDate.of(2000, JUNE, 6)
            );

            studentRepository.saveAll(
                    List.of(mark_lee, haechan_lee)
            );
        };
    }
}
