package com.cromero.cruddemo.dao;

import com.cromero.cruddemo.entity.Course;
import com.cromero.cruddemo.entity.Instructor;
import com.cromero.cruddemo.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AppDaoImpl implements AppDao {

    private EntityManager em;

    @Autowired
    public AppDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public void save(Instructor instructor) {
        em.persist(instructor);
    }

    @Override
    public Instructor findInstructorById(Integer id) {
        return em.find(Instructor.class, id);
    }

    @Override
    public InstructorDetail findInstructorDetailById(Integer id) {
        return em.find(InstructorDetail.class, id);
    }

    @Override
    @Transactional
    public void deleteInstructorDetailById(Integer id) {
        InstructorDetail instructorDetail = em.find(InstructorDetail.class, id);
        instructorDetail.getInstructor().setInstructorDetail(null);
        em.remove(instructorDetail);
    }

    @Override
    public List<Course> findCoursesByInstructorId(Integer id) {
        TypedQuery<Course> query = em.createQuery("from Course where instructor.id = :id", Course.class);
        query.setParameter("id", id);
        return query.getResultList();
    }

    @Override
    public Instructor findCoursesByInstructorIdUsingJoinFetch(Integer id) {
        String queryStr =   "SELECT i FROM Instructor i " +
                            "JOIN FETCH i.courses " +
                            "JOIN FETCH i.instructorDetail " +
                            "WHERE i.id = :id";
        TypedQuery<Instructor> query = em.createQuery(queryStr, Instructor.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    @Transactional
    public void update(Instructor instructor) {
        em.merge(instructor);
    }

    @Override
    @Transactional
    public void update(Course course) {
        em.merge(course);
    }

    @Override
    public Course findCourseById(Integer id) {
        return em.find(Course.class, id);
    }

    @Override
    @Transactional
    public void deleteInstructorById(Integer id) {
        Instructor instructor = em.find(Instructor.class, id);
        List<Course> courses = instructor.getCourses();
        for (Course course : courses) {
            course.setInstructor(null);
        }
        em.remove(instructor);
    }

    @Override
    @Transactional
    public void deleteCourseById(Integer id) {
        Course course = em.find(Course.class, id);
        em.remove(course);
    }

}
