package com.skim88.myblog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/home")
    public String getHome(){
        System.out.println("진입");
        return "Hello World!";
    }
}