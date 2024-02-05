package com.cromero.learnjpahibernate.jdbc;

import com.cromero.learnjpahibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate spJdbcTemplate;
    private static String INSERT =
            """
                insert into course (id, name, author)
                values (?, ?, ?);
            """;

    private static String DELETE =
            """
                delete from course where id = ?
            """;

    private static String SELECT_QUERY =
            """
                select * from course where id = ?
            """;
    public void insert(Course course) {
        spJdbcTemplate.update(INSERT, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(long id) {
        spJdbcTemplate.update(DELETE, id);
    }

    public Course findById(long id) {
        return spJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
