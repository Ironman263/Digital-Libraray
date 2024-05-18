package com.backend.demo.Controller;
import com.backend.demo.Domain.Book;
import com.backend.demo.Domain.Review;
import com.backend.demo.Service.BookService;
import com.backend.demo.Service.resource.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.*;

@RestController

public class UserController {
    @Autowired
    BookService bookService;
    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") Integer id)
    {
        return new ResponseEntity<>(bookService.getBook(id), HttpStatus.OK);
    }
    @GetMapping("/book")
    public ResponseEntity<List<Book>> getAllBooks()
    {
        return new ResponseEntity<>(bookService.getAllBooks(),HttpStatus.OK);
    }
//    @PostMapping("{bookId}/review")
//    public ResponseEntity<Book> addReview(@PathVariable("bookId") String bookId, @RequestBody Review review)
//    {
//        bookService.addReview(bookId,review);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
}
