package com.example.films.model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String gameEngine;
    private String gameName;
    private String author;

@OneToOne
private Game game;

@OneToOne
private Publisher publisher;


    @OneToOne
private show show;

  //  @ManyToMany(mappedBy = "engines")
   // private Set<Game> games = new HashSet<>();
    @OneToOne
    private Engine engine;

    public Engine() {

    }

    public Engine(String name) {
        this.gameEngine = gameEngine;
    }

    public Engine(String gameEngine,String author) {
    this.gameEngine=gameEngine;
    this.author=author;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getGameEngine() {
        return gameEngine;
    }

    public void setGameEngine(String gameEngine) {
        this.gameEngine = gameEngine;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public com.example.films.model.show getShow() {
        return show;
    }

    public void setShow(com.example.films.model.show show) {
        this.show = show;
    }

    //    public Set<Game> getGames() {
//        return games;
//    }
//
//    public void setGames(Set<Game> games) {
//        this.games = games;
//    }

//    @Override
//    public String toString() {
//        return "Engine{" +
//                "Id=" + Id +
//                ", gameEngine='" + gameEngine + '\'' +
//                ", gameName='" + gameName + '\'' +
//                ", author='" + author + '\'' +
//                ", games=" + games +
//                '}';


    @Override
    public String toString() {
        return "Engine{" +
                "Id=" + Id +
                ", gameEngine='" + gameEngine + '\'' +
                ", gameName='" + gameName + '\'' +
                ", author='" + author + '\'' +
                ", game=" + game +
                ", publisher=" + publisher +
                ", show=" + show +
                ", engine=" + engine +
                '}';
    }
}


