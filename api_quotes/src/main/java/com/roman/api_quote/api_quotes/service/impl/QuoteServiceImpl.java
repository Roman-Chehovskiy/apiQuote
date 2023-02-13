package com.roman.api_quote.api_quotes.service.impl;

import com.roman.api_quote.api_quotes.entity.Quote;
import com.roman.api_quote.api_quotes.entity.Voice;
import com.roman.api_quote.api_quotes.repository.QuoteRepository;
import com.roman.api_quote.api_quotes.service.QuoteService;
import com.roman.api_quote.api_quotes.service.VoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class QuoteServiceImpl implements QuoteService {

    @Autowired
    QuoteRepository quoteRepository;

    @Autowired
    VoiceService voiceService;

    @Override
    public Quote createQuote(Quote quote) {
        Voice voice = new Voice();
        voice.setMinusVoice(0L);
        voice.setPlusVoice(0L);
        quote.setVoice(voice);
        quote.setDate(new Date());
        return quoteRepository.save(quote);
    }

    @Override
    public Quote updateQuote(Quote quote) {
        quote.setDate(new Date());
        return quoteRepository.save(quote);
    }

    @Override
    public void deleteQuote(Long id) {
        quoteRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Optional<Quote> getQuote(Long id) {
        return quoteRepository.findById(id);
    }

    @Override
    public Quote getRandomQuote() {
        Quote quote = quoteRepository.getRandomQuote();
        return quote;
    }

    @Override
    public Quote upratingQuote(Long id) {
        Quote quote = quoteRepository.findById(id).get();
        Voice voice = quote.getVoice();
        voice.setPlusVoice(voice.getPlusVoice() + 1);
        quote.setVoice(voice);
        return quoteRepository.save(quote);
    }

    @Override
    public Quote downgradeQuote(Long id) {
        Quote quote = quoteRepository.findById(id).get();
        Voice voice = quote.getVoice();
        voice.setPlusVoice(voice.getMinusVoice() - 1);
        quote.setVoice(voice);
        return quoteRepository.save(quote);
    }

    @Override
    public List<Quote> getTopQuote() {
        List<Quote> quotesResult = quoteRepository.findTopQuote();

        return quotesResult;
    }

    @Override
    public List<Quote> getOutsideQuote() {
        List<Quote> quotesResult = quoteRepository.findOutsideQuote();

        return quotesResult;
    }
}
