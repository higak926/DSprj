package com.DSprj.DSprj002;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

  @GetMapping
  public String get() {
	return "Hello DSAplication!";
  }

}
