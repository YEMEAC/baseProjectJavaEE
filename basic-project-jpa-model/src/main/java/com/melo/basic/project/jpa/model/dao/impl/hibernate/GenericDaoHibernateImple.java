/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.melo.basic.project.jpa.model.dao.impl.hibernate;

import com.melo.basic.project.jpa.model.dao.GenericDao;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * @author Yeison Melo <melo.yeison@gmail.com>
 *
 * @param <CC> entity type
 * @param <II> class' identifier type Hibernate implementation for the generic
 * methods of entities. With this class we avoid to duplicate the code for the
 * general methods in each specific hibernate DAO. Generic class with parameters
 * II and CC replacing C and I from GenericDao
 */
public class GenericDaoHibernateImple <CC extends Serializable, II> implements GenericDao<CC, II> {

    /*Inject the entitymanager*/
    private static final String PROJECT_PERSISTENCE_UNIT = "basic_project_mysql_persistence_unit";
    @PersistenceContext(unitName = PROJECT_PERSISTENCE_UNIT)
    protected EntityManager entityManager;

    /*java reflection - Dinamic call class in runing time*/
    protected Class<CC> entityClass;

    @Override
    public List<CC> getAll() {
        Query query = entityManager.createNamedQuery("SELECT c FROM CAR c");
        return query.getResultList();
    }

    @Override
    public CC getById(II id) {
        return entityManager.find(entityClass, id);
    }

    @Override
    public void delete(CC entity) {
        entityManager.remove(entity);
    }

    @Override
    public CC create(CC entity) {
       entityManager.persist(entity);
       return entity;
    }

    @Override
    public CC update(CC entity) {
        return this.entityManager.merge(entity);
    }
}

