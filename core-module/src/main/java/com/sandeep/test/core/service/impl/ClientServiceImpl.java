/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandeep.test.core.service.impl;

import com.sandeep.test.core.DAO.ClientDAO;
import com.sandeep.test.core.DAO.ClientDAOImpl;
import com.sandeep.test.core.entity.Client;
import com.sandeep.test.core.service.ClientService;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sandeepshrestha
 */
public class ClientServiceImpl implements ClientService{
    
    private ClientDAO clientDAO = new ClientDAOImpl();
    private List<Client> clients;
    @Override
    public List<Client> getAll() throws ClassNotFoundException, SQLException {
        if(clients == null){
            clients=clientDAO.getAll();
        }
        return clients;
    }
    
    
    
}
