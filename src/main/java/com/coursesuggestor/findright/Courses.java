package com.coursesuggestor.findright;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Courses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Courses {
   @Id
   private ObjectId id;

   private String channelName;
   private List<String> contentAvailable;
   private boolean isPlaylist;
   private boolean isOneShot;
   private boolean isLengthy;
   private List<String> Programinglanguages;
   private List<String> courseLanguages;
   private int courseId;
   private String videoURL;
   @DocumentReference
   private List<Review> reviews;
}
