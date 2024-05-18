package com.backend.demo.Repository;

import com.backend.demo.Domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findByName(String name);

    List<Book> findByAuthor(String name);

    List<Book> findByAuthorAndGenre(String author, String genre);

//    List<Book> findByAuthorGroupBy(String author, double rating);
//
//    List<Book> findByGenreSortByRating(String genre, Sort sort);

    Page<Book> findByRating(double rating, Pageable pageable);

    @Query("select book  from Book book where rating = ?1")   //jPQL
    List<Book> giveMeTopBooks(double rating);

    @Query(value = "select * from books where name like %?%", nativeQuery = true)
    List<Book> findByNameLike(String name);

}
