package com.example.films.model;

import javax.persistence.*;

@Entity
public class show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Engine engine;

    @OneToOne
    private Game game;

    @OneToOne
    private Publisher publisher;

    public show() {
    }

    public show(com.example.films.model.Game game,com.example.films.model.Engine engine, com.example.films.model.Publisher publisher) {
        this.engine = engine;
        this.game = game;
        this.publisher= publisher;

    }

    public Long getId() {return id; }

    public void setId(Long id) { this.id = id; }

    public Engine getEngine() {return engine; }

    public void setEngine(Engine engine) { this.engine = engine; }

    public Game getGame() { return game;}

    public void setGame(Game game) { this.game = game; }

    public Publisher getPublisher() { return publisher; }

    public void setPublisher(Publisher publisher) { this.publisher = publisher; }

    @Override
    public String toString() {
        return "show{" +
                "id=" + id +
                ", engine=" + engine +
                ", game=" + game +
                ", publisher=" + publisher +
                '}';
    }
}
