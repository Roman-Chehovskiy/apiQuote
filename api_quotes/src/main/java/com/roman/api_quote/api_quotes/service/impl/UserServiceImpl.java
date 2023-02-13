package com.roman.api_quote.api_quotes.service.impl;

import com.roman.api_quote.api_quotes.entity.User;
import com.roman.api_quote.api_quotes.repository.UserRepository;
import com.roman.api_quote.api_quotes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addNewUser(User user) {
        user.setDate(new Date());
        User newUser = userRepository.save(user);
        return newUser;
    }

    @Override
    public User getUser(String email) {
        User newUser = userRepository.findUserByEmail(email);
        return newUser;
    }

    @Override
    public User updateUser(User user) {
        User newUser = userRepository.save(user);
        return newUser;
    }

    @Override
    public void deleteUser(User user) {
            userRepository.deleteById(user.getEmail());
    }
}
