package com.example.films.controllers;

import com.example.films.repositories.GameRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

    private GameRepository gameRepository;
    public GameController(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }
    @RequestMapping("/games")
    public String getGames(Model model)
    {
        model.addAttribute("games",gameRepository.findAll());

        return "games";

    }



}
