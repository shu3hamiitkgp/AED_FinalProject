/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author shubhamgoyal
 */
public class EnterpriseDirectory {
    
    Resources resources;
    Shelter shelters;
    Health hospitals;
    PartTimeEmployement jobs;

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public Shelter getShelters() {
        return shelters;
    }

    public void setShelters(Shelter shelters) {
        this.shelters = shelters;
    }

    public Health getHospitals() {
        return hospitals;
    }

    public void setHospitals(Health hospitals) {
        this.hospitals = hospitals;
    }

    public PartTimeEmployement getJobs() {
        return jobs;
    }

    public void setJobs(PartTimeEmployement jobs) {
        this.jobs = jobs;
    }
     
    public EnterpriseDirectory(){
        resources = new Resources("Resources");
        shelters = new Shelter("Shelters");
        hospitals = new Health("Hospitals");
        jobs = new PartTimeEmployement("Jobs");
        
    }
       
}
