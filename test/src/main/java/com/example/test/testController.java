package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome Kleo";
    }
}
