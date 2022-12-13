/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Ecosystem;

import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.Organization;
//import Backend.Role.Role;
//import Backend.Role.SystemAdminRole;
import Backend.UserAccount.UserAccount;
import Backend.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shubhamgoyal
 */
public class EcoSystem {
    
    private List<Network> networkList;
    UserAccountDirectory directory;
    String name;
    
    private static EcoSystem business;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network("Unnamed");
        networkList.add(network);
        return network;
    }
    public Network createNetwork(Network network){
        networkList.add(network);
        return network;
    }
    public static void setInstance(EcoSystem system) {
        business = system;
    }

    public EcoSystem(){
        networkList=new ArrayList<Network>();
        directory = new UserAccountDirectory();
    }


    public List<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
        
//    //business null in above method, so changing it
//    public boolean checkIfUserIsUnique(String userName){
//        for (Network network : networkList) {
//            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
//                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
//                    if (ua.getUsername().equalsIgnoreCase(userName)) {
//                        return false;
//                    }
//                }
//                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
//                        if (ua.getUsername().equalsIgnoreCase(userName)) {
//                            return false;
//                        }
//                    }
//                }
//            }
//        }
//
//        return true;
//        
//    }
//    
//    public boolean isUnique(String name){
//        for(Network network : networkList){
//            if(network.getName().equalsIgnoreCase(name)){
//                return false;
//            }
//        }
//        return true;
//    }

    public UserAccountDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(UserAccountDirectory directory) {
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
