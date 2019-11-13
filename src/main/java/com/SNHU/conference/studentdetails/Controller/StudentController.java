package com.SNHU.conference.studentdetails.Controller;

import com.SNHU.conference.studentdetails.Repositary.StudentRepository;
import com.SNHU.conference.studentdetails.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/isRunning")
    public ResponseEntity<?> isRunning() {
        return ResponseEntity.ok("Running");
    }
    @PostMapping("/newStudent")
    public ResponseEntity<?> newStudent(Student student){
        repository.save(student);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @GetMapping("/getAllStudentDetails")
    public ResponseEntity<?> getAllStudentDetails(){
        return ResponseEntity.ok( repository.findAll());
    }

}
