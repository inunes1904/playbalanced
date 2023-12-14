package com.ivonunes.playbalanced.dao;

import com.ivonunes.playbalanced.models.Team;

import java.util.List;

public interface TeamDAO {
  List<Team> findAll();

}
