/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Role.GovernmentSupervisor;
import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shubhamgoyal
 */
public class ShleterGovernment extends Organization {
    
    private String name;
    private String ShleterGovernment;

    public ShleterGovernment(String name) {
        super(name);
        this.name = name;
        ShleterGovernment = name;
    }

    public String getShleterGovernment() {
        return ShleterGovernment;
    }

    public void setShleterGovernment(String ShelterPrivate) {
        this.ShleterGovernment = ShelterPrivate;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentSupervisor());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.GovernmentShelter;
    } 
    
}
