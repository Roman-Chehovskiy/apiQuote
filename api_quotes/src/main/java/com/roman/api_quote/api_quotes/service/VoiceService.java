package com.roman.api_quote.api_quotes.service;

import com.roman.api_quote.api_quotes.entity.Voice;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VoiceService {

    List<Voice> getTopVoice();
    List<Voice> getOutsideVoice();

}
