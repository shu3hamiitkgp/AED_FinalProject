/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Location.Location;
import Backend.UserAccount.UserAccountDirectory;
import Backend.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author shubhamgoyal
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    //private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private Location locationPoint;
    private double nearestLocationPoint;
    private Type type;
    private int phone;
    private String website;
    private String address;

    
    public enum Type{
        Admin("Admin Organization"), 
        GovernmentShelter("Governement Organization"), 
        NGOShelter("NGO Organization"), 
        PrivateShelter("Private Organization"), 
        Medical("Medical Organization"), 
        Counselling("Counselling Organization"), 
        Donations("Donations Organization"), 
        Meals("Meals Organization"), 
        Jobs("Jobs Organization"); 
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        //userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Location getLocationPoint() {
        return locationPoint;
    }

    public void setLocationPoint(Location locationPoint) {
        this.locationPoint = locationPoint;
    }
    
//    public UserAccountDirectory getUserAccountDirectory() {
//        return userAccountDirectory;
//    }

    public int getOrganizationID() {
        return organizationID;
    }

  
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

//    public ArrayList<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(ArrayList<Role> roles) {
//        this.roles = roles;
//    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
    
    public double getOrganizationDistanceFromScene(Location point) {
        double sceneLatitude = point.getLatitude();
        double sceneLongitude = point.getLongitude();
        double organizationLatitude = locationPoint.getLatitude();
        double organizationLongitude = locationPoint.getLongitude();
        
        double theta = sceneLongitude - organizationLongitude;
			double dist = Math.sin(Math.toRadians(sceneLatitude)) * Math.sin(Math.toRadians(organizationLatitude)) + Math.cos(Math.toRadians(sceneLatitude)) * Math.cos(Math.toRadians(organizationLatitude)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515;
        
        
        return dist;
    }    

    public double getNearestLocationPoint() {
        return nearestLocationPoint;
    }

    public void setNearestLocationPoint(double nearestLocationPoint) {
        this.nearestLocationPoint = nearestLocationPoint;
    }
}
