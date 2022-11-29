/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

import Backend.Organization.Organization;
import Backend.Organization.OrganizationDirectory;

/**
 *
 * @author shubhamgoyal
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Organization organization;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }


    public enum EnterpriseType{
        VoluntaryOperatingUnit("Voluntary Operating Unit"), EmergencyOperatingUnit("Emergency Response Unit"), IncidentOperatingUnit("Incident Operating Unit")/*, FundsOperatingUnit("Funds Operating Unit")*/; 
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
    
}
