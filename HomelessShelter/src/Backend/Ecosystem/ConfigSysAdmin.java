/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Ecosystem;

import Backend.Employee.Employee;
import Backend.Role.SystemAdminRole;
import Backend.UserAccount.UserAccount;

/**
 *
 * @author shubhamgoyal
 */
public class ConfigSysAdmin {
    
    public static EcoSystem configure(){ 
       
        EcoSystem system = EcoSystem.getInstance();
        
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
        //End of constructor
    }
    
}
