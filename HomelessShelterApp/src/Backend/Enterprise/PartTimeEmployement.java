/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

import Backend.Organization.Jobs;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sahil
 */
public class PartTimeEmployement extends Enterprise {
    List<Jobs> jobs;
    
    public PartTimeEmployement(String name) {
        super(name, Enterprise.EnterpriseType.PartTimeEmployement);
        jobs = new ArrayList<>();

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

}
