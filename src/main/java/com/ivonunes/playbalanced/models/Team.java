package com.ivonunes.playbalanced.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int id;

  private String name;

  @ManyToMany
  @JoinTable(
    name="team_players",
    joinColumns = @JoinColumn(name="team_id"),
    inverseJoinColumns = @JoinColumn(name="player_id")
  )
  private List<Player> players = new ArrayList<>();

  @ManyToOne
  @JoinColumn(name="game_id")
  private Game game;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Player> getPlayers() {
    return players;
  }

  public void setPlayers(List<Player> players) {
    this.players = players;
  }

  public Game getGame() {
    return game;
  }

  public void setGame(Game game) {
    this.game = game;
  }
}
