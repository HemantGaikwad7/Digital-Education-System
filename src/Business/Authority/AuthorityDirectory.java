/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Authority;

import java.util.ArrayList;

/**
 *
 * @author Hemant
 */
public class AuthorityDirectory {
      private ArrayList<AuthorityModel> authorityList;

    public AuthorityDirectory() {
        authorityList = new ArrayList<>();
    }

    
    
    public ArrayList<AuthorityModel> getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(ArrayList<AuthorityModel> authorityList) {
        this.authorityList = authorityList;
    }
    
    public void deleteAuthority(AuthorityModel authority){
        authorityList.remove(authority);
    }
    
    public AuthorityModel addAuthority(){
        AuthorityModel authority = new AuthorityModel();
        authorityList.add(authority);
        return authority; 
    }
    
            public AuthorityModel searchAuthority(String authName){
    if (authName == null) {
        // If the provided empName is null, no need to search
        return null;
    }

    for(AuthorityModel authority: authorityList){
        // Check if student's empName is not null and equals the provided NUID
        if(authName.equals(authority.getName())){
            return authority;
        }
    }
    return null; // Return null if no matching student is found
        }
    
    public boolean isDuplicateAuthority(String name, String username, AuthorityModel currentAuthority) {
    if (name == null ||  username == null) {
        // If any of the fields to check are null, return false as there's nothing to check
        return false;
    }

    for (AuthorityModel authority : authorityList) {
        // Check against other employers excluding the current employer
        if (authority != currentAuthority) {
            boolean isSameName = name.equalsIgnoreCase(authority.getName());
            boolean isSameUsername = username.equalsIgnoreCase(authority.getUsername());

            if (isSameName || isSameUsername) {
                return true; // Duplicate found
            }
        }
    }
    return false; // No duplicates
}
   
    public void generateSampleAuthorities() {
    // Check if sample data is already generated to avoid duplicates
    if (authorityList.isEmpty()) {
        String[] sampleNames = {"Authority A", "Authority B", "Authority C", "Authority D", "Authority E"};
        String[] sampleCompanies = {"Company X", "Company Y", "Company Z", "Company W", "Company V"};

        for (int i = 1; i < sampleNames.length; i++) {
            AuthorityModel authority = new AuthorityModel();
            authority.setName(sampleNames[i]);
            authority.setCompany(sampleCompanies[i]);
            authority.setUsername("authority" + i);
            authority.setPassword("password" + i); 

            authorityList.add(authority);
        }
    }
}
}
