package com.melo.basic.project.service.dtos;

import com.melo.basic.project.jpa.model.entity.Car;
import com.melo.basic.project.jpa.model.entity.Driver;
import java.util.List;

/**
 *
 * @author Yeison Melo <melo.yeison@gmail.com>
 */
public class OutputDTO {
    
    List<Car> cars;
    List<Driver> drivers;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }
    
}
