package com.lambdaschool.javabookstore.model;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
@Table (name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private long userid;
    private String role;
    private String username;
    private String password;

    public User()
    {

    }

    public long getUserid()
    {
        return userid;
    }

    public void setUserid(long userid)
    {
        this.userid = userid;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public List<SimpleGrantedAuthority> getAuthority()
    {
        String myRole = "ROLE_" + this.role.toUpperCase();
        return Arrays.asList(new SimpleGrantedAuthority(myRole));
    }
}