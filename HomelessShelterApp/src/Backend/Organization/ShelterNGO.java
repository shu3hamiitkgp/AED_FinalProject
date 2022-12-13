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
public class ShelterNGO extends Organization {
    
    private String name;
    private String ShelterNGO;
//    private double phone;
    private double volunteers;
    private String gender;
    private String SpecialCategory;
    

//    public double getPhone() {
//        return phone;
//    }
//
//    public void setPhone(double phone) {
//        this.phone = phone;
//    }

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
    public Type getType() {
        return Organization.Type.NGOShelter;
    } 
    
}
