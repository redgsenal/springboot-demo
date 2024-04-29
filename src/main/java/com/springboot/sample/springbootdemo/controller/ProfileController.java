package com.springboot.sample.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sample.springbootdemo.model.Profile;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping("/{id}")
    public Profile getProfile(@PathVariable String id) {
        
        List<String> posts = Arrays.asList("post1", "post2", "post3");
        List<String> notifications = Arrays.asList("notification1", "notification2", "notification3");
        return new Profile(id, posts, notifications);
    }
}
