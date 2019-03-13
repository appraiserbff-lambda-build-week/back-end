package com.appraiser.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class HouseController {
  // Question for future self:
  // should this be just house routes,
  // or should this handle the other requests too (as the FE specified early on)?
}
