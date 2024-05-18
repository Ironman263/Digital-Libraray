package com.backend.demo;
import com.backend.demo.Domain.Book;
import com.backend.demo.Domain.Genre;
import com.backend.demo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


     @Autowired
	BookRepository bookRepository;
	public void run(String... args) throws Exception{

        Book book = new Book();
		book.setName("Sherlock Holmes2");
		book.setAuthor("Conan Doyle");
		book.setCost(200);
		book.setAuthorEmail("t@email.com");
		book.setGenre(Genre.THRILLER);
		book.setYear("1957");
		book.setRating(4.0);
//		bookRepository.save(book);
//        List<Book> bookList = bookRepository.findByAuthor("Conan Doyle");
//		System.out.println(bookList.size());
//		bookList = bookRepository.findByNameLike("Holmes");
//		System.out.println(bookList.size());
//		bookList = bookRepository.giveMeTopBooks(5);
//		System.out.println(bookList.size());

	}
}
