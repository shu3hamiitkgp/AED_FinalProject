/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sahil
 */
public class Jobs extends Organization{
    List<String> services;
    static String[] types = {"Remote", "On-Site", "Hybrid"};
    static String[] category = {"Agriculture","Information Technology", "Teaching" , "Construction" };
    int salary;
    boolean disabled;
    String type;
    


    public Jobs(String name) {
        super(name);
        services = new ArrayList<String>();
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public static String[] getTypes() {
        return types;
    }

    public static void setTypes(String[] types) {
        Jobs.types = types;
    }

    public boolean isdisabled() {
        return disabled;
    }

    public void setdisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public int issalary() {
        return salary;
    }

    public void setsalary(int salary) {
        this.salary = salary;
    }



    public String getFType() {
        return type;
    }

    public void setFType(String type) {
        this.type = type;
    }
   
}
