/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

import Backend.Organization.Donations;
import Backend.Organization.Jobs;
import Backend.Organization.Meals;
import Backend.Organization.Organization;
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

    public Organization addJob(Organization.Type type, String name,String address){
        
        Organization organization = null;
        organization = new Jobs(name);
        Jobs ngo = (Jobs) organization;
        jobs.add(ngo);
        organization.setAddress(address);
        
        this.getOrganizationDirectory().getOrganizationList().add(organization);
        return organization;
    }
    
    public List<Jobs> deleteJobs(Jobs j){
        jobs.remove(j);
        this.getOrganizationDirectory().getOrganizationList().remove(j);
        return jobs;

}

}
