package com.cromero.jpahibernate.repository;

import com.cromero.jpahibernate.JpahibernateApplication;
import com.cromero.jpahibernate.entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest(classes = JpahibernateApplication.class)
class JPQLTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	// we are retrieving a raw type (a simple List)
	@Test
	void test_JPQL_findById_Query() {
		Query query = em.createQuery("SELECT c FROM Course c");
		List courses = query.getResultList();
		logger.info("SELECT c FROM Course c -> {}", courses);
	}

	// we are retrieving a List<Course>
	@Test
	void test_JPQL_findById_Typed() {
		TypedQuery<Course> query = em.createQuery("SELECT c FROM Course c", Course.class);
		List<Course> courses = query.getResultList();
		logger.info("SELECT c FROM Course c -> {}", courses);
	}

	// we are retrieving a List<Course> by using where
	@Test
	void test_JPQL_findById_Where() {
		TypedQuery<Course> query = em.createQuery("SELECT c FROM Course c WHERE name like '%3%'", Course.class);
		List<Course> courses = query.getResultList();
		logger.info("SELECT c FROM Course c WHERE name like '%3%' -> {}", courses);
	}

	// NamedQueries
	@Test
	void test_JPQL_findById_NamedQuery() {
		Query query = em.createNamedQuery("get_all_courses");
		List courses = query.getResultList();
		logger.info("get_all_courses -> {}", courses);
		query = em.createNamedQuery("get_courses_like3");
		courses = query.getResultList();
		logger.info("get_courses_like3 -> {}", courses);

	}

}
