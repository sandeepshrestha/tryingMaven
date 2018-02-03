/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandeep.test.core.DAO;

import com.sandeep.test.core.constant.DbConstant;
import com.sandeep.test.core.constant.SqlConstant;
import com.sandeep.test.core.entity.Client;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sandeepshrestha
 */
public class ClientDAOImpl implements ClientDAO {

    @Override
    public List<Client> getAll() throws ClassNotFoundException, SQLException {
        List<Client> clients=new ArrayList<>();
        Class.forName(DbConstant.DRIVER_NAME);
        Connection conn=DriverManager.
                getConnection(DbConstant.DB_URL,
                        DbConstant.DB_USERNAME,
                        DbConstant.DB_PASSWORD);
        PreparedStatement stmt=conn.prepareStatement(SqlConstant.CLIENT_GETALL);
        ResultSet rs=stmt.executeQuery();
        while (rs.next()){
            Client client=new Client();
            client.setId(rs.getInt("id"));
            client.setName(rs.getString("client_name"));
            client.setEmail(rs.getString("email"));
            client.setContactNo(rs.getString("contact_no"));
            client.setAddedDate(rs.getDate("added_date"));
            client.setModifiedDate(rs.getDate("modified_date"));
            client.setStatus(rs.getBoolean("status"));
            clients.add(client);
        }
        return null;
    }
    
}
