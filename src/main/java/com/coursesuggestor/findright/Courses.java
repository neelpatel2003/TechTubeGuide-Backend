package com.coursesuggestor.findright;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Courses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Courses {
   @Id
   @JsonProperty("_id")
   @Field("_id")
   private ObjectId id;

   @JsonProperty("courseID")
   @Field("courseID")
   private int courseId;

   @JsonProperty("courseName")
   @Field("courseName")
   private String courseName;

   @JsonProperty("channelName")
   @Field("channelName")
   private String channelName;

   @JsonProperty("courseURL")
   @Field("courseURL")
   private String videoURL;

   @JsonProperty("courseLanguages")
   @Field("courseLanguages")
   private List<String> courseLanguages;

   @JsonProperty("contentAvailable")
   @Field("contentAvailable")
   private List<String> contentAvailable;

   @JsonProperty("playlist")
   @Field("playlist")
   private boolean isPlaylist;

   @JsonProperty("oneShot")
   @Field("oneShot")
   private boolean isOneShot;

   @JsonProperty("lengthy")
   @Field("lengthy")
   private boolean isLengthy;

   @JsonProperty("rating")
   @Field("rating")
   private int rating;

   @JsonProperty("reviews")
   @Field("reviews")
   @DocumentReference
   private List<Review> reviews;
}
