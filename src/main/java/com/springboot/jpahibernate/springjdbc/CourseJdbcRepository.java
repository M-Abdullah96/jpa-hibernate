package com.springboot.jpahibernate.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository //this means this class will talk to database
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    //three dots means it is a text block
    private static String INSERT_QUERY=
            """
            insert into course(id, name, author)
            values(?,?,?);
            """;
    private static String Delete_Query=
            """
            delete from course where id =?
            """;
    private static String SelectById_Query=
            """
            select * from course where id =?
            """;

    public void insert(Course course){
        //update method could be used to insert, update and delete
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }
    public void deleteCoursebyId(long id){
        //update method could be used to insert, update and delete
        springJdbcTemplate.update(Delete_Query,id);
    }

    public Course findCoursebyId(long id){
        //ResultSet-> Bean => Row Mapper =>
        return springJdbcTemplate.queryForObject(SelectById_Query,new BeanPropertyRowMapper<>(Course.class),id);
    }

}
