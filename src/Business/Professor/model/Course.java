/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Professor.model;

import Business.Student.model.Student;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Hemant
 */
public class Course {

    //This variable stores CRN of the course
    private int CRN;

    //This variable stores name of the course
    private String courseName;

    //This variable stores start date
    private String startDate;

    //This variable stores end date
    private String endDate;

    //This variable stores day 
    private String day;

    //This variable stores time
    private String time;

    //This variable stores region
    private String region;

    //This variable stores language
    private String language;

    //This variable stores if course is completed
    private boolean completed;

    //This variable stores name of the teaching faculty
    private String profName;

    private String profRepo;

    //List of students enrolled for the course
    private ArrayList<Student> enrolledStudents;

    public Course() {
        this.enrolledStudents = new ArrayList<Student>();
    }

    public String getProfRepo() {
        return profRepo;
    }

    public void setProfRepo(String profRepo) {
        this.profRepo = profRepo;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public void addStudents(Student enrolledStudents) {
        this.enrolledStudents.add(enrolledStudents);
    }

    public void removeStudents(Student enrolledStudents) {
        this.enrolledStudents.remove(enrolledStudents);
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public int getCRN() {
        return CRN;
    }

    public void setCRN(int CRN) {
        this.CRN = CRN;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return courseName;
    }
}
