package com.roman.api_quote.api_quotes.controller;


import com.roman.api_quote.api_quotes.entity.User;
import com.roman.api_quote.api_quotes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    UserService userService;


    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        User userResult = userService.addNewUser(user);
        return userResult;
    }

    @GetMapping("users/{email}")
    public User getUser(@PathVariable String email) {
        User userResult = userService.getUser(email);
        return userResult;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        User userResult = userService.updateUser(user);
        return userResult;
    }

    @DeleteMapping("/users")
    public void deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
    }


}
