/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sahil
 */
public class Medical extends Organization{
    List<String> hospitalname;
    static String[] category = {"Orthopedian","General Practicioner", "Obstetricians", "Neurologists" };
    int fees;
    boolean availability;
    String doctors;
    String location;

    public Medical(String name) {
        super(name);
        hospitalname = new ArrayList<String>();
    }
    
    public List<String> gethospitalname() {
        return hospitalname;
    }

    public void sethospitalname(List<String> hospitalname) {
        this.hospitalname = hospitalname;
    }

    public static String[] getcategory() {
        return category;
    }

    public static void setcategory(String[] category) {
        Jobs.category = category;
    }
    
    
    public boolean isavailability() {
        return availability;
    }

    public void setavailability(boolean availability) {
        this.availability = availability;
    }

    public int isfees() {
        return fees;
    }

    public void setfees(int fees) {
        this.fees = fees;
    }



    public String getdoctors() {
        return doctors;
    }

    public void setdoctors(String doctors) {
        this.doctors = doctors;
    }
    
    public String getlocation() {
    return location;
    }

    public void setlocation(String location) {
    this.location = location;
    }
   
}
