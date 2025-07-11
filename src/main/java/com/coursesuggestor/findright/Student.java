package com.coursesuggestor.findright;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
   @Id
   private int id;

   private String userName;
   private String email;
   private String password;

   @DocumentReference
   private List<Courses> favCourses;
}
