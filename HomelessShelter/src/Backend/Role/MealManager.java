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
import FrontEnd.Resources.MealsViewjPanel;
import javax.swing.JPanel;

/**
 *
 * @author Megha Patel
 */
public class MealManager extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        System.out.println(userProcessContainer.getComponents());
        return new MealsViewjPanel(userProcessContainer, account, organization, enterprise, network, business);    }
    
}
