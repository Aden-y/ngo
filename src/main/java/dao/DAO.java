/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Model;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author User
 */
public abstract class DAO {
    protected String table;
    protected Connection con;
    
    /*
        Constructor 
        The constructor only initialises the connection
    */
    
    public DAO() {
        con = Database.connect();
    }
    
    /*
        Abstract methods to be implemented by child classes
    */
    public abstract void createTable();
    public abstract void storeRecord(Model model);
    public abstract Model getRecord(int id);
    public abstract List<Model> getRecords();
    public abstract void updateRecord(Model model);
    /*
        Implemented methods to be inherited
    */
    
    public void setTable(String table) {
        this.table = table;
    }

    public String getTable() {
        return table;
    }
    
    public boolean deleteRecord(Model m) {
        return false;
    }
    
    
}
