package com.roman.api_quote.api_quotes.service.impl;

import com.roman.api_quote.api_quotes.entity.Voice;
import com.roman.api_quote.api_quotes.repository.VoiceRepository;
import com.roman.api_quote.api_quotes.service.VoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoiceServiceImpl implements VoiceService {

    @Autowired
    VoiceRepository voiceRepository;

    @Override
    public List<Voice> getTopVoice() {
        return voiceRepository.findTopVoice();
    }

    @Override
    public List<Voice> getOutsideVoice() {
        return voiceRepository.findOutsideVoice();
    }
}
