package com.roman.api_quote.api_quotes.controller;


import com.roman.api_quote.api_quotes.entity.Quote;
import com.roman.api_quote.api_quotes.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuotesController {

    @Autowired
    QuoteService quoteService;

    @PostMapping("/quotes")
    public Quote addNewQuote(@RequestBody Quote quote) {
        Quote newQuote = quoteService.createQuote(quote);
        return newQuote;
    }

    @PutMapping("/quotes")
    public Quote updateQuote(@RequestBody Quote quote) {
        Quote updateQuote = quoteService.updateQuote(quote);
        return updateQuote;
    }

    @DeleteMapping("/quotes/{id}")
    public void deleteQuote(@PathVariable("id") Long id) {
        quoteService.deleteQuote(id);
    }

    @GetMapping("/quotes/{id}")
    public Quote getQuote(@PathVariable Long id) {
        Quote newQuote = (quoteService.getQuote(id)).get();
        return newQuote;
    }

    @GetMapping("/quotes/random")
    public Quote getRandomQuote() {
        Quote newQuote = quoteService.getRandomQuote();
        return newQuote;
    }

    @GetMapping("/quotes/top")
    public List<Quote> getTopQuote() {
        List<Quote> topQuotes = quoteService.getTopQuote();
        return topQuotes;
    }

    @GetMapping("/quotes/outside")
    public List<Quote> getOutsideQuote() {
        List<Quote> outsideQuotes = quoteService.getOutsideQuote();
        return outsideQuotes;
    }

    @PutMapping("/quotes/uprating/{id}")
    public Quote upratingQuote(@PathVariable("id") Long id) {
        Quote responseQuote = quoteService.upratingQuote(id);
        return responseQuote;
    }

    @PutMapping("/quotes/downgrade/{id}")
    public Quote downgradeQuote(@PathVariable("id") Long id) {
        Quote responseQuote = quoteService.downgradeQuote(id);
        return responseQuote;
    }



  }
