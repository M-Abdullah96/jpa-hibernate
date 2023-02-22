package com.springboot.jpahibernate.springdatajpa;


import com.springboot.jpahibernate.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String auther);
    List<Course> findCourseByNameAndAuthor(String name, String author);

}
