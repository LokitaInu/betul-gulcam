package edu.sabanciuniv.hw04.repository;

import edu.sabanciuniv.hw04.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, Integer>{

    @Query("select s from Student s where s.studentId =:studentId")
    Student findStudentById(Integer studentId);

}
