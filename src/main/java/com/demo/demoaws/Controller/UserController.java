package com.demo.demoaws.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("name")
    public String home(){
        return "Hi, my name is daniell";
    }
    @GetMapping("me")
    public String other() {
        return "Hi, my name is jorge";
    }
}
