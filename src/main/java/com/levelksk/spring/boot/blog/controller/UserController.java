package com.levelksk.spring.boot.blog.controller;

import com.levelksk.spring.boot.blog.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return new User(id, "levelksk", "xulingfengcn@gmail.com");
    }
}
