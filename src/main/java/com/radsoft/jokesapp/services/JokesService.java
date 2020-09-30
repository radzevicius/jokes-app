package com.radsoft.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    String getRandomQuote(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
