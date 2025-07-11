package com.coursesuggestor.findright;

import java.util.List;
import java.util.Map;
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
@RequestMapping("/review")
public class ReviewController {
   // @Autowired
   // private ReviewRepository reviewRepository;
   @Autowired
   private ReviewService reviewService;

   @PostMapping
   public ResponseEntity<Review> addReview(@RequestBody Map< String, String> payload) {
      System.out.println(payload.toString());
      return new ResponseEntity<Review>(reviewService.createReview(payload.get("Description"),payload.get("userName"),Integer.parseInt(payload.get("courseId"))),HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<List<Review>> getAllReviews() {
      return new ResponseEntity<List<Review>>(reviewService.allReviews(), HttpStatus.OK);
   }

   @GetMapping("/{userName}")
   public ResponseEntity<Optional<Review>> getReview(@PathVariable String userName) {
      System.out.println(userName);
      return new ResponseEntity<Optional<Review>>(reviewService.singleReview(userName), HttpStatus.OK);
   }
}
