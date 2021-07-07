package com.lambdaschool.javabookstore.Service.impl;

import com.lambdaschool.javabookstore.model.User;
import com.lambdaschool.javabookstore.repo.UserRepo;
import com.lambdaschool.javabookstore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService
{

    @Autowired
    private UserRepo userRepo;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        User user = userRepo.findByUsername(username);
        if (user == null)
        {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getAuthority());
    }

    public List<User> findAll()
    {
        List<User> list = new ArrayList<>();
        userRepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public void delete(long id)
    {
        userRepo.deleteById(id);
    }

    @Override
    public User save(User user)
    {
        return userRepo.save(user);
    }
}