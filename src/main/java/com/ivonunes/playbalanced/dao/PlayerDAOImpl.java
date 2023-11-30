package com.ivonunes.playbalanced.dao;

import com.ivonunes.playbalanced.models.Player;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerDAOImpl implements PlayerDAO {

  EntityManager entityManager;

  @Autowired
  public PlayerDAOImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  @Override
  public List<Player> findAll() {
    TypedQuery<Player> query = entityManager.createQuery("FROM Player", Player.class);
    return query.getResultList();
  }
}
