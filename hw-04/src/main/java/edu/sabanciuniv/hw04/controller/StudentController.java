package edu.sabanciuniv.hw04.controller;

import edu.sabanciuniv.hw04.model.Student;
import edu.sabanciuniv.hw04.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
@Autowired
    private StudentService studentService;


    @GetMapping("/studentx")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("/studentx")
    public Student addNewStudent(@RequestBody Student student){
        return studentService.addNewStudent(student);
    }

    @PutMapping("/studentx")
    public Student updateExistingStudent(@RequestBody Student student){
        return studentService.updateExistingStudent(student);
    }

    @DeleteMapping("/studentx")
    public void deleteExistingStudent(@RequestBody Student student){
        studentService.deleteExistingStudent(student);
    }

    @GetMapping("/studentx/{studentId}")
    public List<Student> getAllStudentIdofStudent(@PathVariable Integer studentId ){
        return studentService.findStudentById(studentId);
    }


}
