package com.ivonunes.playbalanced.services;

import com.ivonunes.playbalanced.dao.PlayerDAO;
import com.ivonunes.playbalanced.models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{

  PlayerDAO playerDAO;

  @Autowired
  public PlayerServiceImpl(PlayerDAO playerDAO) {
    this.playerDAO = playerDAO;
  }

  @Override
  public List<Player> findAll() {
    return playerDAO.findAll();
  }
}
