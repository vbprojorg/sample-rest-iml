package com.myspring.sample.samplerestimpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping("/hello")
    public String greet(){
      return "Hello Worldd" ;
    }
}
