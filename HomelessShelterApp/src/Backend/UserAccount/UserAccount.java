
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.UserAccount;

import Backend.WorkQueue.WorkQueue;

/**
 *
 * @author shubhamgoyal
 */
public class UserAccount {
    
    private String username;
    private String password;
    private String role;
    private WorkQueue workQueue;

    public UserAccount(String username, String password, String role) {
        workQueue = new WorkQueue();
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    public boolean isMatch(String user) {
        if(this.username == null){
            return false;
        }else{
            return this.getUsername().equals(user);
        }
    }

    @Override
    public String toString() {
        return username;
    }
    
}
