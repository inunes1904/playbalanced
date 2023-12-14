package com.ivonunes.playbalanced.services;

import com.ivonunes.playbalanced.dao.TeamDAO;
import com.ivonunes.playbalanced.models.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService{

  TeamDAO teamDAO;

  @Autowired
  public TeamServiceImpl(TeamDAO teamDAO) {
    this.teamDAO = teamDAO;
  }

  @Override
  public List<Team> findAll() {
    return teamDAO.findAll();
  }
}
