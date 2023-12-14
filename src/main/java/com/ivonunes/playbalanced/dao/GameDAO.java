package com.ivonunes.playbalanced.dao;

import com.ivonunes.playbalanced.models.Game;

import java.util.List;

public interface GameDAO {

  List<Game> findAll();

}
