package com.cromero.learnjpahibernate.jpa;

import com.cromero.learnjpahibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJPACommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Learn AWS", "in28minutes"));
//        repository.insert(new Course(2, "Learn AZURE", "in28minutes"));
//        repository.insert(new Course(3, "Learn GCP", "in28minutes"));
//        repository.deleteById(3);
//        System.out.println(repository.findById(2));
    }
}






