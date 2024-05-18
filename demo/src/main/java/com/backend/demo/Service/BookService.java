package com.backend.demo.Service;

import com.backend.demo.Domain.Book;

import java.util.*;
public interface BookService {
    public void addBook(Book book);
    public void deleteBook(Integer bookId);
    public Book getBook(Integer id);
    public Book updateBook(Integer id, Book book);
//    public void addReview(String id, Review review);
    public List<Book> getAllBooks();

}
