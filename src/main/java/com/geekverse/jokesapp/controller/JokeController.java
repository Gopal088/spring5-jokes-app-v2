package com.geekverse.jokesapp.controller;

import com.geekverse.jokesapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeOfDay;

    @Autowired
    public JokeController(JokeService jokeOfDay) {
        this.jokeOfDay = jokeOfDay;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model) {
        String joke = jokeOfDay.getJoke();
        System.out.println("Joke : "+joke);
        model.addAttribute("joke",joke);
        return "index";
    }
}
