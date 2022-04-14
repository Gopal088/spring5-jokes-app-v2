package com.geekverse.jokesapp.serviceimpl;

import com.geekverse.jokesapp.service.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes cnq;

    public JokeServiceImpl() {
        cnq = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return cnq.getRandomQuote();
    }
}
