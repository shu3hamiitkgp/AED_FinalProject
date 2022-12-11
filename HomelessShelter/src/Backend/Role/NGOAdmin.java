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
import FrontEnd.ShelterNGO.NGOAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author shubhamgoyal
 */
public class NGOAdmin extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new NGOAdminWorkArea(userProcessContainer, account, organization, enterprise, network, business); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return (RoleType.NGOAdmin.getValue());
    }
    
}
