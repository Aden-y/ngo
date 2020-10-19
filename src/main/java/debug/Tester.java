/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debug;

import DAO.UserDAO;

/**
 *
 * @author Brenda Nyaswa
 */
public class Tester {
    public static void main(String[] args) {
        //Testing User model
        UserDAO uDAO = new UserDAO();
        uDAO.createTable();
        System.out.println("I love Brenda");
    }
}
