package com.ivonunes.playbalanced.dao;

import com.ivonunes.playbalanced.models.Team;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeamDAOImpl implements TeamDAO {

  EntityManager entityManager;

  @Autowired
  public TeamDAOImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  @Override
  public List<Team> findAll() {
    TypedQuery<Team> query = entityManager.createQuery("FROM Team", Team.class);
    return query.getResultList();
  }
}
