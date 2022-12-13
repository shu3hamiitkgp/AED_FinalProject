/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

import Backend.Organization.Organization;
import Backend.Organization.Organization.Type;
import Backend.Organization.ShelterGovernment;
import Backend.Organization.ShelterNGO;
import Backend.Organization.ShelterPrivate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shubhamgoyal
 */
public class Shelter extends Enterprise {
    
    List<ShelterGovernment> govShelters;
    List<ShelterNGO> ngoShelters;
    List<ShelterPrivate> privateShelters;
    
    public Shelter(String name) {
        super(name, Enterprise.EnterpriseType.Shelter);
        govShelters = new ArrayList<>();
        ngoShelters = new ArrayList<>();
        privateShelters = new ArrayList<>();
    }

    public List<ShelterGovernment> getGovShelters() {
        return govShelters;
    }

    public void setGovShelters(List<ShelterGovernment> govShelters) {
        this.govShelters = govShelters;
    }

    public List<ShelterNGO> getNgoShelters() {
        return ngoShelters;
    }

    public void setNgoShelters(List<ShelterNGO> ngoShelters) {
        this.ngoShelters = ngoShelters;
    }

    public List<ShelterPrivate> getPrivateShelters() {
        return privateShelters;
    }

    public void setPrivateShelters(List<ShelterPrivate> privateShelters) {
        this.privateShelters = privateShelters;
    }
    
    public Organization addShelter(Type type, String name,String address){
        
        Organization organization = null;
        if (type.getValue().equals(Type.NGOShelter.getValue())) {
            organization = new ShelterNGO(name);
            ShelterNGO ngo = (ShelterNGO) organization;
            ngoShelters.add(ngo);
            organization.setAddress(address);
        } else if (type.getValue().equals(Type.PrivateShelter.getValue())) {
            organization = new ShelterPrivate(name);
            ShelterPrivate company = (ShelterPrivate) organization;
            privateShelters.add(company);
            organization.setAddress(address);
        } else if (type.getValue().equals(Type.GovernmentShelter.getValue())) {
            organization = new ShelterGovernment(name);
            ShelterGovernment sheltergovt = (ShelterGovernment) organization;
            govShelters.add(sheltergovt);
            organization.setAddress(address);
        }
        this.getOrganizationDirectory().getOrganizationList().add(organization);
        return organization;
    }
    
    
    public List<ShelterGovernment> removeShelter(ShelterGovernment m){
        govShelters.remove(m);
        this.getOrganizationDirectory().getOrganizationList().remove(m);
        return govShelters;
    }
    
    public List<ShelterNGO> removeShelter(ShelterNGO m){
        ngoShelters.remove(m);
         this.getOrganizationDirectory().getOrganizationList().remove(m);
       return ngoShelters;
    }
    
    public List<ShelterPrivate> removeShelter(ShelterPrivate m){
        privateShelters.remove(m);
        this.getOrganizationDirectory().getOrganizationList().remove(m);
        return privateShelters;
    }
    
}
