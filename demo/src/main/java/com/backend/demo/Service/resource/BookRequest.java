package com.backend.demo.Service.resource;

import com.backend.demo.Domain.Book;
import com.backend.demo.Domain.Genre;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
    private String id;
    @NotBlank(message = "title cannot be blank")
    private String name;
    @NotBlank(message = "Author cannot be blank")
    private String author;
    private Genre genre;
    @Min(value = 0, message = "cost cannot be less than 0")
    private Double cost;

    public Book getBook()
    {
        return Book.builder().name(this.name).author(this.author).
                genre(this.genre).rating(0.0).cost(this.cost).build();
    }
}
