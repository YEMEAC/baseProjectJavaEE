package com.melo.basic.project.jpa.model.dao.impl.hibernate;

import com.melo.basic.project.jpa.model.dao.DriverDao;
import com.melo.basic.project.jpa.model.entity.Driver;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yeison Melo <melo.yeison@gmail.com>
 */
@Repository()
public class DriverDaoHibernateImple extends GenericDaoHibernateImple<Driver, Integer> implements DriverDao {

    public static final String BEAN_NAME = "driverDaoHibernateImple";
	
    public List<Driver> getDriversBy(String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
