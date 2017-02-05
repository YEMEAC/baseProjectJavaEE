package com.melo.basic.project.jpa.model.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public enum PersistenceManager {
  INSTANCE;
  private EntityManagerFactory emFactory;
  private PersistenceManager() {
    // "jpa-example" was the value of the name attribute of the
    // persistence-unit element.
    emFactory = Persistence.createEntityManagerFactory("basic_project_mysql_persistence_unit");
  }
  public EntityManager getEntityManager() {
    return emFactory.createEntityManager();
  }
  public void close() {
    emFactory.close();
  }
}