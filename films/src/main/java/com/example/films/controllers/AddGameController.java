package com.example.films.controllers;


import com.example.films.model.Game;
import com.example.films.repositories.EngineRepository;
import com.example.films.repositories.GameRepository;
import com.example.films.repositories.PublisherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AddGameController {

    private GameRepository gameRepository;
    private EngineRepository engineRepository;
    private PublisherRepository publisherRepository;


    public AddGameController(GameRepository gameRepository ,EngineRepository engineRepository,PublisherRepository publisherRepository)
    {
        this.gameRepository=gameRepository;
        //this.engineRepository=engineRepository;
        //this.publisherRepository=publisherRepository;

    }

    @GetMapping("/games")
    public  String getGames(Model model){
        model.addAttribute("games", gameRepository.findAll());
        return "games";
    }



    @GetMapping("/addGames")
    public String clickAddGame(Model model){
        model.addAttribute("game", new Game());
        return "addGames";
    }

    @PostMapping("/addGames")
    public String formAddGame(Game game){
        gameRepository.save(game.getGame());
        engineRepository.save(game.getEngine());
        publisherRepository.save(game.getPublisher());
        return "result";
    }
}
