package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class First {
	@Value("${message}")
	private String msg;
	
              @GetMapping("/abc")
              public String Hello()
              {
            	  return msg;
              }
}