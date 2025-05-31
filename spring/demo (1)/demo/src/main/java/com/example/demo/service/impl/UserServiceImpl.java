// package com.example.demo.service.impl;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.demo.dto.UserDto;
// import com.example.demo.entity.UserEntity;
// import com.example.demo.repository.UserRepository;
// import com.example.demo.service.UserService;

// @Service
// public class UserServiceImpl implements UserService {

//     @Autowired
//     private UserRepository userRepository;

//     @Override
//     public UserDto createUser(UserDto user) {
//         UserEntity userEntity = new UserEntity();
//         userEntity.setName(user.getName());
//         userEntity.setEmail(user.getEmail());
//         userRepository.save(userEntity);
//         return user;
//     }

// }
