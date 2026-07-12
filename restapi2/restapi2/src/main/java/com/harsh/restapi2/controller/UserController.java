package com.harsh.restapi2.controller;


import com.harsh.restapi2.service.UserService;
import com.harsh.restapi2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService ;

    @GetMapping
    public List<User> getalluser(){
       return userService.getAll();
    }

    @PostMapping
    public  void createUser(@RequestBody User user) {
        userService.saveEntry(user);
    }
    @PutMapping("{username}")
    public  ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable String username){
        User user1 =userService.findByUserName(username);
        if(user1 !=null){
            user1.setUserName(user.getUserName());
            user1.setPassword(user.getPassword());
            userService.saveEntry(user1);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }



}
