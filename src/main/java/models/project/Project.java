/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.project;

import Models.Model;

/**
 *
 * @author Brenda Nyaswa
 */
public class Project extends Model {
    private String name, county, subcounty, ward, location, status, description;
    private int managerId;

    public String getName() {
        return name;
    }

    public String getCounty() {
        return county;
    }

    public String getSubcounty() {
        return subcounty;
    }

    public String getWard() {
        return ward;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setSubcounty(String subcounty) {
        this.subcounty = subcounty;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }
    
    
}
