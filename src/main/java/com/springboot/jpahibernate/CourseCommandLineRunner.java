package com.springboot.jpahibernate;

import com.springboot.jpahibernate.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.springboot.jpahibernate.Course;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
   /* @Autowired
    private CourseJpaRepository repository;

    @Autowired
    private CourseJdbcRepository repository;
*/
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
       /* repository.insert(new Course(1,"Learning","abdullah"));
        repository.insert(new Course(2,"Learning","abdullah"));
        repository.insert(new Course(3,"Learning","abdullah"));
        repository.insert(new Course(4,"Learning","abdullah"));
        repository.insert(new Course(5,"Learning","abdullah"));
        repository.insert(new Course(6,"Learning","abdullah"));
        repository.insert(new Course(7,"Learning","abdullah"));
        repository.insert(new Course(8,"Learning","abdullah"));

        repository.deleteCoursebyId(7);

        System.out.println(repository.findCoursebyId(1));
        System.out.println(repository.findCoursebyId(3));
        System.out.println(repository.findCoursebyId(5));*/


        repository.save(new Course(1,"Learning","abdullah"));
        repository.save(new Course(2,"Learning","abdullah"));
        repository.save(new Course(3,"Learning","abdullah"));
        repository.save(new Course(4,"Learning","abdullah"));
        repository.save(new Course(5,"Learning","abdullah"));
        repository.save(new Course(6,"book","abdullah"));
        repository.save(new Course(7,"Learning","abdullah"));
        repository.save(new Course(8,"Learning","abdullah"));

        repository.deleteById(7l);

        System.out.println(repository.findById(1l));
        //System.out.println(repository.findById(3l));
        //System.out.println(repository.findById(5l));
        System.out.println("Total number of course in the database is: "+repository.count());

        //shows all the record
        //System.out.println(repository.findAll());

        //find by author
        System.out.println(repository.findByAuthor("abdullah"));

        System.out.println(repository.findCourseByNameAndAuthor("book","abdullah"));




    }
}
