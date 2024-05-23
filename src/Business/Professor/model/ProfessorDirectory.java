/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Professor.model;

import java.util.ArrayList;

/**
 *
 * @author Hemant
 */
public class ProfessorDirectory {
   
    private ArrayList<Professor> professorList;
     private boolean isSampleDataGenerated = false; // New flag REMOVE LATER


    public ProfessorDirectory() {
        this.professorList = new ArrayList<Professor>();
    }
    
    public ArrayList<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(ArrayList<Professor> professorList) {
        this.professorList = professorList;
    }
    
    public Professor addProfessor(){
        Professor professor = new Professor();
        professorList.add(professor);
        return professor;
    }
    
    public void deleteProfessor(Professor professor){
        professorList.remove(professor);
    }
    
    
    public Professor searchProfessor(String profName){
    if (profName == null) {
        // If the provided profName is null, no need to search
        return null;
    }

    for(Professor professor: professorList){
        // Check if student's profName is not null and equals the provided NUID
        if(profName.equals(professor.getName())){
            return professor;
        }
    }
    return null; // Return null if no matching student is found
    
    
}
    
public boolean isDuplicateProfessor(String name, String email, String username, Professor currentProfessor) {
        if (name == null || email == null || username == null) {
            // If any of the fields to check are null, return false as there's nothing to check
            return false;
        }

        for (Professor professor : professorList) {
            // Check against other professors excluding the current professor
            if (professor != currentProfessor) {
                boolean isSameName = name.equals(professor.getName());
                boolean isSameEmail = email.equals(professor.getEmail());
                boolean isSameUsername = username.equals(professor.getUsername());

                if (isSameName || isSameEmail || isSameUsername) {
                    return true; // Duplicate found
                }
            }
        }
        return false; // No duplicates
    }


// Sample professors REMOVE LATER
public void generateSampleProfessors() {
    if (!isSampleDataGenerated) {
        
        for (int i = 1; i <=10; i++) {
            Professor professor = new Professor();
            professor.setName("Professor " + i);
            professor.setAge("40");  // Sample age
            professor.setGender("Male");  // Sample gender
            professor.setEmail("professor" + i + "@university.com");
            professor.setContact("1234567890");  // Sample contact
            professor.setUsername("prof" + i);
            professor.setPassword("password" + i);  // Consider hashing passwords
            professor.setCity("City" + i);
            professor.setState("State" + i);
            professor.setCountry("Country" + i);
            // Add more fields as needed

            professorList.add(professor);
        }
        isSampleDataGenerated = true; // Ensure this is set after adding the professors
    }
}
}
