/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

//import Backend.Location.Location;
import Backend.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author shubhamgoyal
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

//    public Organization createOrganization(Type type, String name,String address) {
//        Organization organization = null;
//        if (type.getValue().equals(Type.Counselling.getValue())) {
//            organization = new Counselling(name);
//            organization.setAddress(address);
//            organizationList.add(organization);
//        } else if (type.getValue().equals(Type.Jobs.getValue())) {
//            organization = new Jobs(name);
//            Jobs job = (Jobs) organization;
//            //hospital.setHospital(name);
//            organization.setAddress(address);
//            organizationList.add(organization);
//        } else if (type.getValue().equals(Type.Meals.getValue())) {
//            organization = new Meals(name);
//            Meals meal = (Meals) organization;
//            organization.setAddress(address);
//            organizationList.add(organization);
//        } else if (type.getValue().equals(Type.NGOShelter.getValue())) {
//            organization = new ShelterNGO(name);
//            ShelterNGO ngo = (ShelterNGO) organization;
//            ngo.setShelterNGO(name);
//            organization.setAddress(address);
//            organizationList.add(organization);
//        } else if (type.getValue().equals(Type.PrivateShelter.getValue())) {
//            organization = new ShelterPrivate(name);
//            ShelterPrivate company = (ShelterPrivate) organization;
//            company.setShelterPrivate(name);
//            organization.setAddress(address);
//            organizationList.add(organization);
//        } else if (type.getValue().equals(Type.GovernmentShelter.getValue())) {
//            organization = new ShelterGovernment(name);
//            ShelterGovernment sheltergovt = (ShelterGovernment) organization;
//            sheltergovt.setShelterGovernment(name);
//            organization.setAddress(address);
//            organizationList.add(organization);
//        } else if (type.getValue().equals(Type.Donations.getValue())) {
//            organization = new Donations(name);
//            Donations donation = (Donations) organization;
//            organization.setAddress(address);
//            organizationList.add(organization);
//        } else if (type.getValue().equals(Type.Medical.getValue())) {
//            organization = new Medical(name);
////            Medical fireSafety = (Medical) organization;
//            //fireSafety.setFireSafety(name);
//            organization.setAddress(address);
//            organizationList.add(organization);
//        } 
//
//        return organization;
//    }
    
}
