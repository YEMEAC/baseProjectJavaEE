package com.melo.basic.project.jpa.model.dao.impl.hibernate;

import com.melo.basic.project.jpa.model.dao.CarDao;
import com.melo.basic.project.jpa.model.entity.Car;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
/**
 *
 * @author Yeison Melo <melo.yeison@gmail.com>
 */

@Service
public class CarDaoHibernateImple extends GenericDaoHibernateImple<Car, Integer> implements CarDao{
    
        public List<Car> getCarsByColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



