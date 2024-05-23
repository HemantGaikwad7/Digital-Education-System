/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student.model;

import java.util.ArrayList;

/**
 *
 * @author Hemant
 */
public class StudentDirectory {
     private ArrayList<Student> studentList;
         private boolean isSampleDataGenerated = false; // Flag to check if sample data is already generated REMOVE LATER


    public StudentDirectory() {
        this.studentList = new ArrayList<>();
        generateSampleStudents(); 
    }

    
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    public Student addStudent(){
        Student student = new Student();
        studentList.add(student);
        return student;        
    }
    
    public void deleteStudent(Student student){
        studentList.remove(student);
    }
    
    public Student searchStudent(String NUID){
    if (NUID == null) {
        // If the provided NUID is null, no need to search
        return null;
    }

    for(Student student: studentList){
        // Check if student's NUID is not null and equals the provided NUID
        if(NUID.equals(student.getNUID())){
            return student;
        }
    }
    return null; // Return null if no matching student is found
}



 // Method to generate sample students
    public void generateSampleStudents() {
        if (!isSampleDataGenerated) {
            studentList.clear();
            for (int i = 1; i < 10; i++) {
                Student student = new Student();
                student.setName("Student " + i);
                student.setAge("20"); // Sample age
                student.setGender("Male/Female/Other"); // Sample gender
                student.setEmail("student" + i + "@university.com");
                student.setContact("1234567890"); // Sample contact
                student.setAdmissionTerm("Fall 2023"); // Sample term
                student.setProgram("Sample Program"); // Sample program
                student.setNUID("00123" + i);
                student.setUsername("stu" + i);
                student.setPassword("password" + i); 
                student.setAddress("Address" + i);
                student.setCity("City" + i);
                student.setState("State" + i);
                student.setCountry("Country" + i);
                student.setCode(i); // Sample code
                student.setGraduated(false);
                student.setReadyForGraduation(false);
                studentList.add(student);
                
            }
            isSampleDataGenerated = true;
        }
    }

}



