package com.example.films.controllers;

import com.example.films.repositories.EngineRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EngineController {

    private EngineRepository engineRepository;

    public EngineController(EngineRepository engineRepository) {
        this.engineRepository = engineRepository;
    }

    @RequestMapping("/engines")
    public String getActors(Model model) {

        model.addAttribute( "engines",engineRepository.findAll());

        return "engines";
    }
}
