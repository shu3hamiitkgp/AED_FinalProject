/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;
import Backend.Organization.Counselling;
import Backend.Organization.Medical;
import Backend.Role.Role;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sahil
 */
public class Health extends Enterprise {
    List<Health> health;
    
public Health(String name) {
super(name, Enterprise.EnterpriseType.Health);
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
