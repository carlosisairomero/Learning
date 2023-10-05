package com.cromero.cruddemo.dao;

import com.cromero.cruddemo.entity.Instructor;
import com.cromero.cruddemo.entity.InstructorDetail;

public interface AppDao {

    void save(Instructor instructor);
    Instructor findInstructorById(Integer id);

    void deleteInstructorById(Integer id);

}
