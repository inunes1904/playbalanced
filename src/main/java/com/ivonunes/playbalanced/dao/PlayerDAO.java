package com.ivonunes.playbalanced.dao;

import com.ivonunes.playbalanced.models.Player;

import java.util.List;

public interface PlayerDAO {
  List<Player> findAll();
}
