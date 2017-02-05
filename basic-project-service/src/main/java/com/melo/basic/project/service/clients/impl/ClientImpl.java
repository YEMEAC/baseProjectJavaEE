package com.melo.basic.project.service.clients.impl;

import com.melo.basic.project.service.clients.Client;
import com.melo.basic.project.service.dtos.InputDTO;
import com.melo.basic.project.service.dtos.OutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import com.melo.basic.project.service.services.ServiceI;
import com.melo.basic.project.service.services.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yeison Melo <melo.yeison@gmail.com>
 */
@Service 
public class ClientImpl implements Client<ServiceI> {

    @Autowired
    //@Qualifier(ServiceImpl.BEAN_NAME)       
    ServiceI service;

    public OutputDTO getAll() {
        return service.getAll();
    }

    public OutputDTO getbyFilter(InputDTO input) {
        return service.getbyFilter(input);
    }

    public ServiceI getService() {
        return service;
    }

}
