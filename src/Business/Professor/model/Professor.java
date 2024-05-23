/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Professor.model;

import Business.Profile.Profile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Hemant
 */
public class Professor extends Profile{
    private String name;
    private String age;
    private String gender;
    private String email;
    private String contact;
    private String username;
    private String password;
    private String city;
    private String state;
    private String country;
    private CourseHistory courseHistory;
    private String reputation;

     public Professor(){
        
        this.courseHistory=new CourseHistory();
    }
     
    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }

    public CourseHistory getCourseHistory() {
        return courseHistory;
    }

    public void setCourseHistory(CourseHistory courseHistory) {
        this.courseHistory = courseHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return name;
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
    public String getRole() {
       return "Professor";
    }
    
}
