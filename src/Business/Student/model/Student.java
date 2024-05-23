/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student.model;

import Business.Profile.Profile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Hemant
 */
public class Student extends Profile{
    //This variable stores name
    private String name;
    private String age;
    private String gender;
    private String email;
    private String contact;
    private String admissionTerm;
    private String NUID;
    private String username;
    private String password;
    private String address;
    private String city;
    private String state;
    private String country;
    private int code;
    private String program;
    private boolean readyForGraduation;
    private boolean graduated;
    private ArrayList<Integer> registerCoursesList; 
    private HashMap<String,String> completedCoursesList; 
    private HashMap<String,String> employerFeedback;

  public Student(){
        this.registerCoursesList=new ArrayList<Integer>();
        this.completedCoursesList=new HashMap<String,String>();
        this.employerFeedback=new HashMap<String,String>();
    }
  
    public HashMap<String, String> getEmployerFeedback() {
        return employerFeedback;
    }

    public void setEmployerFeedback(HashMap<String, String> employerFeedback) {
        this.employerFeedback = employerFeedback;
    }
    
    public void addEmployerFeedback(String employerName,String feedback){
    this.employerFeedback.put(employerName,feedback);
    }
    
    public boolean isReadyForGraduation() {
        return readyForGraduation;
    }

    public void setReadyForGraduation(boolean readyForGraduation) {
        this.readyForGraduation = readyForGraduation;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public ArrayList<Integer> getRegisterCoursesList() {
        return registerCoursesList;
    }

    public void setRegisterCoursesList(ArrayList<Integer> registerCoursesList) {
        this.registerCoursesList = registerCoursesList;
    }

    public HashMap<String, String> getCompletedCoursesList() {
        return completedCoursesList;
    }

    public void setCompletedCoursesList(HashMap<String, String> completedCoursesList) {
        this.completedCoursesList = completedCoursesList;
    }

      public void addCompletedCoursesList(String crn, String grade) {
        this.completedCoursesList.put(crn,grade);
    }
  
    public ArrayList<Integer> getCoursesList() {
        return registerCoursesList;
    }

    public void setCoursesList(ArrayList<Integer> coursesList) {
        this.registerCoursesList = coursesList;
    }

    public void addCourse(Integer courseCrn ){
        this.registerCoursesList.add(courseCrn);
    }
    
     public void removeCourse(Integer courseCrn ){
        this.registerCoursesList.remove(courseCrn);
    }
    
    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
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

    public String getAdmissionTerm() {
        return admissionTerm;
    }

    public void setAdmissionTerm(String admissionTerm) {
        this.admissionTerm = admissionTerm;
    }

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
    return "Student";   
    }
    
}
