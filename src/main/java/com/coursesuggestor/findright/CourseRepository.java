package com.coursesuggestor.findright;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<Courses, ObjectId> {
   Optional<Courses> findCourseBycourseId(int courseId);

   List<Courses> findAllBychannelName(String channelName);
}
