/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

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
    
    public List<ShelterGovernment> addShelter(ShelterGovernment m){
        govShelters.add(m);
        return govShelters;
    }
    
    public List<ShelterNGO> addShelter(ShelterNGO m){
        ngoShelters.add(m);
        return ngoShelters;
    }
    
    public List<ShelterPrivate> addShelter(ShelterPrivate m){
        privateShelters.add(m);
        return privateShelters;
    }
    
    public List<ShelterGovernment> removeShelter(ShelterGovernment m){
        govShelters.remove(m);
        return govShelters;
    }
    
    public List<ShelterNGO> removeShelter(ShelterNGO m){
        ngoShelters.remove(m);
        return ngoShelters;
    }
    
    public List<ShelterPrivate> removeShelter(ShelterPrivate m){
        privateShelters.remove(m);
        return privateShelters;
    }
    
}
