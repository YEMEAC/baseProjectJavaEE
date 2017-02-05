package com.melo.basic.project.jpa.model.dao;

import com.melo.basic.project.jpa.model.entity.Driver;
import java.util.List;

/**
 *
 * @author Yeison Melo <melo.yeison@gmail.com>
 * Intermediate interface to add specific methods for the driver entity Espefic
 * implementation of the Driver entity for Hibernate
 */
public interface DriverDao extends GenericDao<Driver, Integer> {

    List<Driver> getDriversBy(String color);

}
