/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.DB4OUtil;

import Backend.Ecosystem.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Enterprise.EnterpriseDirectory;
import Backend.Enterprise.Health;
import Backend.Enterprise.PartTimeEmployement;
import Backend.Enterprise.Resources;
import Backend.Enterprise.Shelter;
import Backend.Network.Network;
import Backend.Organization.Organization;
import Backend.Organization.OrganizationDirectory;
import Backend.Organization.ShelterNGO;
import Backend.UserAccount.UserAccountDirectory;
import com.db4o.Db4oEmbedded;
/**
 *
 * @author Megha Patel
 */
public class Driver {
    EcoSystem system;
    Network network;
    Shelter shelters;
    Resources resources;
    Health health;
    PartTimeEmployement jobs;
    OrganizationDirectory organizations;
    UserAccountDirectory users;
      
    
    public Driver(){
        system = new EcoSystem();
        Network boston = new Network("Boston");
        system.createNetwork(boston);
        EnterpriseDirectory enterprises = boston.getEnterpriseDirectory();
        enterprises.createAndAddEnterprise("Shelters", Enterprise.EnterpriseType.Shelter);
        enterprises.createAndAddEnterprise("Resources", Enterprise.EnterpriseType.Resources);
        enterprises.createAndAddEnterprise("Hospitals", Enterprise.EnterpriseType.Health);
        enterprises.createAndAddEnterprise("Jobs", Enterprise.EnterpriseType.PartTimeEmployement);
        
        Organization sh1 = new ShelterNGO("Shelter1");
        Organization sh2 = new ShelterNGO("Shelter2");
        Organization sh3 = new ShelterNGO("Shelter3");
        Organization sh4 = new ShelterNGO("Shelter4");
        Organization sh5 = new ShelterNGO("Shelter5");
        
        Organization sh6 = new ShelterNGO("Shelter6");
        Organization sh7 = new ShelterNGO("Shelter7");
        Organization sh8 = new ShelterNGO("Shelter8");
        Organization sh9 = new ShelterNGO("Shelter9");
        Organization sh10 = new ShelterNGO("Shelter10");
        
        Organization sh11 = new ShelterNGO("Shelter11");
        Organization sh12 = new ShelterNGO("Shelter12");
        Organization sh13 = new ShelterNGO("Shelter13");
        Organization sh14 = new ShelterNGO("Shelter14");
        Organization sh15 = new ShelterNGO("Shelter15");
    }
    
    public void run(){
    
    
    }
    
}
