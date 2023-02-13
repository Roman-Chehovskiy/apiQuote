package com.roman.api_quote.api_quotes.service;

import com.roman.api_quote.api_quotes.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User addNewUser(User user);
    User getUser(String email);
    User updateUser(User User);
    void deleteUser(User user);
}
