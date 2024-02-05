package com.cromero.learnjpahibernate.springdatajpa;

import com.cromero.learnjpahibernate.entity.Course;
import com.cromero.learnjpahibernate.jpa.CourseJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJPACommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS", "in28minutes"));
        repository.save(new Course(2, "Learn AZURE", "in28minutes"));
        repository.save(new Course(3, "Learn GCP", "in28minutes"));
        repository.deleteById(3L);
        System.out.println(repository.findById(2L));
        // more methods
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByName("Learn AWS"));
    }
}







