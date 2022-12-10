/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Role;

import Backend.Enterprise.Enterprise;
import Backend.Enterprise.Shelter;
import Backend.Network.Network;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author shubhamgoyal
 */
public class Volunteer extends Role {
    
    Shelter shelter;

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new VolunteerAreaJPanel(userProcessContainer, account, organization, enterprise, network, business);
    }
     @Override
    public String toString(){
        return (RoleType.Volunteers.getValue());
    }
    
}
