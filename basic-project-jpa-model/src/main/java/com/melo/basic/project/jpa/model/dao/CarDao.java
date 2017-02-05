package com.melo.basic.project.jpa.model.dao;

import com.melo.basic.project.jpa.model.entity.Car;
import java.util.List;

/**
 *
 * @author Yeison Melo <melo.yeison@gmail.com>
 * Intermediate interface to add specific methods for the car entity
 */
public interface CarDao extends GenericDao<Car, Integer> {

    List<Car> getCarsByColor(String color);

}
