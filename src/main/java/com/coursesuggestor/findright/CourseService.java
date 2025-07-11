package com.coursesuggestor.findright;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
   @Autowired 
   private CourseRepository courseRepository;

   public List<Courses> allCourses(){
      return courseRepository.findAll();
   }
   
   public Optional<Courses> singleCourse(int id){
      return courseRepository.findCourseBycourseId(id); 
   }

}
