/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

import Backend.Organization.Donations;
import Backend.Organization.Meals;
import Backend.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Megha Patel
 */
public class Resources extends Enterprise {
    List<Meals> meals;
    List<Donations> donations;

    public Resources(String name, EnterpriseType type) {
        super(name, type);
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
        return meals;
    }
    
    public List<Meals> deleteMeal(Meals m){
        meals.remove(m);
        return meals;
    }
    
    public List<Donations> addDonations(Donations m){
        donations.add(m);
        return donations;
    }
    
    public List<Donations> deleteDonation(Donations m){
        donations.remove(m);
        return donations;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
