package com.backend.demo.Domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
@Entity
@Builder
public class Book {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer id;

      private String name;
      private String author;
      private double rating;
      private double cost;
      private String year;
      @Enumerated(value = EnumType.STRING)
      private Genre genre;
      private String authorEmail;
      @OneToMany(mappedBy = "book",fetch = FetchType.LAZY)
      @JsonIgnoreProperties("book")
      List<Review> reviewList;
//    public void setName(String name)
//    {
//        if(2==2)
//        {
//            throw new NullPointerException();
//        }
//    }

}
