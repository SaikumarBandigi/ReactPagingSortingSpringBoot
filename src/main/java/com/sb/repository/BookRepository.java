package com.sb.repository;

import com.sb.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// BookRepository.java (Repository)
public interface BookRepository extends JpaRepository<Book, Long> {

}
