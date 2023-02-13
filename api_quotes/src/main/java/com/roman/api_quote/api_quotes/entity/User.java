package com.roman.api_quote.api_quotes.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "users")
public class User {

    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Id
    @Column(name = "email")
    private String email;
    @Column(name = "date")
    private Date date;
//    @OneToMany
//   // @JoinColumn(name = "user_email")
//    private List<Quote> quotes;

    public User() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    public List<Quote> getQuotes() {
//        return quotes;
//    }
//
//    public void setQuotes(List<Quote> quotes) {
//        this.quotes = quotes;
//    }
}
