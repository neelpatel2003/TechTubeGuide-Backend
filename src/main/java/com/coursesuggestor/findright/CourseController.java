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
@RequestMapping("/courses")
public class CourseController {
   
   @Autowired
   private CourseRepository courseRepository;
   @Autowired
   private CourseService courseService;
   @PostMapping
   public ResponseEntity<?> addCourse(@RequestBody Courses course){
      Courses save=this.courseRepository.save(course);
      return ResponseEntity.ok(save);
   }

   @GetMapping
   public ResponseEntity<List<Courses>> getAllCourses(){
      return new ResponseEntity<List<Courses>>(courseService.allCourses(),HttpStatus.OK);
   }

   @GetMapping("/{id}")
   public ResponseEntity<Optional<Courses>> getCourse(@PathVariable int id){
      return new ResponseEntity<Optional<Courses>>(courseService.singleCourse(id),HttpStatus.OK);
   }
}
