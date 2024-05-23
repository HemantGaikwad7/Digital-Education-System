/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employer;

import java.util.ArrayList;

/**
 *
 * @author Hemant
 */
public class EmployerDirectory {
     private ArrayList<EmployerModel> employerList;
     private boolean isSampleDataGenerated = false; // REMOVE LATER

    public EmployerDirectory() {
        this.employerList = new ArrayList<>();
    }

    
    
    public ArrayList<EmployerModel> getEmployerList() {
        return employerList;
    }

    public void setEmployerList(ArrayList<EmployerModel> employerList) {
        this.employerList = employerList;
    }
    
    public void deleteEmploye(EmployerModel employer){
        employerList.remove(employer);
    }
    
    public EmployerModel addEmployer(){
        EmployerModel employer = new EmployerModel();
        employerList.add(employer);
        return employer;
    }
    
        public EmployerModel searchEmployer(String empName){
    if (empName == null) {
        // If the provided empName is null, no need to search
        return null;
    }

    for(EmployerModel employer: employerList){
        // Check if student's empName is not null and equals the provided NUID
        if(empName.equals(employer.getName())){
            return employer;
        }
    }
    return null; // Return null if no matching student is found
        }
        
public boolean isDuplicateEmployer(String name, String emailID, String username, EmployerModel currentEmployer) {
    if (name == null || emailID == null || username == null) {
        // If any of the fields to check are null, return false as there's nothing to check
        return false;
    }

    for (EmployerModel employer : employerList) {
        // Check against other employers excluding the current employer
        if (employer != currentEmployer) {
            boolean isSameName = name.equalsIgnoreCase(employer.getName());
            boolean isSameEmail = emailID.equalsIgnoreCase(employer.getEmailID());
            boolean isSameUsername = username.equalsIgnoreCase(employer.getUsername());

            if (isSameName || isSameEmail || isSameUsername) {
                return true; // Duplicate found
            }
        }
    }
    return false; // No duplicates
}

//REMOVE LATER
public void generateSampleEmployers() {
    if (!isSampleDataGenerated) {
            for (int i = 1; i < 5; i++) {
            EmployerModel employer = new EmployerModel();
            employer.setName("Employer " + i);
            employer.setCompany("Company " + i);
            employer.setEmailID("employer" + i + "@company.com");
            employer.setLocation("Location " + i);
            employer.setDesignation("Designation " + i);
            employer.setUsername("employer" + i);
            employer.setPassword("password" + i); // Consider hashing passwords
            // Add more fields as needed

            employerList.add(employer);
        }
        isSampleDataGenerated = true; // Ensure this is set after adding the employers
    }
}
    
}
