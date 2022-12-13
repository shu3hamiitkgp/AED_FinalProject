/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
import Backend.UserAccount.UserAccount;
import Backend.UserAccount.UserAccountDirectory;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 * @author Megha Patel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EcoSystem system = new EcoSystem();
        Network boston = new Network("Boston");
        system.createNetwork(boston);
        System.out.println("c");
        EnterpriseDirectory enterprises = boston.getEnterpriseDirectory(); 
        System.out.println("b");
        String l1 = new String("71 SILVER ST GREENFIELD MA 01301-1221 USA");
        String l2 = new String("16 FOREST LN NORTH GRAFTON MA 01536-1675 USA");
        String l3 = new String("2 MIDDLESEX AVE NATICK MA 01760-4508 USA");
        String l4 = new String("100 AMESBURY ST LAWRENCE MA 01840-1360 USA");
        String l5 = new String("32 CABOT ST LOWELL MA 01854-3905 USA");
        String l6 = new String("1459 VFW PKWY WEST ROXBURY MA 02132-5427 USA");
        String l7 = new String("149 HANCOCK ST CAMBRIDGE MA 02139-1753 USA");
        String l8 = new String("2091 WASHINGTON ST BRAINTREE MA 02184-8660 USA");
        String l9 = new String("90 HIGH ST CARVER MA 02330-1016 USA");
        String l10 = new String("PO BOX 618 SOUTH YARMOUTH MA 02664-0618 USA");
        String l11 = new String("142 THISTLE DR CENTERVILLE MA 02632-2042 USA");
        String l12 = new String("1 SAMOSET DR HANOVER MA 02339-2542 USA");
       
        System.out.println(enterprises.getShelters().toString());
        
        
        
        enterprises.getShelters().addShelter(Organization.Type.NGOShelter, "Shelter1", l1);
        enterprises.getShelters().addShelter(Organization.Type.NGOShelter, "Shelter2", l2);
        enterprises.getShelters().addShelter(Organization.Type.NGOShelter, "Shelter3", l3);
        enterprises.getShelters().addShelter(Organization.Type.NGOShelter, "Shelter4", l4);
        enterprises.getShelters().addShelter(Organization.Type.NGOShelter, "Shelter5", l5);
        
        enterprises.getShelters().addShelter(Organization.Type.PrivateShelter, "Shelter6", l6);
        enterprises.getShelters().addShelter(Organization.Type.GovernmentShelter, "Shelter7", l7);
        enterprises.getShelters().addShelter(Organization.Type.GovernmentShelter, "Shelter8", l8);
        
        enterprises.getShelters().addShelter(Organization.Type.PrivateShelter, "Shelter9", l9);
        enterprises.getShelters().addShelter(Organization.Type.PrivateShelter, "Shelter10", l10);
        
        enterprises.getHospitals().addHealth(Organization.Type.Counselling, "Shelter1", l1);
        enterprises.getHospitals().addHealth(Organization.Type.Counselling, "Shelter2", l7);
        enterprises.getHospitals().addHealth(Organization.Type.Medical, "Shelter3", l1);
        enterprises.getHospitals().addHealth(Organization.Type.Medical, "Shelter4", l2);
        enterprises.getHospitals().addHealth(Organization.Type.Medical, "Shelter5", l3);
        
        enterprises.getResources().addResources(Organization.Type.Donations, "Shelter6", l4);
        enterprises.getResources().addResources(Organization.Type.Donations, "Shelter7", l5);
        enterprises.getResources().addResources(Organization.Type.Meals, "Shelter8", l6);
        
        enterprises.getResources().addResources(Organization.Type.Meals, "Shelter9", l7);
        enterprises.getResources().addResources(Organization.Type.Meals, "Shelter10", l8);
        
        enterprises.getResources().addResources(Organization.Type.Meals, "Shelter1", l9);
        enterprises.getJobs().addJob(Organization.Type.Jobs, "Shelter2", l1);
        enterprises.getJobs().addJob(Organization.Type.Jobs, "Shelter3", l2);
        enterprises.getJobs().addJob(Organization.Type.Jobs, "Shelter4", l3);
        enterprises.getJobs().addJob(Organization.Type.Jobs, "Shelter5", l4);
        
        enterprises.getResources().addResources(Organization.Type.Donations, "Shelter6", l4);
        enterprises.getResources().addResources(Organization.Type.Donations, "Shelter7", l5);
        enterprises.getResources().addResources(Organization.Type.Meals, "Shelter8", l6);
        
        enterprises.getResources().addResources(Organization.Type.Meals, "Shelter9", l12);
        enterprises.getResources().addResources(Organization.Type.Meals, "Shelter10", l11);
               
        UserAccountDirectory users = system.getDirectory();
        users.createUserAccount("system", "Patel", "SystemAdmin");
        users.createUserAccount("meal", "Patel", "MealManager");
        users.createUserAccount("shelter", "Patel", "ShelterManager");
        users.createUserAccount("volunteer", "Patel", "Volunteers");
        users.createUserAccount("health", "Patel", "HealthManager");
        users.createUserAccount("employment", "Patel", "EmploymentManager");
        users.createUserAccount("homeless", "Patel", "HomelessPerson");
        users.createUserAccount("resource", "Patel", "ResourceDonator");
        
        System.out.print("hello");
        ObjectContainer db = Db4oEmbedded.openFile("EcoSystem.db4o");
        
        db.store(system);
        db.close();
    }
    
}
