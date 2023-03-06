package com.example.restapi.demo.restapi.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository
        //Long refers to the type of the ID used in the Student model:
        extends JpaRepository<Student, Long> {

}
