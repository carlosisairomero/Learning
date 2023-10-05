package com.cromero.cruddemo.dao;

import com.cromero.cruddemo.entity.Instructor;
import com.cromero.cruddemo.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public void deleteInstructorById(Integer id) {
        Instructor instructor = em.find(Instructor.class, id);
        em.remove(instructor);
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

}
