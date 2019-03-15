package com.lambdaschool.javabookstore.repo;

import com.lambdaschool.javabookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainsIgnoreCase(String name);
}