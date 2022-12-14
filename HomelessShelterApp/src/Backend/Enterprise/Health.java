/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;
import Backend.Organization.Counselling;
import Backend.Organization.Donations;
import Backend.Organization.Meals;
import Backend.Organization.Medical;
import Backend.Organization.Organization;
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

    public Organization addHealth(Organization.Type type, String name,String address){        
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Counselling.getValue())) {
            organization = new Counselling(name);
            Counselling ngo = (Counselling) organization;
            rehabs.add(ngo);
            organization.setAddress(address);
        } else if (type.getValue().equals(Organization.Type.Medical.getValue())) {
            organization = new Medical(name);
            Medical company = (Medical) organization;
            hospitals.add(company);
            organization.setAddress(address);
        } 
        this.getOrganizationDirectory().getOrganizationList().add(organization);
        return organization;
    }
    
    
    
    
    public List<Counselling> deleteRehab(Counselling m){
        rehabs.remove(m);
        this.getOrganizationDirectory().getOrganizationList().remove(m);
        return rehabs;
    }

    public List<Medical> deleteHospital(Medical m){
        hospitals.remove(m);
        this.getOrganizationDirectory().getOrganizationList().remove(m);
        return hospitals;
    }
} 
