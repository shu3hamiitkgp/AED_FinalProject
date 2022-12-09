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
