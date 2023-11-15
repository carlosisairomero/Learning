package com.cromero.jpahibernate.repository;

import com.cromero.jpahibernate.entity.Course;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;

    public Course findById(Long id) {
        return em.find(Course.class, id);
    }

    public Course save(Course course) {
        if(course.getId() == null) {
            em.persist(course);
        } else {
            em.merge(course);
        }
        return course;
    }

    public void deleteById(Long id) {
        Course course = findById(id);
        em.remove(course);
    }

    public void playWithEntityManager() {
        Course course1 = new Course("Course111");
        em.persist(course1);
        // this line will update the course table because of the @Transactional
        course1.setName("Course111 - updated");

        Course course2 = new Course("Course222");
        em.persist(course2);
        em.flush();
        em.detach(course2);
        // this line will not update the course table because of em.detach(course2)
        course2.setName("Course222 - updated");

        Course course3 = new Course("Course333");
        em.persist(course3);
        em.flush();
        // this line will update the course table with "Course333 - updated"
        course3.setName("Course333 - updated");
        // but this one will get the previous "Course333" back
        em.refresh(course3);
        em.flush();

    }

}
