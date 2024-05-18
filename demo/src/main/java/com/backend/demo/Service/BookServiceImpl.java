package com.backend.demo.Service;

import com.backend.demo.Domain.Book;
import com.backend.demo.Domain.Review;
import com.backend.demo.Repository.BookRepository;
import com.backend.demo.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class BookServiceImpl implements BookService{
//    Map<String,Book> bookMap = new HashMap<>();
    @Autowired
    BookRepository bookRepository;

    @Autowired
    ReviewRepository reviewRepository;
//    @Autowired
//    @Qualifier("mySQLConnection")
//    private Connection MySqlConnection;

//    @Autowired
//    @Qualifier("myOracleConnection")
//    private Connection MyOracleConnection;
    @Override
    public void addBook(Book book) {
//      Integer id  = new Random().nextInt(1,3);
//      book.setId(String.valueOf(id));
//      bookMap.put(book.getId(),book);
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(Integer bookId) {
      bookRepository.deleteById(bookId);
    }

    @Override
    public Book getBook(Integer id) {
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()) return book.get();
        else throw new IllegalArgumentException("Book Id does not exist");
    }

    @Override
    public Book updateBook(Integer id, Book book) {
       Optional<Book> optionalBook = bookRepository.findById(id);
       if(optionalBook.isPresent())
       {
           bookRepository.save(book);
       }
       return book;
    }

//    @Override
    public void addReview(String id, Review review) {
//       Book book =  bookMap.getOrDefault(id,null);
//       if(book!=null) {
//           book.getReviewList().add(review);
//       }
    }

    //Manual merging of entities
//    @Override
//    public List<BookResponse> getAllBooks() {
//       List<Book> books = bookRepository.findAll();
//       List<BookResponse> bookResponses = new ArrayList<>();
//       for(Book book : books)
//       {
//           List<Review> reviewList= reviewRepository.findByBookId(book.getId());
//           bookResponses.add(BookResponse.builder().name(book.getName()).
//                   author(book.getAuthor()).cost(book.getCost()).
//                   year(book.getYear()).genre(book.getGenre()).reviewList(reviewList).build());
//       }
//       return bookResponses;
//    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
