/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Employee.EmployeeDirectory;
import Backend.Location.Location;
import Backend.Role.Role;
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
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    public ArrayList<Role> roles;
    private Location locationPoint;
    private double nearestLocationPoint;
    private Type type;

    
    public enum Type{
        Admin("admin Organization"), 
        Collection("Collection Organization"), 
        Company("Company Organization"), 
        NGO("NGO Organization"), 
        Private("Private Organization"), 
        Medical("Hospital Organization"), 
        Counselling("Counselling Organization"), 
        Donations("Fire Safety Organization"), 
        Meals("Medicines Organization"), 
        Jobs("Jobs Organization"); 
//        IncidentReportingAgency("Report Organization"), 
//        DisasterManagementTeam("Disaster Management Organization"),
//        FundsOrganization("FundsOrganization");
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
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        roles = new ArrayList<Role>();
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


    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
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
