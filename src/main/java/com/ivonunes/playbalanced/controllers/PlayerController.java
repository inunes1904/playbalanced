package com.ivonunes.playbalanced.controllers;

import com.ivonunes.playbalanced.models.Player;
import com.ivonunes.playbalanced.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

  PlayerService playerService;

  @Autowired
  public PlayerController(PlayerService playerService) {
    this.playerService = playerService;
  }

  @GetMapping("/player")
  public List<Player> allPlayers(){
    return playerService.findAll();
  }

}
