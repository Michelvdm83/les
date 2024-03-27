package com.example.les;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring";
    }

    @GetMapping("/bye")
    public String bye(){
        return "Goodbye";
    }
}
