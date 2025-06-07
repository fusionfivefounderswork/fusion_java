package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    
    private static final Logger logger = LoggerFactory.getLogger(HelloControlller.class);
    @GetMapping("/hello")
    public String hello() {
        System.out.println("Entry inside hello wih SYSOUT");
        logger.info("Entry inside /sohel/hello endpoint");
        
        return "Hello, World!";
    }

    @GetMapping("/byeee")
    public String hellod() {
        System.out.println("Entry inside BYeee wih SYSOUT");
        logger.info("Entry inside /sohel/Byeee endpoint");
        return "Hello, bye!";
    }

    // @PostMapping("/createUser")
    // public UserDto createUser(@RequestBody UserDto user) {

    //     return userService.createUser(user);

    //     // return entity;
    // }

}
