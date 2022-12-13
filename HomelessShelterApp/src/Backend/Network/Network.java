/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Network;

import Backend.Enterprise.EnterpriseDirectory;

/**
 *
 * @author shubhamgoyal
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(String name){
        this.name = name;
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    
    @Override
    public String toString(){
        return name;
    } 
    
}
