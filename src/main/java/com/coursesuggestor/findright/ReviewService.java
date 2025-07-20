package com.coursesuggestor.findright;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
   @Autowired
   private ReviewRepository reviewRepository;
   @Autowired
   private MongoTemplate mongoTemplate;
   @Autowired
   private CourseRepository courseRepository;

   public List<Review> allReviews() {
      return reviewRepository.findAll();
   }

   public Optional<Review> singleReview(String userName) {
      return reviewRepository.findReviewByUser(userName);
   }

   public Review createReview(String description, String userName, String courseName) {
      List<Courses> courses = courseRepository.findAllBychannelName(courseName);
      if (courses.isEmpty()) {
         throw new RuntimeException("Course not found: " + courseName);
      }
      int courseId = courses.get(0).getCourseId(); // Use the first match
      Review review = reviewRepository.insert(new Review(description, userName));
      mongoTemplate.update(Courses.class).matching(Criteria.where("courseId").is(courseId))
            .apply(new Update().push("reviews", review)).first();
      return review;
   }

}
