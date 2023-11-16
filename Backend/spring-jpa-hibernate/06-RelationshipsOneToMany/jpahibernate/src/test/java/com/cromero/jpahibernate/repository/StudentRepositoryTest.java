package com.cromero.jpahibernate.repository;

import com.cromero.jpahibernate.JpahibernateApplication;
import com.cromero.jpahibernate.entity.Course;
import com.cromero.jpahibernate.entity.Passport;
import com.cromero.jpahibernate.entity.Student;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest(classes = JpahibernateApplication.class)
class StudentRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentRepository repository;

	@Autowired
	EntityManager em;

	@Test
	@Transactional
	void test_severalTest() {
		Student student = em.find(Student.class, 20001L);
		Passport passport = student.getPassport();
		passport.setNumber("C555555 - updated");
		student.setName("Carlos - updated");
	}

	@Test
	@Transactional
	void test_findStudentAndPassportDetails() {
		Student student = em.find(Student.class, 20001L);
		logger.info("student -> {}", student);
		logger.info("password -> {}", student.getPassport());
	}

	@Test
	@Transactional
	void test_findPassportAndStudentDetails() {
		Passport passport = em.find(Passport.class, 40001L);
		logger.info("passport -> {}", passport);
		logger.info("student -> {}", passport.getStudent());
	}

	@Test
	@Transactional
	void test_findStudentAndCourses() {
		Student student = em.find(Student.class, 20001L);
		logger.info("student -> {}", student);
		logger.info("courses -> {}", student.getCourses());
	}

}
