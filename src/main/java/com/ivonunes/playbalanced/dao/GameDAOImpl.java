package com.ivonunes.playbalanced.dao;

import com.ivonunes.playbalanced.models.Game;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GameDAOImpl implements GameDAO {

  EntityManager entityManager;

  @Autowired
  public GameDAOImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  @Override
  public List<Game> findAll(){
    TypedQuery<Game> query = entityManager.createQuery("FROM Game", Game.class);
    return query.getResultList();
  }

}
