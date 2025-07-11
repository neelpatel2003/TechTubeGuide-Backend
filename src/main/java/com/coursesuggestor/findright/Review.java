package com.coursesuggestor.findright;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Reviews")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
   @Id
   private ObjectId id;
   private String description;
   private String user;
   public Review(String description,String user) {
      this.description = description;
      this.user = user;
   }
}
