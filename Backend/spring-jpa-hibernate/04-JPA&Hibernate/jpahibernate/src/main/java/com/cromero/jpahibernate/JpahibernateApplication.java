package com.cromero.jpahibernate;

import com.cromero.jpahibernate.entity.Course;
import com.cromero.jpahibernate.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpahibernateApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpahibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.playWithEntityManager();
	}
}
