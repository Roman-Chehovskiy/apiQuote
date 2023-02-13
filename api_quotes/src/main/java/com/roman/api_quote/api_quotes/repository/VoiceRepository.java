package com.roman.api_quote.api_quotes.repository;

import com.roman.api_quote.api_quotes.entity.Voice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VoiceRepository extends JpaRepository<Voice, Long> {

    @Query(value = "select * from voices order by (plus_voice - minus_voice) desc limit 10", nativeQuery = true)
    List<Voice> findTopVoice();

    @Query(value = "select * from voices order by (plus_voice - minus_voice) asc limit 10", nativeQuery = true)
    List<Voice> findOutsideVoice();

}
