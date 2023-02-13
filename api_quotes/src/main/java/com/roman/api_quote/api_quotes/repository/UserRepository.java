package com.roman.api_quote.api_quotes.repository;

import com.roman.api_quote.api_quotes.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String > {

    User findUserByEmail(String email);
}
