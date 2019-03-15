package com.lambdaschool.javabookstore.repo;

import com.lambdaschool.javabookstore.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}