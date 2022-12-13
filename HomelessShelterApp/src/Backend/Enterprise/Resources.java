/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

import Backend.Organization.Donations;
import Backend.Organization.Meals;
import Backend.Organization.Organization;
import Backend.Organization.ShelterGovernment;
import Backend.Organization.ShelterNGO;
import Backend.Organization.ShelterPrivate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Megha Patel
 */
public class Resources extends Enterprise {
    List<Meals> meals;
    List<Donations> donations;

    public Resources(String name) {
        super(name,Enterprise.EnterpriseType.Resources);
        meals = new ArrayList<Meals>();
        donations = new ArrayList<Donations>();
    }

    public List<Meals> getMeals() {
        return meals;
    }

    public void setMeals(List<Meals> meals) {
        this.meals = meals;
    }

    public List<Donations> getDonations() {
        return donations;
    }

    public void setDonations(List<Donations> donations) {
        this.donations = donations;
    }

    public List<Meals> addMeal(Meals m){
        meals.add(m);
        this.getOrganizationDirectory().getOrganizationList().add(m);
        return meals;
    }
    
    public List<Meals> deleteMeal(Meals m){
        meals.remove(m);
        this.getOrganizationDirectory().getOrganizationList().remove(m);
        return meals;
    }
    
    public Organization addResources(Organization.Type type, String name,String address){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Meals.getValue())) {
            organization = new Meals(name);
            Meals ngo = (Meals) organization;
            meals.add(ngo);
            organization.setAddress(address);
        } else if (type.getValue().equals(Organization.Type.Donations.getValue())) {
            organization = new Donations(name);
            Donations company = (Donations) organization;
            donations.add(company);
            organization.setAddress(address);
        } 
        this.getOrganizationDirectory().getOrganizationList().add(organization);
        return organization;
    }
    
    public List<Donations> deleteDonation(Donations m){
        donations.remove(m);
        this.getOrganizationDirectory().getOrganizationList().remove(m);
        return donations;
    }
   
}
