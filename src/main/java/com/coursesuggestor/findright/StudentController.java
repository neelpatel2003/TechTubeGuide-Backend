package com.coursesuggestor.findright;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class StudentController {
   @Autowired
   StudentRepository studentRepository;

   @Autowired
   StudentService studentService;

   @PostMapping
   public ResponseEntity<?> addUser(@RequestBody Student student){
      Student save=this.studentRepository.save(student);
      return ResponseEntity.ok(save);
   }
   @GetMapping
   public ResponseEntity<List<Student>> getAllStudents(){
      return new ResponseEntity<List<Student>>(studentService.allStudents(),HttpStatus.OK);
   }
   @GetMapping("/{userName}")
   public ResponseEntity<Optional<Student>> getStudent(@PathVariable String userName){
      return new ResponseEntity<Optional<Student>>(studentService.singleStudent(userName),HttpStatus.OK);
   }

}
