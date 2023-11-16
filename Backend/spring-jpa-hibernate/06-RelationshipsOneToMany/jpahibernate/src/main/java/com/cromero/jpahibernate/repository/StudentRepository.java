package com.cromero.jpahibernate.repository;

import com.cromero.jpahibernate.entity.Course;
import com.cromero.jpahibernate.entity.Passport;
import com.cromero.jpahibernate.entity.Student;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StudentRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;

    public Student findById(Long id) {
        return em.find(Student.class, id);
    }

    public Student save(Student student) {
        if(student.getId() == null) {
            em.persist(student);
        } else {
            em.merge(student);
        }
        return student;
    }

    public void saveStudentWithPassport() {
        Passport passport = new Passport("Y123456");
        em.persist(passport);
        Student student = new Student("Yesi", passport);
        em.persist(student);
    }

    public void deleteById(Long id) {
        Student student = findById(id);
        em.remove(student);
    }

    public void insertStudentAndCourseHardcoded() {
        Student student = new Student("Jack");
        Course course = new Course("Microservices");
        em.persist(student);
        em.persist(course);
        student.addCourse(course);
        course.addStudent(student);
        em.persist(student);
    }

    public void insertStudentAndCourse(Student student, Course course) {
        em.persist(student);
        em.persist(course);
        student.addCourse(course);
        course.addStudent(student);
        em.persist(student);
    }
}
