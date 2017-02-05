package com.melo.basic.project.jpa.model.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Yeison Melo <melo.yeison@gmail.com>
 * @param <C> entity type
 * @param <I> class' identifier type Generic class for, DAO pattern to data
 * acces: esier to migrate, data acces abstraction and centralization.
 */
public interface GenericDao<C extends Serializable, I> {

    public C getById(I id);

    public List<C> getAll();

    public void delete(C entity);
    
    public C create(C entity);
    
    public C update(C entity);

}
