/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.schedule;

import Models.Model;
import java.util.List;

/**
 *
 * @author Brenda Nyaswa
 */
public class Schedule extends Model {
    private int projectId;
    private List<Activity> activities;

    public int getProjectId() {
        return projectId;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
    
    
    
}
