/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;
import Backend.Organization.Counceling;
import Backend.Organization.Medical;
import Backend.Role.Role;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sahil
 */
//<<<<<<< HEAD
//public class Health extends Enterprise{
//     
//    //private String health;
//    List<Counselling> rehabs;
//    List<Medical> hospitals;
//    
//    public Health(String name, EnterpriseType type) {
//        super(name, type);
//        //health = name;
//        rehabs = new ArrayList<>();
//        hospitals = new ArrayList<>();
//    }
//
//    public List<Counselling> getRehabs() {
//        return rehabs;
//    }
//
//    public void setRehabs(List<Counselling> rehabs) {
//        this.rehabs = rehabs;
//    }
//
//    public List<Medical> getHospitals() {
//        return hospitals;
//    }
//
//    public void setHospitals(List<Medical> hospitals) {
//        this.hospitals = hospitals;
//    }
//    
//    public List<Counselling> addRehab(Counceling c){
//        rehabs.add(c);
//        return rehabs;
//    }
//    
//    public List<Counselling> deleteRehab(Counceling c){
//        rehabs.remove(c);
//        return rehabs;
//    }
//    
//    public List<Medical> addHospital(Medical c){
//        hospitals.add(c);
//        return hospitals;
//    }
//    
//    public List<Medical> deleteHospital(Medical c){
//        hospitals.remove(c);
//        return hospitals;
//    }
//        
//
//    @Override
//=======
public class Health extends Enterprise {
    List<Health> health;
    
public Health(String name, EnterpriseType type) {
super(name, type);
health = new ArrayList<Health>();

    }

public List<Health> getHealth() {
        return health;
    }

    public void setHealth(List<Health> Health) {
        this.health = health;
    }

        public List<Health> addHealth(Health h){
        health.add(h);
        return health;
    }
    
    public List<Health> deleteHealth(Health h){
        health.remove(h);
        return health;

}
//>>>>>>> 51ae23c36845ff9cdf2da2528acd23f6a4d134a2
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
