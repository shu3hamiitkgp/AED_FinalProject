/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author shubhamgoyal
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount getUser(String username) {
        for (UserAccount p : userAccountList) {

            if (p.isMatch(username)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList) {
            System.out.println("---->>>> " + username + " == " + ua.getUsername());
            System.out.println("---->>>> " + password + " == " + ua.getPassword());
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, String role){
        UserAccount userAccount = new UserAccount(username, password, role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
