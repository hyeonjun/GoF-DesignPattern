package com.design.pattern.StructuralPatterns.adapter._03_java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController { // handler

  @GetMapping("/hello")
  public String hello() {
    return "hi";
  }

}
