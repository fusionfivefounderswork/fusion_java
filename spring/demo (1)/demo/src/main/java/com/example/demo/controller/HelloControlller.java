package com.example.demo.controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.dto.UserDto;
// import com.example.demo.entity.UserEntity;
// import com.example.demo.service.UserService;

// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/sohel")
public class HelloControlller {

    // @Autowired
    // private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/byeee")
    public String hellod() {
        return "Hello, bye!";
    }

    // @PostMapping("/createUser")
    // public UserDto createUser(@RequestBody UserDto user) {

    //     return userService.createUser(user);

    //     // return entity;
    // }

}
