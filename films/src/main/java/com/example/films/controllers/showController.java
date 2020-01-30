package com.example.films.controllers;


import com.example.films.repositories.showRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class showController {

    private showRepository  showRepository;

    public  showController(showRepository showRepository)
    {
        this.showRepository = showRepository;

    }
    @RequestMapping("/shows")
    public  String getShow (Model model)
    {
        model.addAttribute("shows",showRepository.findAll());
        return  "shows";
    }

}
