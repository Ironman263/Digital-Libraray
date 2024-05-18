package com.backend.demo.Service.resource;

import com.backend.demo.Domain.Genre;
import com.backend.demo.Domain.Review;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponse {

   private String name;
   private String author;
   List<Review> reviewList;
   private double rating;
   private double cost;
   private Genre genre;
   private String year;

}
