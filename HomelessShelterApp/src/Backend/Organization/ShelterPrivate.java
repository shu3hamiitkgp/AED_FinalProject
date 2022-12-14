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
public class ShelterPrivate extends Organization {
    
//    private String name;
//    private String ShelterPrivate;
    private double capacity;
    private double volunteers;
//    private String gender;
    private String SpecialCategory;

    public ShelterPrivate(String name) {
        super(name);
//        this.name = name;
//        ShelterPrivate = name;
        
    }

//    

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(double volunteers) {
        this.volunteers = volunteers;
    }

    

    public String getSpecialCategory() {
        return SpecialCategory;
    }

    public void setSpecialCategory(String SpecialCategory) {
        this.SpecialCategory = SpecialCategory;
    }
    
}
