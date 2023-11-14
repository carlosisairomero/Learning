package com.cromero.fromjdbctojpa;

import com.cromero.fromjdbctojpa.entity.Person;
import com.cromero.fromjdbctojpa.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class FromjdbctojpaApplication implements CommandLineRunner {

	@Autowired
	private PersonJpaRepository repository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(FromjdbctojpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", repository.findAll());
		logger.info("User id 10001 -> {}", repository.findById(10001));
		logger.info("Inserting 10004 -> No of Rows Inserted - {}", repository.insert(
				new Person(10004, "Tara", "Paris", new Date())));
		logger.info("Updating 10003 -> No of Rows Updated - {}", repository.update(
				new Person(10003, "Updated", "Updated", new Date())));
		logger.info("Deleting 10002");
		repository.deleteById(10002);
	}

}
