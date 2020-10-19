/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.budget;

import Models.Model;

/**
 *
 * @author Brenda Nyaswa
 * 
 */
public class Budget  extends Model{
    int projectId;
    double proposedAmount, allocatedAmount, actualAmount;

    public int getProjectId() {
        return projectId;
    }

    public double getProposedAmount() {
        return proposedAmount;
    }

    public double getAllocatedAmount() {
        return allocatedAmount;
    }

    public double getActualAmount() {
        return actualAmount;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setProposedAmount(double proposedAmount) {
        this.proposedAmount = proposedAmount;
    }

    public void setAllocatedAmount(double allocatedAmount) {
        this.allocatedAmount = allocatedAmount;
    }

    public void setActualAmount(double actualAmount) {
        this.actualAmount = actualAmount;
    }
    
    
    
}
