/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Role;

import Backend.Ecosystem.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import FrontEnd.ShelterGovernment.GovtShelterWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author shubhamgoyal
 */
public class GovernmentSupervisor extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new GovtShelterWorkArea(userProcessContainer, account, organization, enterprise, network, business);
    }
     @Override
    public String toString(){
        return (RoleType.GovernmentSupervisor.getValue());
    }
    
}
