package com.sb.service;

import com.sb.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

// BookService.java (Service)

public interface BookService {
    Page<Book> getBooks(Pageable pageable);

}
