package com.appraiser.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SanityController {
  @GetMapping("/")
  String works() {
    return "index";
  }
}
