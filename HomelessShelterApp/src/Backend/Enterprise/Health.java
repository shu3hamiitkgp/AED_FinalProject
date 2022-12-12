/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;
import Backend.Organization.Counselling;
import Backend.Organization.Medical;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sahil
 */
public class Health extends Enterprise {
    List<Counselling> rehabs;
    List<Medical> hospitals;
    
    public Health(String name) {
        super(name, Enterprise.EnterpriseType.Health);
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

    public List<Counselling> addRehab(Counselling m){
        rehabs.add(m);
        return rehabs;
    }
    
    public List<Counselling> deleteRehab(Counselling m){
        rehabs.remove(m);
        return rehabs;
    }
    
    public List<Medical> addHospital(Medical m){
        hospitals.add(m);
        return hospitals;
    }
    
    public List<Medical> deleteHospital(Medical m){
        hospitals.remove(m);
        return hospitals;
    }
   
}
