package com.appraiser.controllers;

import com.appraiser.models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @PostMapping("register")
  public User registerUser(@RequestBody User user) {
    // register user in DB if valid, and then setId
    return user;
  }

  @PostMapping("login")
  public User loginUser(@RequestBody User user) {
    // login user in DB if valid, and then setId
    return user;
  }
}
