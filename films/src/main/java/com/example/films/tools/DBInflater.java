package com.example.films.tools;

import com.example.films.model.*;
import com.example.films.repositories.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    public DBInflater(GameRepository gameRepository,EngineRepository engineRepository,PublisherRepository publisherRepository) {

        this.publisherRepository = publisherRepository;
        this.engineRepository = engineRepository;
        this.gameRepository = gameRepository;

    }
    private GameRepository gameRepository;
    private PublisherRepository publisherRepository;
    private EngineRepository engineRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {initData();}

    private void initData() {


        Publisher cdProject = new Publisher("CD Project");
        publisherRepository.save(cdProject);

        Publisher twokgame = new Publisher("2K Games");
        publisherRepository.save(twokgame);


        Engine REDengine = new Engine("REDengine","CD Project");
        engineRepository.save(REDengine);
        Engine UnrealEngine = new Engine("Unreal Engine","Tim Sweeney");
        engineRepository.save(UnrealEngine);


       Game Wiedzmin3 = new Game("The Witcher 3","RPG","Wiedzmin","PC/XBOX/PS",cdProject,REDengine);
        gameRepository.save(Wiedzmin3);
//        Wiedzmin3.getEngine().add(REDengine);
  //      gameRepository.save(Wiedzmin3);

        Game Bordelans = new Game("Borderlans 3","FPS","Border","PC/XBOX/PS",twokgame,UnrealEngine);
        gameRepository.save(Bordelans);
//        Bordelans.getEngine().add(UnrealEngine);
//        gameRepository.save(Bordelans);


    }

}
