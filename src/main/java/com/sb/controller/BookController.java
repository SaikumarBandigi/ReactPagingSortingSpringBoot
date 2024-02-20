package com.sb.controller;

import com.sb.model.Book;
import com.sb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// BookController.java (Controller)

@CrossOrigin("*")
@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<Page<Book>> getBooks(Pageable pageable) {
        Page<Book> books = bookService.getBooks(pageable);
        return ResponseEntity.ok(books);
    }




}
