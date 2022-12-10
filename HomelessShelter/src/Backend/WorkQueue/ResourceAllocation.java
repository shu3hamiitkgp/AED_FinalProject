/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.WorkQueue;

import Backend.Employee.EmployeeDirectory;
import Backend.Enterprise.Enterprise;
import Backend.Location.Location;
import Backend.Network.Network;
import Backend.Organization.Organization;
import Backend.Role.Role;
import Backend.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Megha Patel
 */
public class ResourceAllocation extends WorkRequest{
    private String testResult;
    private Network network;
    private Enterprise enterprise;
    private Organization.Type orgType;
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private double nearestLocationPoint;
    private Organization.Type type;
    private int phone;
    private String website;
    private String address;
    private String orgName;
    private String userName;
    private String userPassword;
    private String userEmailId;
    private String userCity;
    private String userContact;
    private Location userLocationPoint;
    private String contactCarrierName;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

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

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        ResourceAllocation.counter = counter;
    }

    public double getNearestLocationPoint() {
        return nearestLocationPoint;
    }

    public void setNearestLocationPoint(double nearestLocationPoint) {
        this.nearestLocationPoint = nearestLocationPoint;
    }

    public Organization.Type getType() {
        return type;
    }

    public void setType(Organization.Type type) {
        this.type = type;
    }

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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public Location getUserLocationPoint() {
        return userLocationPoint;
    }

    public void setUserLocationPoint(Location userLocationPoint) {
        this.userLocationPoint = userLocationPoint;
    }

    public String getContactCarrierName() {
        return contactCarrierName;
    }

    public void setContactCarrierName(String contactCarrierName) {
        this.contactCarrierName = contactCarrierName;
    }

    
    
}
