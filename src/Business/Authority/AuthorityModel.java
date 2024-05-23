/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Authority;

import Business.Profile.Profile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Hemant
 */
public class AuthorityModel extends Profile{
    private String name;
    private String company;
    private String username;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
        this.password = hashPassword(password);
    }

    public boolean isPasswordMatching(String password){
        return this.password.equals(hashPassword(password));
    }
    
    private String hashPassword(String password) { 
        try {
            MessageDigest md;
            md = MessageDigest.getInstance("SHA");
            md.update(password.getBytes());
            byte[] rbt = md.digest();
            StringBuilder pass = new StringBuilder();

            for(byte b: rbt){
                pass.append(String.format("%02x", b));
               
            return pass.toString(); 
            } 
        } 
            catch (NoSuchAlgorithmException ex) {  
        }
       return null;
        }
    
    
    
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getRole() {
    return "Authority";   
    }
}
