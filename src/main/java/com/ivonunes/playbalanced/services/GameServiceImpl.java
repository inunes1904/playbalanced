package com.ivonunes.playbalanced.services;

import com.ivonunes.playbalanced.dao.GameDAO;
import com.ivonunes.playbalanced.models.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

  GameDAO gameDAO;

  @Autowired
  public GameServiceImpl(GameDAO gameDAO) {
    this.gameDAO = gameDAO;
  }



  @Override
  public List<Game> findAll() {
    return gameDAO.findAll();
  }
}
