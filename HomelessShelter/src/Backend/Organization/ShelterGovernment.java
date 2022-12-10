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
public class ShelterGovernment extends Organization {
    
    private String name;
    private String ShelterGovernment;

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
