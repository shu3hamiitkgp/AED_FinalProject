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
import javax.swing.JPanel;

/**
 *
 * @author shubhamgoyal
 */
public abstract class Role {
    
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        MealManager("MealManager"),
        ShelterManager("ShelterManager"),
        Volunteers("Volunteers"),
        HealthManagers("HealthManagers"),
        EmploymentManager("EmploymentManager"),
        HomelessUser("HomelessUser"),
        DonatorManager("DonatorManager"),
        GovernmentSupervisor("GovernmentSupervisor"),
        PrivateCompanySupervisor("PrivateCompanySupervisor"),
        NGOAdmin("NGOAdmin");
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
