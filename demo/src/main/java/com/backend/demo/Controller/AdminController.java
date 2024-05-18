package com.backend.demo.Controller;

import com.backend.demo.Domain.Book;
import com.backend.demo.Service.BookService;
import com.backend.demo.Service.resource.BookRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
//     @Autowired
//     BookService bookService;
    BookService bookService;
//    @Autowired
//    public AdminController(BookService bookService)
//    {
//        this.bookService = bookService;
//    }
    @Autowired
    public void setBookService(BookService bookService)
    {
        this.bookService = bookService;
    }
     @PostMapping("/admin/book")
    public ResponseEntity<Book> createBook(@RequestBody @Valid BookRequest bookRequest)
     {
         bookService.addBook(bookRequest.getBook());
         return new ResponseEntity<>(HttpStatus.CREATED);
     }
     @DeleteMapping("/admin/book")
    public ResponseEntity<Book> deleteBook(@RequestParam("bookId") Integer id)
     {
         bookService.deleteBook(id);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
     }
     @PutMapping("/admin/book")
    public ResponseEntity<Book> updateBook(@RequestParam("bookId") Integer id, @RequestBody Book book)
     {
        return new ResponseEntity<>(bookService.updateBook(id,book),HttpStatus.OK);

     }

}
