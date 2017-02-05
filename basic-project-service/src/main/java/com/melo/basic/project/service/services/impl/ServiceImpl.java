package com.melo.basic.project.service.services.impl;

import com.melo.basic.project.jpa.model.dao.CarDao;
import com.melo.basic.project.jpa.model.dao.DriverDao;
import com.melo.basic.project.service.dtos.InputDTO;
import com.melo.basic.project.service.dtos.OutputDTO;
import com.melo.basic.project.service.services.ServiceI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yeison Melo <melo.yeison@gmail.com>
 */
@Service
public class ServiceImpl implements ServiceI {

    public static final String BEAN_NAME = "serviceImpl";
     
    @Autowired
    CarDao carDao;
    
    @Autowired
    //@Qualifier(DriverDao.BEAN_NAME)
    DriverDao driverDao;
            
    public OutputDTO getAll() {
        OutputDTO put = new OutputDTO();
        put.setCars(carDao.getAll());
        put.setDrivers(driverDao.getAll());
        return put;
    }

    public OutputDTO getbyFilter(InputDTO input) {
        return new OutputDTO();
    }
    
}
