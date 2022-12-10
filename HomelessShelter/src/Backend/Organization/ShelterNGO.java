/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Role.NGOAdmin;
import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shubhamgoyal
 */
public class ShelterNGO extends Organization {
    
    private String name;
    private String ShelterNGO;
    private double capacity;
    private double volunteers;
    private String gender;
    private String SpecialCategory;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecialCategory() {
        return SpecialCategory;
    }

    public void setSpecialCategory(String SpecialCategory) {
        this.SpecialCategory = SpecialCategory;
    }

    public ShelterNGO(String name) {
        super(name);
        this.name = name;
        ShelterNGO = name;
    }

    public String getShelterNGO() {
        return ShelterNGO;
    }

    public void setShelterNGO(String ShelterNGO) {
        this.ShelterNGO = ShelterNGO;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOAdmin());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.NGOShelter;
    } 
    
}
