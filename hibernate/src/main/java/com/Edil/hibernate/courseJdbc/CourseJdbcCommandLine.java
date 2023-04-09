package com.Edil.hibernate.courseJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLine implements CommandLineRunner {
    @Autowired
    private courseJdbcRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.insert();


    };



}
