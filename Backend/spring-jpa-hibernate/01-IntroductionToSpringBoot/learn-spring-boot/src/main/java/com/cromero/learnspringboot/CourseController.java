package com.cromero.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> findAllCourses() {
        return Arrays.asList(
                new Course(1L, "Learn AWS", "in 4 hours"),
                new Course(2L, "Learn DevOps", "in 4 hours"),
                new Course(3L, "Learn Azure", "in 4 hours")
        );
    }
}
