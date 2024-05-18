package com.backend.demo.Service;

import com.backend.demo.Domain.Book;
import com.backend.demo.Domain.Review;
import com.backend.demo.Repository.BookRepository;
import com.backend.demo.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    BookRepository bookRepository;
    @Override
    public void addReview(Review review) {

        Optional<Book> optionalBook = bookRepository.findById(review.getBook().getId());
        if(optionalBook.isPresent()) {
            review.setBook(optionalBook.get());
            reviewRepository.save(review);
        }
        else throw new IllegalArgumentException("Book Id does not exist");
    }
}
