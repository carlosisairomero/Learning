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
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest(classes = JpahibernateApplication.class)
class NativeQueriesTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	// NativeQueries

	@Test
	void test_JPQL_NativeQuery() {
		Query query = em.createNativeQuery("SELECT * FROM COURSE", Course.class);
		List courses = query.getResultList();
		logger.info("SELECT * FROM COURSE -> {}", courses);
	}

	@Test
	void test_JPQL_NativeQuery_Parameters() {
		Query query = em.createNativeQuery("SELECT * FROM COURSE WHERE ID = ?", Course.class);
		query.setParameter(1, 10001L);
		List courses = query.getResultList();
		logger.info("SELECT * FROM COURSE WHERE ID = ?-> {}", courses);
	}

	@Test
	void test_JPQL_NativeQuery_NamedParameters() {
		Query query = em.createNativeQuery("SELECT * FROM COURSE WHERE ID = :id", Course.class);
		query.setParameter("id", 10002L);
		List courses = query.getResultList();
		logger.info("SELECT * FROM COURSE WHERE ID = ?-> {}", courses);
	}

	@Test
	@Transactional
	void test_JPQL_NativeQuery_ToUpdate() {
		Query query = em.createNativeQuery("UPDATE COURSE SET UPDATED_DATE=NULL", Course.class);
		int rowsUpdated = query.executeUpdate();
		logger.info("Number of rows updated-> {}", rowsUpdated);
	}

}
