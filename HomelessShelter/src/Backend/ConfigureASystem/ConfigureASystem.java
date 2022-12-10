/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.ConfigureASystem;

import Backend.Ecosystem.EcoSystem;
import Backend.Employee.Employee;
import Backend.Role.SystemAdminRole;
import Backend.UserAccount.UserAccount;

/**
 *
 * @author Sahil
 */
public class ConfigureASystem {
        
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
        //End of constructor
    }
}
