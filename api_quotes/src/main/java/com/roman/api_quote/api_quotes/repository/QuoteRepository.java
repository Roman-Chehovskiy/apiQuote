package com.roman.api_quote.api_quotes.repository;

import com.roman.api_quote.api_quotes.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

    @Query(value = "select * from quotes order by random() limit 1", nativeQuery = true)
    Quote getRandomQuote();

    @Query(value = "select quotes.id, quotes.voice_id, quotes.user_email, quotes.quote, quotes.date from quotes join voices on quotes.voice_id = voices.id order by (plus_voice - minus_voice) desc limit 10", nativeQuery = true)
    List<Quote> findTopQuote();

    @Query(value = "select quotes.id, quotes.voice_id, quotes.user_email, quotes.quote, quotes.date from quotes join voices on quotes.voice_id = voices.id order by (plus_voice - minus_voice) asc limit 10", nativeQuery = true)
    List<Quote> findOutsideQuote();
}
