package com.khanhnguyen.springboot.demo;

import com.khanhnguyen.springboot.demo.model.Book;
import com.khanhnguyen.springboot.demo.service.BookService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }


    @Bean
    public ApplicationRunner booksInitializer(BookService bookService){
        return args -> {
            bookService.create(new Book("1", "Book 1", "Bruce"));
            bookService.create(new Book("2", "Book 2", "George"));
            bookService.create(new Book("3", "Book 3", "Tom"));
        };
    }

}
