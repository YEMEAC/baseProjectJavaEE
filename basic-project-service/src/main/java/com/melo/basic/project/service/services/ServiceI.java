/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.melo.basic.project.service.services;

import com.melo.basic.project.service.dtos.InputDTO;
import com.melo.basic.project.service.dtos.OutputDTO;

/**
 *
 * @author Yeison Melo <melo.yeison@gmail.com>
 */
public interface ServiceI {
    
    public OutputDTO getAll();
    public OutputDTO getbyFilter(InputDTO input);
}
