/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.report;

import Models.Model;
import java.sql.Date;

/**
 *
 * @author Brenda Nyaswa
 */
public class Report extends Model{
    private int projectId;
    private Date date;
    private String name, description, remark;

    public int getProjectId() {
        return projectId;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRemark() {
        return remark;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    
}
