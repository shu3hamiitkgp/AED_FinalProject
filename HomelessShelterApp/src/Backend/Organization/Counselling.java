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
public class Counselling extends Organization{
    List<String> specialties;
    double fees;
    boolean acceptsMedicare;
    boolean addiction;
    boolean mentalHealth;
    
    public Counselling(String name) {
        super(name);
        specialties = new ArrayList<>();
    }

    public List<String> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<String> specialties) {
        this.specialties = specialties;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public boolean isAcceptsMedicare() {
        return acceptsMedicare;
    }

    public void setAcceptsMedicare(boolean acceptsMedicare) {
        this.acceptsMedicare = acceptsMedicare;
    }

    public boolean isAddiction() {
        return addiction;
    }

    public void setAddiction(boolean addiction) {
        this.addiction = addiction;
    }

    public boolean isMentalHealth() {
        return mentalHealth;
    }

    public void setMentalHealth(boolean mentalHealth) {
        this.mentalHealth = mentalHealth;
    }   
    
}
