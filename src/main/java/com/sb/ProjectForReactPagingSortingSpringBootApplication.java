package com.sb;

import com.sb.model.Book;
import com.sb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectForReactPagingSortingSpringBootApplication implements CommandLineRunner {


    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjectForReactPagingSortingSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


//        for (int i = 0; i < 500; i++) {
//            Book book = new Book("Title" + (i + 1), "Author" + (i + 1));
//            bookRepository.save(book);
//        }


    }


}
