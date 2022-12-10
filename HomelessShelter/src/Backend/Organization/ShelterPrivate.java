/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Role.PrivateCompanySupervisor;
import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shubhamgoyal
 */
public class ShelterPrivate extends Organization {
    
    private String name;
    private String ShelterPrivate;

    public ShelterPrivate(String name) {
        super(name);
        this.name = name;
        ShelterPrivate = name;
    }

    public String getShelterPrivate() {
        return ShelterPrivate;
    }

    public void setShelterPrivate(String ShelterPrivate) {
        this.ShelterPrivate = ShelterPrivate;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles = new ArrayList();
        roles.add(new PrivateCompanySupervisor());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.PrivateShelter;
    } 
    
}
