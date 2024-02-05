package com.cromero.learnjpahibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Learn AWS", "in28minutes"));
//        repository.insert(new Course(2, "Learn AZURE", "in28minutes"));
//        repository.insert(new Course(3, "Learn GCP", "in28minutes"));
//        repository.delete(3);
//        System.out.println(repository.findById(2));
    }
}






