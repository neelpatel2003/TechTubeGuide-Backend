package com.coursesuggestor.findright;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {

   @Autowired
   StudentRepository studentRepository;
   public List<Student> allStudents(){
      return studentRepository.findAll();
   }
   public Optional<Student> singleStudent(String userName){
      return studentRepository.findStudentByuserName(userName); 
   }
}
