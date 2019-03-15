package com.lambdaschool.javabookstore.repo;

import com.lambdaschool.javabookstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long>
{
    User findByUsername(String username);
}
