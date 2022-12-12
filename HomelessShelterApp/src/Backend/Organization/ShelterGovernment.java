/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import java.util.ArrayList;

/**
 *
 * @author shubhamgoyal
 */
public class ShelterGovernment extends Organization {
    
    private String name;
    private String ShelterGovernment;
    private double capacity;
    private double volunteers;
    private String gender;
    private String SpecialCategory;
    
    
    public ShelterGovernment(String name) {
        super(name);
        this.name = name;
        ShelterGovernment = name;
    }

    public String getShelterGovernment() {
        return ShelterGovernment;
    }

    public void setShelterGovernment(String ShelterPrivate) {
        this.ShelterGovernment = ShelterPrivate;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolunteers() {
        return volunteers;
    }

    public String getGender() {
        return gender;
    }

    public String getSpecialCategory() {
        return SpecialCategory;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setVolunteers(double volunteers) {
        this.volunteers = volunteers;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSpecialCategory(String SpecialCategory) {
        this.SpecialCategory = SpecialCategory;
    }
    
       @Override
    public Type getType() {
        return Organization.Type.GovernmentShelter;
    } 
    
}
