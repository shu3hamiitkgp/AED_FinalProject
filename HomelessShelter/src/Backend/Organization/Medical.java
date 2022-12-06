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
public class Medical extends Organization{
    List<String> status;
    static String[] category = {"Agriculture","Information Technology", "Teaching" , "Construction" };
    int fees;
    boolean availability;
    String doctors;
    


    public Medical(String name) {
        super(name);
        status = new ArrayList<String>();
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

    public static String[] getcategory() {
        return category;
    }

    public static void setcategory(String[] category) {
        Jobs.category = category;
    }
    
    
    public boolean isdisabled() {
        return disabled;
    }

    public void setdisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public int isfees() {
        return fees;
    }

    public void setfees(int fees) {
        this.fees = fees;
    }



    public String getFType() {
        return type;
    }

    public void setFType(String type) {
        this.type = type;
    }
   
}
