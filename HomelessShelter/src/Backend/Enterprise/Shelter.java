/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shubhamgoyal
 */
public class Shelter extends Enterprise {
    
    public Shelter(String name) {
        super(name, Enterprise.EnterpriseType.Shelter);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
