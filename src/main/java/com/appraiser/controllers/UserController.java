package com.appraiser.controllers;

import com.appraiser.models.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
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
