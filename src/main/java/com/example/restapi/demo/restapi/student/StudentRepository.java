package com.example.restapi.demo.restapi.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        //Long refers to the type of the ID used in the Student model:
        extends JpaRepository<Student, Long> {

    @Query("SELECT s from Student s where s.email=?1")
    Optional<Student> findStudentByEmail(String email);

}
