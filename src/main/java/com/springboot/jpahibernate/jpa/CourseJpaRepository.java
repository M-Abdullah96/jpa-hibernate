package com.springboot.jpahibernate.jpa;

import com.springboot.jpahibernate.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }
    public Course findCoursebyId (long id){
        return entityManager.find(Course.class, id);
    }

    public void deleteCoursebyId(int id) {
        Course course=entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

}
