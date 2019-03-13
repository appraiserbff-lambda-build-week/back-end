package com.appraiser.controllers;

import com.appraiser.models.User;
import com.appraiser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
  @Autowired
  UserRepository repository;

  // TO DO: returns JWT
  @PostMapping("register")
  public User registerUser(@RequestBody User user) {
    return repository.save(user);
  }

  // TO DO: returns JWT
  @PostMapping("login")
  public User loginUser(@RequestBody User user) {
    // login user in DB if valid, and then setId
    return user;
  }
}
