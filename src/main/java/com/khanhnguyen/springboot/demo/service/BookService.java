package com.khanhnguyen.springboot.demo.service;

import com.khanhnguyen.springboot.demo.model.Book;

import java.util.Optional;

public interface BookService {

    Iterable<Book> findAll();

    Book create(Book book);

    Optional<Book> find(String isbn);
}
