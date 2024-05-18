package com.backend.demo.Service.resource;

import com.backend.demo.Domain.Book;
import com.backend.demo.Domain.Review;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ReviewRequest {

    @NotBlank(message = " comment cannot be blank")
    private String comment;
    @Min(value = 0, message = "rating cannot be less than zero")
    @Max(value = 5, message =  "rating cannot be more than five")
    private Double rating;
    @Min(value = 0,message = "bookId cannot be less than zero")
    private Integer bookId;

    public Review getReview()
    {
        return Review.builder().comment(this.comment).rating(this.rating).book(Book.builder().id(this.bookId).build()).build();
    }
}
