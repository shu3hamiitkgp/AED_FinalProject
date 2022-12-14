/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.WorkQueue;

import Backend.Enterprise.Enterprise;
import Backend.Enterprise.Shelter;
//import Backend.Location.Location;
import Backend.Network.Network;
import Backend.Organization.Organization;

/**
 *
 * @author Sahil
 */
public class HomelessAllocation extends WorkRequest {
    
    private Network network;
    private Enterprise enterprise;
    private Organization.Type orgType;
    private Shelter shelter;
//    private String gender;
    private String name;
    private String orgName;
//    private String /userCity;
//    private String userContact;
//    private Location userLocationPoint;
    

    
    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization.Type getOrgType() {
        return orgType;
    }

    public void setOrgType(Organization.Type orgType) {
        this.orgType = orgType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    
//    public String getUserCity() {
//        return userCity;
//    }
//
//    public void setUserCity(String userCity) {
//        this.userCity = userCity;
//    }
//
//    public String getUserContact() {
//        return userContact;
//    }
//
//    public void setUserContact(String userContact) {
//        this.userContact = userContact;
//    }

//    public Location getUserLocationPoint() {
//        return userLocationPoint;
//    }
//
//    public void setUserLocationPoint(Location userLocationPoint) {
//        this.userLocationPoint = userLocationPoint;
//    }
    
//        public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getUserID() {
//        return userID;
//    }
//
//    public void setUserID(String userID) {
//        this.userID = userID;
//    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
    
    
}
