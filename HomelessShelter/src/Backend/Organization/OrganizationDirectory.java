/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Location.Location;
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

    public Organization createOrganization(Type type, String name, Location locationPoint) {
        Organization organization = null;
        if (type.getValue().equals(Type.Counselling.getValue())) {
            organization = new Counselling(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Jobs.getValue())) {
            organization = new Jobs(name);
            Jobs hospital = (Jobs) organization;
            //hospital.setHospital(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Meals.getValue())) {
            organization = new Meals(name);
            Meals personal = (Meals) organization;
            //personal.setVolunteerPersonal(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.NGO.getValue())) {
            organization = new VolunteerNGOOrganization(name);
            VolunteerNGOOrganization ngo = (VolunteerNGOOrganization) organization;
            ngo.setVolunteerNGO(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Company.getValue())) {
            organization = new VolunteerCompanyOrganization(name);
            VolunteerCompanyOrganization company = (VolunteerCompanyOrganization) organization;
            company.setVolunteerCompany(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Medical.getValue())) {
            organization = new Medical(name);
            Medical fireSafety = (Medical) organization;
            //fireSafety.setFireSafety(name);
            organization.setLocationPoint(locationPoint);
            organizationList.add(organization);
        } 

        return organization;
    }
    
}
