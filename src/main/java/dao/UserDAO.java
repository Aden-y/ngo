/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Model;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brenda Nyaswa
 */
public class UserDAO extends DAO {
    

    public UserDAO() {
        super();
    }
    @Override
    public void createTable() {
        Statement stmt = null;
        String sql = "CREATE TABLE IF NOT EXISTS users ( id INT(11) PRIMARY KEY AUTO_INCREMENT NOT NULL, firstname VARCHAR(25) NOT NULL, lastname VARCHAR(25) NOT NULL, contactno VARCHAR(20) NOT NULL, email VARCHAR(100) NOT NULL UNIQUE KEY, username VARCHAR(20) NOT NULL UNIQUE KEY, type ENUM('Admin', 'Donor', 'Employee', 'Government Apointee'), password VARCHAR(255) NOT NULL )";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void storeRecord(Model model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Model getRecord(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Model> getRecords() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateRecord(Model model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
