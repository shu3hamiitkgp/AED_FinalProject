/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Megha Patel
 */
public class Donations extends Organization {
    static String[] type = {"Clothes", "Hygiene", "Money"};
    String donationType;
    String audience;


    public Donations(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static String[] getDType() {
        return type;
    }


    public void setDonationType(String donationType) {
        this.donationType = donationType;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }
    
    
    
    
}
