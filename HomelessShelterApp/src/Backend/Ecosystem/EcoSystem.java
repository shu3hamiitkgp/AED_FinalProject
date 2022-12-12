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
import java.util.ArrayList;

/**
 *
 * @author shubhamgoyal
 */
public class EcoSystem {
    
    private ArrayList<Network> networkList;
    String name;
    
//    public static EcoSystem getInstance(){
//        if(this==null){
//            this=new EcoSystem();
//        }
//        return business;
//    }
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    public Network createNetwork(Network network){
        networkList.add(network);
        return network;
    }
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        ArrayList<Role> roleList=new ArrayList<Role>();
//        roleList.add(new SystemAdminRole());
//        return roleList;
//    }
    public EcoSystem(){
        //super(null);
        networkList=new ArrayList<Network>();
        /*Network network=new Network();
        network.setName("Boston");
        networkList.add(network);*/
    }
    
//    public static void setInstance(EcoSystem system) {
//        this = system;
//    }

    public ArrayList<Network> getNetworkList() {
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
    
}
