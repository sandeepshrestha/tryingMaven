/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandeep.test.core.service;

import com.sandeep.test.core.entity.Client;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sandeepshrestha
 */
public interface ClientService {
    List<Client> getAll() throws ClassNotFoundException, SQLException; 
}
