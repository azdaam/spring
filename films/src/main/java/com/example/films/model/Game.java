package com.example.films.model;

import org.aspectj.weaver.ast.Test;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String gameName;
    private String Genres;
    private String series;
    private String platform;

    @ManyToOne
    private Publisher publisher;

//    @ManyToMany
//    private Set<Engine> engines = new HashSet<>();
    @OneToOne
    private Game game;
    @OneToOne
    private Engine engine;



    public Game() {

    }
    public Game(String gameName, String Genres , String series, String platform,Publisher publisher) {
        this.gameName = gameName;
        this.Genres = Genres;
        this.series = series;
        this.platform = platform;
        this.publisher = publisher;
    }
    public Game(String gameName, String Genres ,  String series ,String platform,Publisher publisher,Engine engine){
        this.gameName = gameName;
        this.Genres = Genres;
        this.series = series;
        this.platform = platform;
        this.publisher = publisher;
        this.engine  = engine;
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

//    public Set<Engine> getEngine() {
//        return engine;
//    }
//
//    public void setEngines(Set<Engine> engines) {
//        this.engine = engine;
//    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getGameName() {return gameName; }

    public void setGameName(String gameName) { this.gameName = gameName; }

    public String getGenres() { return Genres; }

    public void setGenres(String genres) {Genres = genres; }

    public String getSeries() {return series; }

    public void setSeries(String series) {this.series = series; }

    public String getPlatform() {return platform; }

    public void setPlatform(String platform) { this.platform = platform; }

    public Long getId() {return id; }

    public void setId(Long id) { this.id = id; }


    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", gameName='" + gameName + '\'' +
                ", Genres='" + Genres + '\'' +
                ", series='" + series + '\'' +
                ", platform='" + platform + '\'' +
                ", publisher=" + publisher +
                ", engine=" + engine +
                ", game=" + game +
                '}';
    }
}

