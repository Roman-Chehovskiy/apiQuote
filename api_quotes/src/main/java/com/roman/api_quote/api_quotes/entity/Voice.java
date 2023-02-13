package com.roman.api_quote.api_quotes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
//    @Column(name = "quote_id")
//    private Long quoteId;
    @Column(name = "plus_voice")
    private Long plusVoice;
    @Column(name = "minus_voice")
    private Long minusVoice;
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "quote_id")
//    @JsonIgnoreProperties("voice")
//    private Quote quote;


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


//    public Long getQuoteId() {
//        return quoteId;
//    }
//
//    public void setQuoteId(Long quoteId) {
//        this.quoteId = quoteId;
//    }

//    public Quote getQuote() {
//        return quote;
//    }
//
//    public void setQuote(Quote quote) {
//        this.quote = quote;
//    }
}
