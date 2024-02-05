package com.cromero.learnjpahibernate.jpa;

import com.cromero.learnjpahibernate.entity.Course;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseJPARepository {

    @Autowired
    private EntityManager em;

    public void insert(Course course) {
        em.merge(course);
    }

    public Course findById(long id) {
        return em.find(Course.class, id);
    }

    public void deleteById(long id) {
        Course course = em.find(Course.class, id);
        em.remove(course);
    }
}
