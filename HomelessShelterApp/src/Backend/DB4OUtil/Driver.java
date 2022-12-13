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
import Backend.Location.Location;
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
        
        Location l1 = new Location(42.3601, 71.0589);
        Location l2 = new Location(42.3708, 71.1243);
        Location l3 = new Location(42.3601, 71.0589);
        Location l4 = new Location(42.3601, 71.1231);
        Location l5 = new Location(42.3601, 71.0589);
        Location l6 = new Location(42.3601, 71.0589);
        Location l7 = new Location(42.3601, 71.456);
        Location l8 = new Location(42.2344, 71.0589);
        Location l9 = new Location(42.2334, 71.0589);
        Location l10 = new Location(42.3602, 71.0574);
        Location l11 = new Location(42.3603, 71.0575);
        Location l12 = new Location(42.3604, 71.0576);
        Location l13 = new Location(42.3605, 71.0577);
        Location l14 = new Location(42.3606, 71.0578);
        Location l15 = new Location(42.3607, 71.0579);
        Location l16 = new Location(42.3608, 71.0580);
        Location l17 = new Location(42.3609, 71.0581);
        Location l18 = new Location(42.3600, 71.0582);
        Location l19 = new Location(42.3599, 71.0583);
        Location l20 = new Location(42.3598, 71.0584);
        Location l21 = new Location(42.3597, 71.0585);
        Location l22 = new Location(42.3696, 71.0586);
        Location l23 = new Location(42.3596, 71.0587);
        Location l24 = new Location(42.3595, 71.0588);

        
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.NGOShelter, "Shelter1", l1);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.NGOShelter, "Shelter2", l2);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.NGOShelter, "Shelter3", l3);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.NGOShelter, "Shelter4", l4);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.NGOShelter, "Shelter5", l5);
        
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.PrivateShelter, "Shelter6", l6);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.GovernmentShelter, "Shelter7", l7);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.GovernmentShelter, "Shelter8", l8);
        
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.PrivateShelter, "Shelter9", l9);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.PrivateShelter, "Shelter10", l22);
        
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Counselling, "Shelter1", l1);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Counselling, "Shelter2", l21);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Medical, "Shelter3", l23);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Medical, "Shelter4", l24);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Medical, "Shelter5", l5);
        
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Donations, "Shelter6", l10);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Donations, "Shelter7", l11);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Meals, "Shelter8", l12);
        
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Meals, "Shelter9", l13);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Meals, "Shelter10", l14);
        
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Meals, "Shelter1", l14);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Jobs, "Shelter2", l15);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Jobs, "Shelter3", l16);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Jobs, "Shelter4", l17);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Jobs, "Shelter5", l18);
        
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Donations, "Shelter6", l19);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Donations, "Shelter7", l20);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Meals, "Shelter8", l8);
        
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Meals, "Shelter9", l9);
        enterprises.getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.Meals, "Shelter10", l10);
        
        
        
        
    }
    
    public void run(){
    
    
    }
    
}
