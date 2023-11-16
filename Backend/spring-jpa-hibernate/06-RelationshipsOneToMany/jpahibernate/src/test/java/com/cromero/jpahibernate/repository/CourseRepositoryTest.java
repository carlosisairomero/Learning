package com.cromero.jpahibernate.repository;

import com.cromero.jpahibernate.JpahibernateApplication;
import com.cromero.jpahibernate.entity.Course;
import com.cromero.jpahibernate.entity.Review;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Assertions;
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
class CourseRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository repository;

	@Autowired
	EntityManager em;

	@Test
	void test_findByIdBasic() {
		Course course = repository.findById(10001L);
		assertEquals("Course1", course.getName(), "Course's name don't match");
	}

	@Test
	@DirtiesContext
	void test_saveBasic() {
		Course course = new Course("Course111");
		repository.save(course);
		Course courseUpdated = repository.findById(1L);
		assertEquals("Course111", courseUpdated.getName(), "Course's name don't match");
	}

	@Test
	@DirtiesContext
	void test_updateBasic() {
		Course course = repository.findById(10001L);
		assertEquals("Course1", course.getName(), "Course's name don't match");
		course.setName("Course1 Updated");
		repository.save(course);
		Course courseUpdated = repository.findById(10001L);
		assertEquals("Course1 Updated", courseUpdated.getName(), "Course's name don't match");
	}

	@Test
	@DirtiesContext
	void test_deleteByIdBasic() {
		repository.deleteById(10002L);
		assertNull(repository.findById(10002L), "Should be null");
	}

	@Test
	@DirtiesContext
	void test_playWithEntityManager() {
		repository.playWithEntityManager();
	}

	@Test
	@Transactional
	@DirtiesContext
	void test_retrieveReviewsForCourse() {
		Course course = repository.findById(10001L);
		logger.info("{}", course.getReviews());
	}

	@Test
	@Transactional
	@DirtiesContext
	void test_retrieveCoursesForReview() {
		Review review = em.find(Review.class, 50001L);
		logger.info("{}", review.getCourse());
	}

}
