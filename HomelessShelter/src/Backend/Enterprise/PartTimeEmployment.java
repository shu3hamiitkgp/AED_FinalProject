/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

import Backend.Organization.Jobs;
import Backend.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sahil
 */
public class PartTimeEmployment extends Enterprise {
    List<Jobs> jobs;
    
public PartTimeEmployment(String name, EnterpriseType type) {
super(name, type);
jobs = new ArrayList<Jobs>();

    }

public List<Jobs> getJobs() {
        return jobs;
    }

    public void setJobs(List<Jobs> Jobs) {
        this.jobs = jobs;
    }

        public List<Jobs> addJobs(Jobs j){
        jobs.add(j);
        return jobs;
    }
    
    public List<Jobs> deleteJobs(Jobs j){
        jobs.remove(j);
        return jobs;

}

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
