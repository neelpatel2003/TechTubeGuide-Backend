package com.coursesuggestor.findright;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReviewRepository extends MongoRepository<Review,ObjectId>{
   Optional<Review> findReviewByUser(String userName);
}
