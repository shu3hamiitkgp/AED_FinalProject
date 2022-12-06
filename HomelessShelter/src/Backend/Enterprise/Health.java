/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;
import Backend.Organization.Counselling;
import Backend.Organization.Medical;
import Backend.Role.Role;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sahil
 */
public class Health extends Enterprise{
     
    //private String health;
    List<Counselling> rehabs;
    List<Medical> hospitals;
    
    public Health(String name, EnterpriseType type) {
        super(name, type);
        //health = name;
        rehabs = new ArrayList<>();
        hospitals = new ArrayList<>();
    }

    public List<Counselling> getRehabs() {
        return rehabs;
    }

    public void setRehabs(List<Counselling> rehabs) {
        this.rehabs = rehabs;
    }

    public List<Medical> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Medical> hospitals) {
        this.hospitals = hospitals;
    }
    
    public List<Counselling> addRehab(Counselling c){
        rehabs.add(c);
        return rehabs;
    }
    
    public List<Counselling> deleteRehab(Counselling c){
        rehabs.remove(c);
        return rehabs;
    }
    
    public List<Medical> addHospital(Medical c){
        hospitals.add(c);
        return hospitals;
    }
    
    public List<Medical> deleteHospital(Medical c){
        hospitals.remove(c);
        return hospitals;
    }
        

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
