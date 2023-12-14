package com.ivonunes.playbalanced.models;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Game {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String gameDate;

  @OneToMany(mappedBy = "game")
  private List<Team> teams = new ArrayList<>();

  public Game() {
  }

  public Game(String gameDate, List<Team> teams) {
    this.gameDate = gameDate;
    this.teams = teams;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getGameDate() {
    return gameDate;
  }

  public void setGameDate(String gameDate) {
    this.gameDate = gameDate;
  }

  public List<Team> getTeams() {
    return teams;
  }

  public void setTeams(List<Team> teams) throws Exception {
    if (teams.size() == 2){
      this.teams = teams;
    }
    else throw new Exception("Only two teams Allowed per game");
  }
}
