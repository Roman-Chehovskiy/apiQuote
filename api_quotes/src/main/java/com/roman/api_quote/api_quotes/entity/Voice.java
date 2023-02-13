package com.roman.api_quote.api_quotes.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "voices")
public class Voice {

    @Id
    @GenericGenerator(name = "increment", strategy = "increment")
    @GeneratedValue(generator = "increment")
    @Column(name = "id")
    private Long id;
    @Column(name = "plus_voice")
    private Long plusVoice;
    @Column(name = "minus_voice")
    private Long minusVoice;



    public Voice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlusVoice() {
        return plusVoice;
    }

    public void setPlusVoice(Long plusVoice) {
        this.plusVoice = plusVoice;
    }

    public Long getMinusVoice() {
        return minusVoice;
    }

    public void setMinusVoice(Long minusVoice) {
        this.minusVoice = minusVoice;
    }



}
