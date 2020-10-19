/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.user;

import Models.Model;

/**
 *
 * @author Brenda Nyaswa
 */
public abstract class User  extends Model{
    private int userId;
    private String 
            firstName,
            lastName,
            email,
            type,
            contactNo,
            usersame,
            password;
    /*
        Getter methods,
        Return the attibute values for this model
    */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getType() {
        return type;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getUsername() {
        return usersame;
    }

    public String getPassword() {
        return password;
    }
    

    public int getUserId() {
        return userId;
    }
    
    /*
        Setter methods,
        The methods sets the values for the various attirbutes
    */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setUsername(String usersame) {
        this.usersame = usersame;
    }

    public void setPassword(String password) {
        this.password = password;
    }           
}
