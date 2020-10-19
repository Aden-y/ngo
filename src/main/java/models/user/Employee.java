/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.user;
import Models.user.User;
import java.sql.Date;
/**
 *
 * @author Branda Nyaswa
 */
public class Employee  extends User{
    private int idNumber;
    private Date dob;
    
    private String title,
            facility;

    public int getIdNumber() {
        return idNumber;
    }

    public Date getDob() {
        return dob;
    }

    public String getTitle() {
        return title;
    }

    public String getFacility() {
        return facility;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }
    
    
}
