package com.appraiser.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SanityController {
  @RequestMapping("")
  public String works() {
    return "index";
  }
}
