package com.roman.api_quote.api_quotes.service;

import com.roman.api_quote.api_quotes.entity.Quote;

import java.util.List;
import java.util.Optional;

public interface QuoteService {

    Quote createQuote(Quote quote);
    Quote updateQuote(Quote quote);
    void deleteQuote(Long id);
    Optional<Quote> getQuote(Long id);
    Quote getRandomQuote();
    Quote upratingQuote(Long id);
    Quote downgradeQuote(Long id);
    List<Quote> getTopQuote();
    List<Quote> getOutsideQuote();

}
