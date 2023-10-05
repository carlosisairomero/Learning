package com.cromero.cruddemo.dao;

import com.cromero.cruddemo.entity.Course;
import com.cromero.cruddemo.entity.Instructor;
import com.cromero.cruddemo.entity.InstructorDetail;

import java.util.List;

public interface AppDao {

    void save(Instructor instructor);
    Instructor findInstructorById(Integer id);

    InstructorDetail findInstructorDetailById(Integer id);

    void deleteInstructorDetailById(Integer id);

    List<Course> findCoursesByInstructorId(Integer id);

    Instructor findCoursesByInstructorIdUsingJoinFetch(Integer id);

    void update(Instructor instructor);

    void update(Course course);

    Course findCourseById(Integer id);

    void deleteInstructorById(Integer id);

    void deleteCourseById(Integer id);

    void save(Course course);

    Course findCourseWithReviewsByCourseId(Integer id);

}
